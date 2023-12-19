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
            }
        }
        return boardDTO;
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

    public boolean boardRemove(Long id) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                boardDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }

    public List<BoardDTO> boardSearch(String findWord) {
        List<BoardDTO> boardDTOS = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(findWord)) {
                boardDTOS.add(boardDTOList.get(i));
            }
        }
        return boardDTOS;
    }
}
