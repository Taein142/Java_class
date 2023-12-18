package ch11_class.ex03_member;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        boolean run = true;
        int selecNo = 0;
        while (run) {
            System.out.println("==================================================================================");
            System.out.println("1.회원가입 2.로그인 3.회원목록조회 4.회원정보수정 5.회원탈퇴 6.로그아웃 0.종료");
            System.out.println("====================================================================================");
            System.out.println("선택> ");
            selecNo = scanner.nextInt();
            if (selecNo == 1) {
                memberService.join();
            } else if (selecNo == 2) {
                memberService.login();
            } else if (selecNo == 3) {
                memberService.findAll();
            } else if (selecNo == 4) {
                memberService.update();
            } else if (selecNo == 5) {
                memberService.delete();
            } else if (selecNo == 6) {
                memberService.logout();
            } else if (selecNo == 0) {
                System.out.println("시스템을 종료합니다.");
                run = false;
            }
        }

    }
}
