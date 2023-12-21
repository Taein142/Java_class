package ch11_class.ex05_bank;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    private static List<ClientDTO> clientDTOList = new ArrayList<>();
    private static List<AccountDTO> accountDTOList = new ArrayList<>();

    public ClientDTO checkAccount(String accountNumber) {
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNumber.equals(clientDTO.getAccountNumber())) {
                return clientDTO;
            }
        }
        return null;
    }

    public boolean checkPass(int clientPass) {
        boolean result = false;
        for (ClientDTO clientDTO : clientDTOList) {
            if (clientPass == clientDTO.getClientPass()) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean save(ClientDTO clientDTO) {
        return clientDTOList.add(clientDTO);
    }

    public ClientDTO balance(String accountNumber) {
        ClientDTO clientDTO = null;
        for (ClientDTO dto : clientDTOList) {
            if (accountNumber.equals(dto.getAccountNumber())) {
                clientDTO = dto;
            }
        }
        return clientDTO;
    }

    public boolean deposit(String accountNumber, long deposit) {
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNumber.equals(clientDTO.getAccountNumber())) {
                long balance = clientDTO.getBalance();
                balance = balance + deposit;
                clientDTO.setBalance(balance);
                AccountDTO accountDTO = new AccountDTO(accountNumber, deposit, 0);
                accountDTOList.add(accountDTO);
                return true;
            }
        }
        return false;
    }

    public boolean withdraw(String accountNumber, long withdraw) {
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNumber.equals(clientDTO.getAccountNumber())) {
                long balance = clientDTO.getBalance();
                if (withdraw > balance) {
                    return false;
                }
                balance = balance - withdraw;
                clientDTO.setBalance(balance);
                AccountDTO accountDTO = new AccountDTO(accountNumber, 0, withdraw);
                accountDTOList.add(accountDTO);
                return true;
            }
        }
        return false;
    }

    public List<AccountDTO> findList(String accountNumber) {
        List<AccountDTO> findList = new ArrayList<>();
        for (AccountDTO accountDTO : accountDTOList) {
            if (accountNumber.equals(accountDTO.getAccountNumber())) {
                findList.add(accountDTO);
            }
        }
        return findList;
    }

    public void transfer(String accountNumberFrom, String accountNumberTo, long money) {
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumberFrom.equals(clientDTOList.get(i).getAccountNumber())) { // 보내는 사람의 잔액, 거래내역 처리
                long balance = clientDTOList.get(i).getBalance();
                balance = balance - money;
                clientDTOList.get(i).setBalance(balance);
                AccountDTO accountDTO = new AccountDTO(accountNumberFrom, 0, money);
                accountDTOList.add(accountDTO);
            } else if (accountNumberTo.equals(clientDTOList.get(i).getAccountNumber())) { // 받는 사람의 전액, 거래내역 처리
                long balance = clientDTOList.get(i).getBalance();
                balance = balance + money;
                clientDTOList.get(i).setBalance(balance);
                AccountDTO accountDTO = new AccountDTO(accountNumberTo, money, 0);
                accountDTOList.add(accountDTO);
            }
        }
    }
}
