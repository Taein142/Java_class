package ch11_class.ex06_memberboard.service;

import ch11_class.ex06_memberboard.common.CommonVariables;
import ch11_class.ex06_memberboard.dto.BoardDTO;
import ch11_class.ex06_memberboard.dto.CommentDTO;
import ch11_class.ex06_memberboard.repository.BoardRepository;
import ch11_class.ex06_memberboard.repository.CommentRepository;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    CommentRepository commentRepository = new CommentRepository();
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
        listPrint(boardDTOList);
    }

    public void findById() {
        System.out.print("찾으실 글의 id를 입력해주세요");
        Long id = scanner.nextLong();
        boolean result = boardRepository.updateHits(id);
        if (result) {
            BoardDTO boardDTO = boardRepository.findByID(id);
            System.out.println("boardDTO = " + boardDTO);
            List<CommentDTO> commentDTOList = commentRepository.comment();
            System.out.println("===== 댓글 =====");
            int selectNum = 0;
            CommentDTO dto = commentRepository.commentCheck(id);
            if (commentDTOList.size() > 0) {
                if (dto != null) {
                    System.out.println(commentDTOList);
                }else {
                    System.out.println("작성된 댓글이 없습니다.");
                }
            } else {
                System.out.println("작성된 댓글이 없습니다.");
            }
            System.out.println("댓글을 작성하시려면 1번");
            System.out.println("메뉴로 돌아가시려면 2번");
            selectNum = scanner.nextInt();

            if (selectNum == 1) {
                System.out.println("댓글을 작성해주세요");
                String comment = scanner.next();
                CommentDTO commentDTO = new CommentDTO(id, CommonVariables.loginEmail, comment);
                boolean commentResult = commentRepository.save(commentDTO);
                if (commentResult) {
                    System.out.println("댓글 작성 성공");
                } else {
                    System.out.println("댓글 작성 실패");
                }
            } else if (selectNum == 2) {
                System.out.println("글작성 메뉴로 돌아갑니다.");
            }
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

    public void search() {
        System.out.println("검색어를 입력해주세요");
        System.out.print("검색어> ");
        String word = scanner.next();
        List<BoardDTO> searchList = boardRepository.search(word);
        if (searchList.size() > 0) {
            listPrint(searchList);
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    private void listPrint(List<BoardDTO> boardDTOList) {
        System.out.println("id\t" + "title\t" + "writer\t" + "hits\t" + "date\t");
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println(boardDTO.getId() + "\t" + boardDTO.getBoardTitle() + "\t" +
                    boardDTO.getBoardWriter() + "\t" + boardDTO.getBoardHits() + "\t" +
                    boardDTO.getCreatedAt() + "\t");
        }
    }
}
