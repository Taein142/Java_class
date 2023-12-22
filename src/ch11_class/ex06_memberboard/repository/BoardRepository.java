package ch11_class.ex06_memberboard.repository;

import ch11_class.ex06_memberboard.common.CommonVariables;
import ch11_class.ex06_memberboard.dto.BoardDTO;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
    List<BoardDTO> boardDTOList = new ArrayList<>();

    public boolean write(BoardDTO boardDTO) {
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> boardList() {
        return boardDTOList;
    }

    public boolean updateHits(Long id) {
        boolean result = false;
        for (BoardDTO boardDTO : boardDTOList) {
            if (id.equals(boardDTO.getId())) {
                int hits = boardDTO.getBoardHits();
                hits++;
                boardDTO.setBoardHits(hits);
                result = true;
            }
        }
        return result;
    }

    public BoardDTO findByID(Long id) {
        for (BoardDTO boardDTO : boardDTOList) {
            if (id.equals(boardDTO.getId())) {
                return boardDTO;
            }
        }
        return null;
    }

    public boolean boardUpdate(Long id, String boardTitle, String boardContents) {
        boolean result = false;
        for (BoardDTO boardDTO : boardDTOList) {
            if (id.equals(boardDTO.getId())) {
                boardDTO.setBoardTitle(boardTitle);
                boardDTO.setBoardContents(boardContents);
                result = true;
            }
        }
        return result;
    }

    public boolean boardDelete(Long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                boardDTOList.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<BoardDTO> search(String word) {
        List<BoardDTO> searchList = new ArrayList<>();
        for (BoardDTO boardDTO : boardDTOList){
            if (boardDTO.getBoardTitle().contains(word)){
                searchList.add(boardDTO);
            }
        }
        return searchList;
    }
}
