package ch11_class.ex06_memberboard.repository;

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
        for (BoardDTO boardDTO: boardDTOList){
            if (id.equals(boardDTO.getId())){
                return boardDTO;
            }
        }
        return null;
    }

    // String long = CommonVariables.loginEmail;
}
