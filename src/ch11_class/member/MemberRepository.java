package ch11_class.member;

import ch11_class.ex02.BookDTO;

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
            }
        }
        return memberDTO;
    }

    public boolean update(String loginEmail, String newMemberName, String newMemberMobile) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            memberDTOList.get(i).setMemberMobile(newMemberName);
            memberDTOList.get(i).setMemberMobile(newMemberMobile);
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

    public boolean delete(String loginEmail) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }

    public boolean loginCheck(String memberEmail) {
        boolean result = true;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                // 중복되는 이메일이 있다 => 결과를 false로 주자
                result = false;
            }
        }
        return result;
    }

    public List<MemberDTO> findAll() {
        return memberDTOList;
    }

}
