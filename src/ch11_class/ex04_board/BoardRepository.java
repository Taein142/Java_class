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

    public boolean updateHits(Long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                // 기존 조회수 값을 가져옴
                int hits = boardDTOList.get(i).getBoardHits();
                // 1 증가 시킴
                hits += 1;
                boardDTOList.get(i).setBoardHits(hits);
                return true;
            }
        }
        return false;
    }

    public BoardDTO boardInqure(Long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                return boardDTOList.get(i);
            }
        }
        return null;
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
        List<BoardDTO> searchList = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(findWord)) {
                searchList.add(boardDTOList.get(i));
            }
        }
        return searchList;
    }
}
