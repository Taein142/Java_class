package ch11_class.member;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MemberRepository {
    private static List<MemberDTO> memberDTOList = new ArrayList<>();

    public boolean join(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }


    public MemberDTO login(String memberEmail, String memberPassword) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (Objects.equals(memberEmail, memberDTOList.get(i).getMemberEmail()) && Objects.equals(memberPassword, memberDTOList.get(i).getMemberPassword())) {
                memberDTO = memberDTOList.get(i);
            } else {

            }
        }
        return memberDTO;
    }

    public boolean update(String newMemberEmail, String newMemberPassword, String newMemberName, String newMemberMobile) {
        boolean result = false;
        for (MemberDTO memberDTO : memberDTOList) {
            memberDTO.setMemberEmail(newMemberEmail);
            memberDTO.setMemberPassword(newMemberPassword);
            memberDTO.setMemberName(newMemberName);
            memberDTO.setMemberMobile(newMemberMobile);
            result = true;
        }
        return result;
    }

    public MemberDTO checkPassword(String memberPassword) {
        // 입력한 비밀번호가 같은지 확인하는 메서드
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                memberDTO = memberDTOList.get(i);
            }
        }
        return memberDTO;
    }


    public boolean delete(String memberPassword) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                memberDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }

    public MemberDTO logout() {
    }
}
