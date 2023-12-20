package ch11_class.ex05_bank;

import ch11_class.ex04_board.BoardDTO;

import java.util.List;
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
            if (!checkResult) {
                System.out.println("사용 가능한 계좌번호 입니다.");
            } else {
                System.out.println("이미 사용중인 계좌번호 입니다.");
            }
        } while (checkResult);
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

    public void balance() {
        System.out.print("계좌번호를 입력해주세요");
        String accountNumber = scanner.next();
        boolean checkResult = bankRepository.checkAccount(accountNumber);
        if (checkResult) {
            ClientDTO clientDTO = bankRepository.balance(accountNumber);
            if (clientDTO != null) {
                System.out.println(clientDTO.getClientName() + "님의 잔액은 " + clientDTO.getBalance() + "원입니다.");
            }
        } else {
            System.out.println("없는 계좌번호 입니다!");
        }
    }

    public void deposit() {
        System.out.print("계좌번호를 입력해주세요");
        String accountNumber = scanner.next();
        boolean checkResult = bankRepository.checkAccount(accountNumber);
        int withdraw = 0;
        int deposit = 0;

        if (checkResult) {
            System.out.println("얼마를 입금하시겠습니까?");
            System.out.print("입금엑> ");
            deposit = scanner.nextInt();
            ClientDTO clientDTO = bankRepository.deposit(accountNumber, deposit);
            if (clientDTO != null) {
                System.out.println("입금이 완료되었습니다.");
                System.out.println(clientDTO.getClientName() + "님의 잔액은 " + clientDTO.getBalance() + "원입니다.");
                AccountDTO accountDTO = new AccountDTO(accountNumber, deposit, withdraw);
                bankRepository.depowith(accountDTO);
            } else {
                System.out.println("예상치 못한 오류로 인하여 입금이 되지 않았습니다.");
                System.out.println("다시 시도해주세요.");
            }
        } else {
            System.out.println("없는 계좌번호 입니다!");
        }
    }

    public void withdraw() {
        System.out.print("계좌번호를 입력해주세요");
        String accountNumber = scanner.next();
        boolean checkResult = bankRepository.checkAccount(accountNumber);
        System.out.print("비밀번호를 입력하세요");
        int clientPass = scanner.nextInt();
        boolean checkResult2 = bankRepository.checkPass(clientPass);
        int withdraw = 0;
        int deposit = 0;
        if (checkResult && checkResult2) {
            System.out.println("얼마를 출금하시겠습니까?");
            System.out.print("출금엑> ");
            withdraw = scanner.nextInt();
            ClientDTO clientDTO = bankRepository.withdraw(accountNumber, withdraw);
            if (clientDTO != null) {
                System.out.println("출금이 완료되었습니다.");
                System.out.println(clientDTO.getClientName() + "님의 잔액은 " + clientDTO.getBalance() + "원입니다.");
                AccountDTO accountDTO = new AccountDTO(accountNumber, deposit, withdraw);
                bankRepository.depowith(accountDTO);
            } else {
                System.out.println("잔액이 부족합니다.");
                System.out.println("다시 시도해주세요.");
            }
        } else {
            System.out.println("없는 계좌번호 입니다!");
        }
    }

    public void findList() {
        System.out.print("계좌번호를 입력해주세요");
        String accountNumber = scanner.next();
        boolean result = bankRepository.checkAccount(accountNumber);
        int selectNo = 0;
//        boolean run = true;
//        if (run{
//        }
        if (result) {
            System.out.println("=========================================");
            System.out.println("1.전체내역  2.입금내역  3.출금내역  4.종료");
            System.out.println("=========================================");
            System.out.print("메뉴를 입력해주세요");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                List<AccountDTO> bankingList = bankRepository.findAll(accountNumber);
                listPrint(bankingList);
            } else if (selectNo == 2) {
                List<AccountDTO> accountDTO = bankRepository.findDeposit(accountNumber);
                System.out.println("accountDTO = " + accountDTO);
            } else if (selectNo == 3) {
                List<AccountDTO> accountDTO = bankRepository.findWithdraw(accountNumber);
                System.out.println("accountDTO = " + accountDTO);
            } else if (selectNo == 4) {
                result = false;
            }
        }
    }

    private void listPrint (List<AccountDTO> bankinglist){
        System.out.println("id\t"+"accountNumber\t"+"deposit\t"+"withdraw"+"date\t");
        for (AccountDTO accountDTO : bankinglist) {
            System.out.println(accountDTO.getId() + "\t" + accountDTO.getAccountNumber() + "\t" +
                    accountDTO.getDeposit() + "\t" + accountDTO.getWithdraw() + "\t" +
                    accountDTO.getBackingAt() + "\t");
        }
    }
}
