package ch12_class.ex06_memberboard.repository;

import ch12_class.ex06_memberboard.dto.CommentDTO;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
     static List<CommentDTO> commentDTOList = new ArrayList<>();

    public boolean save(CommentDTO commentDTO) {
        return commentDTOList.add(commentDTO);
    }

    public List<CommentDTO> comment() {
        return commentDTOList;
    }

    public CommentDTO commentCheck(Long id){
        for (CommentDTO commentDTO: commentDTOList){
            if (id.equals(commentDTO.getBoardId())){
                return commentDTO;
            }
        }
        return null;
    }
}
