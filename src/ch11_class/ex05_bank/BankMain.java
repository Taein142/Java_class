package ch11_class.ex05_bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;

        while (run) {
            System.out.println("===========================================================================");
            System.out.println("1.신규계좌 등록  2.잔액조회  3.입금  4.출금  5.입출금 내역 조회 6.계좌이체 0.종료");
            System.out.println("===========================================================================");
            System.out.print("선택>");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                bankService.save();
            } else if (selectNo == 2) {
                bankService.balance();
            } else if (selectNo == 3) {
                bankService.deposit();
            } else if (selectNo == 4) {
                bankService.withdraw();
            } else if (selectNo == 5) {
                bankService.findList();
            } else if (selectNo == 6) {
                bankService.transfer();
            } else if (selectNo == 0) {
                System.out.println("시스템을 종료합니다.");
                run = false;
            } else {
                System.out.println("메뉴 상의 번호를 입력해주세요");
            }
        }
    }
}
