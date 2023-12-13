package ch10_class.ex10;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        /**
         * 메뉴
         * 1. 회원가입(기본생성자이용)
         *      회원가입 정보는 스캐너로 받음.
         * 2. 로그인
         * 3. 종료
         */

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int choose = 0;
        String email;
        String password;
        int failNumber = 0;
        Member member1 = new Member();

        while (run) {
            System.out.println("----------------------------");
            System.out.println("1. 회원가입  2. 로그인  3. 종료");
            System.out.println("----------------------------");
            System.out.print("선택> ");
            choose = scanner.nextInt();

            if (choose == 1) {
                System.out.print("이메일 입력: ");
                member1.setMemberEmail(scanner.next());
                System.out.print("비밀번호 입력: ");
                member1.setMemberPassword(scanner.next());
                System.out.print("이름 입력: ");
                member1.setMemberName(scanner.next());
                System.out.print("휴대폰 번호 입력: ");
                member1.setMemberMobile(scanner.next());

            } else if (choose == 2) {
                System.out.print("이메일 입력: ");
                email = scanner.next();
                System.out.print("비밀번호 입력: ");
                password = scanner.next();
                member1.memberLogin(email, password);
                System.out.println(member1);

            } else if (choose == 3) {
                System.out.println("시스템을 종료합니다.");
                run = false;

            } else {
                System.out.println("메뉴 상의 번호를 입력해 주세요");
            }
        }
    }
}