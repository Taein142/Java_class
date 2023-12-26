package ch13_map.ex03;

import java.util.Map;
import java.util.Scanner;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    Scanner scanner = new Scanner(System.in);
    private static String loginEmail = null;

    public void save() {
        boolean checkResult;
        String memberEmail;
        System.out.println("회원정보를 입력해주세요.");
        do {
            System.out.print("이메일: ");
            memberEmail = scanner.next();
            checkResult = memberRepository.loginCheck(memberEmail);
            if (!checkResult) {
                System.out.println("사용 가능한 이메일 입니다.");
            } else {
                System.out.println("사용중인 이메일 입니다.");
                System.out.println("다른 이메일을 입력해주세요");
            }
        } while (checkResult);

        System.out.print("비밀번호: ");
        String memberPassword = scanner.next();
        System.out.print("이름: ");
        String memberName = scanner.next();
        System.out.print("전화번호: ");
        String memberMobile = scanner.next();
        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
        boolean result1 = memberRepository.save(memberDTO);
        if (result1) {
            System.out.println("가입이 완료되었습니다.");
        } else {
            System.out.println("가입에 실패하였습니다.");
        }
    }

    public void login() {
        System.out.println("이메일과 비밀번호를 입력해 주세요.");
        System.out.print("이메일: ");
        String memberEmail = scanner.next();
        System.out.print("비밀번호: ");
        String memberPassword = scanner.next();
        MemberDTO loginResult = memberRepository.login(memberEmail, memberPassword);
        if (loginResult != null) {
            loginEmail = memberEmail;
            System.out.println("로그인 성공");
            System.out.println(memberEmail + "님 환영합니다.");
            System.out.println("loginResult = " + loginResult);
        } else {
            System.out.println("로그인 실패");
        }
    }

    public void findAll() {
        Map<Long, MemberDTO> memberDTOMap = memberRepository.findAll();
        for (Long i: memberDTOMap.keySet()){
            System.out.println(memberDTOMap.get(i));
        }
    }
}
