package ch11_class.ex04_board;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    private static List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean boardCreate(BoardDTO boardDTO) {
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> boardIndex() {
        return boardDTOList;
    }

    public boolean boardUpdate(String boardTitle, String boardContents) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            boardDTOList.get(i).setBoardTitle(boardTitle);
            boardDTOList.get(i).setBoardContents(boardContents);
            result = true;
        }
        return result;
    }

    public BoardDTO check(Long id, String boardPass) {
        BoardDTO check = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId()) && boardPass.equals(boardDTOList.get(i).getBoardPass())) {
                check = boardDTOList.get(i);
            }
        }
        return check;
    }

    public BoardDTO boardInqure(Long id) {
        // boardDTO로 리턴받고 조회수를 증가시켜줄거야
        BoardDTO boardDTO = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                boardDTO = boardDTOList.get(i);
                boardDTO.view();


                // 기존의 조회수 값을 가져와서 여기서 1개 늘려야됨.
            }
        }
        return boardDTO;
    }
}
