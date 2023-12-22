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
        for (BoardDTO boardDTO: boardDTOList){
            System.out.println("boardDTO = " + boardDTO);
        }
    }


    public void findId() {

    }
}
