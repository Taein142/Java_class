package ch11_class.ex04_board;

import ch10_class.ex11.Board;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner scanner = new Scanner(System.in);

    public void boardCreate() {
        System.out.println("글을 작성해주세요");
        System.out.print("제목: ");
        String boardTitle = scanner.next();
        System.out.print("작성자: ");
        String boardWriter = scanner.next();
        System.out.print("내용: ");
        String blank = scanner.nextLine();
        String boardContents = scanner.nextLine();
        System.out.print("비밀번호: ");
        String boardPass = scanner.next();
        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardContents, boardPass);
        boolean result = boardRepository.boardCreate(boardDTO);
        if (result) {
            System.out.println("작성이 완료되었습니다.");
        } else {
            System.out.println("예상치 못한 오류로 인하여 작성이 최소되었습니다.");
        }
    }

    public void boardIndex() {
        List<BoardDTO> boardDTOList = boardRepository.boardIndex();
        System.out.println("boardDTOList = " + boardDTOList);
    }

    public void boardInquire() {
//        - 글조회
//          - 목록에서 게시글 번호를 입력하면 해당 글의 상세 내용을 보여줌
//          - 상세 내용 출력 이전에 해당 게시글의 조회수 값을 1 증가시켜줘야 함.
        System.out.print("개시글 번호를 입력해주세요: ");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.boardInqure(id);
        if (boardDTO != null) {
            System.out.println(boardDTO);
        } else {
            System.out.println("번호를 다시 입력해주세요: ");
        }
    }

    public void boardUpdate() {
//      - 글수정
//          - 수정할 글번호를 입력 받고 비밀번호도 입력 받아서 비밀번호가 일치하면 수정할 제목, 내용을 입력받고 수정 처리.
//          - 비밀번호가 틀리면 틀렸다는 메시지 출력
        System.out.print("수정할 글번호를 입력해주세요: ");
        Long id = scanner.nextLong();
        System.out.print("비밀번호를 입력해주세요: ");
        String boardPass = scanner.next();
        BoardDTO boardDTO = boardRepository.check(id, boardPass);
        if (boardDTO != null) {
            System.out.print("수정할 제목을 입력해주세요: ");
            String boardTitle = scanner.next();
            System.out.print("수정할 내용을 입력해주세요: ");
            String black = scanner.nextLine();
            String boardContents = scanner.nextLine();
            boolean result = boardRepository.boardUpdate(boardTitle, boardContents);
            if (result) {
                System.out.println("내용이 수정되었습니다.");
                System.out.println(boardDTO);
            } else {
                System.out.println("수정 중 오류가 발생하였습니다.");
            }
        } else {
            System.out.println("아이디 혹은 비밀번호가 틀렸습니다.");
        }
    }

    public void boardRemove() {
//        - 글삭제
//          - 수정할 글번호를 입력 받고 비밀번호도 입력 받아서 비밀번호가 일치하면 글삭제 처리
//          - 비밀번호가 틀리면 틀렸다는 메시지 출력
        System.out.print("삭제할 글번호를 입력해주세요 ");
        Long id = scanner.nextLong();
        System.out.print("비밀번호를 입력해주세요 ");
        String boardPass = scanner.next();
        BoardDTO checkResult = boardRepository.check(id, boardPass);
        if (checkResult != null) {
            boolean result = boardRepository.boardRemove(id);
            if (result) {
                System.out.println("글이 삭제되었습니다.");
            } else {
                System.out.println("알수 없는 오류로 인하여 해당 작업이 진행되지 않았습니다.");
            }
        } else {
            System.out.println("글이 존재하지 않거나 입력 오류입니다.");
        }
    }

    public void boardSearch() {
//        - 검색
//          - 제목으로만 검색가능
//          - 입력한 검색어가 포함된 결과를 목록으로 출력
        System.out.print("검색를 입력해주세요: ");
        String findWord = scanner.nextLine();
        List<BoardDTO> boardDTOList = boardRepository.boardSearch(findWord);
        if(boardDTOList.size()>0){
            for (BoardDTO boardDTO: boardDTOList){
                System.out.println("boardDTO = " + boardDTO);
            }
        }else {
            System.out.println("검색결과가 없습니다.");
        }
    }
}
