package ch11_class.ex05_bank;

import java.util.Scanner;

public class BankService {
    BankRepository bankRepository = new BankRepository();
    Scanner scanner = new Scanner(System.in);

    public void save() {
        long balance = 0;
        boolean checkResult;
        String accountNumber;
        do {
            System.out.print("사용하실 계좌번호를 입력해주세요: ");
            accountNumber = scanner.next();
            checkResult = bankRepository.checkAccount(accountNumber);
            if (checkResult) {
                System.out.println("사용 가능한 계좌번호 입니다.");
            } else {
                System.out.println("이미 사용중인 계좌번호 입니다.");
            }
        } while (!checkResult);
        System.out.print("사용하실 비밀전호를 입력해주세요");
        int clientPass = scanner.nextInt();
        System.out.print("성함을 입력해주세요: ");
        String clientName = scanner.next();
        ClientDTO clientDTO = new ClientDTO(clientName, accountNumber, clientPass, balance);
        boolean result = bankRepository.save(clientDTO);
        if (result) {
            System.out.println("고객등록 성공");
        } else {
            System.out.println("고객등록 실패");
        }

    }
}
