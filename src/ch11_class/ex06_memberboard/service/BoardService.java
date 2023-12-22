package ch11_class.ex06_memberboard.service;

import ch11_class.ex06_memberboard.common.CommonVariables;
import ch11_class.ex06_memberboard.dto.BoardDTO;
import ch11_class.ex06_memberboard.repository.BoardRepository;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner scanner = new Scanner(System.in);

    public void write() {
        System.out.print("제목을 입력하세요");
        String boardTitle = scanner.next();
        System.out.print("내용을 입력하세요");
        String boardContents = scanner.next();
        BoardDTO boardDTO = new BoardDTO(boardTitle, CommonVariables.loginEmail, boardContents);
        boolean result = boardRepository.write(boardDTO);
        if (result) {
            System.out.println("작성이 완료되었습니다.");
        } else {
            System.out.println("아이쿠! 잉크가 엎어져버렸어요~ 저런저런~");
            System.out.println("다시 작성해주세요~");
        }
    }

    public void boardList() {
        List<BoardDTO> boardDTOList = boardRepository.boardList();
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println("boardDTO = " + boardDTO);
        }
    }

    public void findById() {
        System.out.print("찾으실 글의 id를 입력해주세요");
        Long id = scanner.nextLong();
        boolean result = boardRepository.updateHits(id);
        if (result) {
            BoardDTO boardDTO = boardRepository.findByID(id);
            System.out.println("boardDTO = " + boardDTO);
        } else {
            System.out.println("존재하지 않는 게시글입니다.");
        }

    }

    public void boardUpdate() {
        System.out.println("수정하실 글의 id를 입력해주세요");
        System.out.print("id: ");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findByID(id);
        if (boardDTO != null) {
            if (boardDTO.getBoardWriter().equals(CommonVariables.loginEmail)) {
                System.out.println("변경하실 정보를 입력해주세요(제목, 내용)");
                System.out.println("글 제목:");
                String boardTitle = scanner.next();
                System.out.println("글 내용:");
                String boardContents = scanner.next();
                boolean result = boardRepository.boardUpdate(id, boardTitle, boardContents);
                if (result) {
                    System.out.println("Upgrade complete");
                } else {
                    System.out.println("업그레이드 건물이 파괴되었습니다.");
                    System.out.println("업그레이드가 중단되었습니다.");
                }
            }
        } else {
            System.out.println("오창하신 게시글이 존재하지 않습니다.");
        }
    }

    public void boardDelete() {
        System.out.println("삭제하실 글의 id를 입력해주세요");
        System.out.print("id: ");
        Long id = scanner.nextLong();
        int selectNum = 0;
        BoardDTO boardDTO = boardRepository.findByID(id);
        if (boardDTO != null) {
            if (boardDTO.getBoardWriter().equals(CommonVariables.loginEmail)) {
                System.out.println("정말로 삭제하시겠습니까?");
                System.out.println("삭제된 게시글은 복구할 수 없습니다.");
                System.out.println("1번 삭제 | 2번 취소");
                System.out.println("선택> ");
                selectNum = scanner.nextInt();
                if (selectNum == 1) {
                    boolean result = boardRepository.boardDelete(id);
                    if (result) {
                        System.out.println("게시글이 삭제되었습니다.");
                    } else {
                        System.out.println("알 수 없는 오류가 발생하였습니다.");
                        System.out.println("다시 시도해주세요");
                    }
                } else if (selectNum == 2) {
                    System.out.println("메인 메뉴로 돌아갑니다.");
                } else {
                    System.out.println("1번 흑은 2번을 입력해주세요");
                }
            }
        }
    }
}
