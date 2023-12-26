package ch13_map.ex03;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private static Map<Long, MemberDTO> memberDTOMap = new HashMap<>();

    public boolean loginCheck(String memberEmail) {
        boolean result = false;
        for (Long i : memberDTOMap.keySet()) {
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                result = true;
            }
        }
        return false;
    }

    /*
    public MemberDTO checkPassword(String memberPassword) {
        MemberDTO memberDTO = null;
        for (Long i : memberDTOMap.keySet()) {
            if (memberPassword.equals(memberDTOMap.get(i).getMemberPassword())) {
                memberDTO = memberDTOMap.get(i);
            }
        }
        return memberDTO;
    }
    */

    public boolean save(MemberDTO memberDTO) {
        MemberDTO dto = memberDTOMap.put(memberDTO.getId(), memberDTO);
        if (dto == null) {
            return true;
        } else {
            return false;
        }
    }

    public MemberDTO login(String memberEmail, String memberPassword) {
        for (Long i : memberDTOMap.keySet()) {
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail()) && memberPassword.equals(memberDTOMap.get(i).getMemberPassword())) {
                return memberDTOMap.get(i);
            }
        }
        return null;
    }

    public Map<Long, MemberDTO> findAll() {
        return memberDTOMap;
    }

    public boolean update(String loginEmail, String newMemberName, String newMemberMobile) {
        boolean result = false;
        for (Long i : memberDTOMap.keySet()) {
            if (loginEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                memberDTOMap.get(i).setMemberName(newMemberName);
                memberDTOMap.get(i).setMemberMobile(newMemberMobile);
                return true;
            }
        }
        return result;
    }

    public boolean delete(String loginEmail) {
        boolean result = false;
        for (Long i : memberDTOMap.keySet()) {
            if (loginEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                memberDTOMap.remove(i);
                result = true;
            }
        }
        return result;
    }
}
