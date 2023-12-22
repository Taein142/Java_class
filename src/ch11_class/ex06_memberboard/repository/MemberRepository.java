package ch11_class.ex06_memberboard.repository;

import ch11_class.ex06_memberboard.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<MemberDTO> memberDTOList = new ArrayList<>();

    public MemberDTO checkEmail(String memberEmail) {
        for (MemberDTO memberDTO : memberDTOList) {
            if (memberEmail.equals(memberDTO.getMemberEmail())) {
                return memberDTO;
            }
        }
        return null;
    }

    public MemberDTO checkPass(String memberPass) {
        for (MemberDTO memberDTO : memberDTOList) {
            if (memberPass.equals(memberDTO.getMemberPassword())) {
                return memberDTO;
            }
        }
        return null;
    }

    public MemberDTO login(String memberEmail, String memberPass) {
        for (MemberDTO memberDTO : memberDTOList) {
            if (memberEmail.equals(memberDTO.getMemberEmail()) && memberPass.equals(memberDTO.getMemberPassword())) {
                return memberDTO;
            }
        }
        return null;
    }

    public boolean save(MemberDTO newMemberDTO) {
        return memberDTOList.add(newMemberDTO);
    }

    public List<MemberDTO> memberList() {
        return memberDTOList;
    }

    public boolean memberUpdate(String memberName, String memberMobile) {
        boolean result = false;
        for (MemberDTO memberDTO : memberDTOList) {
            memberDTO.setMemberName(memberName);
            memberDTO.setMemberMobile(memberMobile);
            result = true;
        }
        return result;
    }

    public boolean memberDelete(String memberEmail, String memberPass) {
        boolean result = false;
        for (MemberDTO memberDTO : memberDTOList) {
            if (memberEmail.equals(memberDTO.getMemberEmail()) && memberPass.equals(memberDTO.getMemberPassword())) {
                memberDTOList.remove(memberDTO);
                result = true;
            }
        }
        return result;
    }
}
