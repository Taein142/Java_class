package ch11_class.ex05_bank;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    List<ClientDTO> clientList = new ArrayList<>();
    List<AccountDTO> bankingList = new ArrayList<>();
    List<AccountDTO> historyList = new ArrayList<>();

    public boolean checkAccount(String accountNumber) {
        boolean result = false;
        for (ClientDTO clientDTO : clientList) {
            if (accountNumber.equals(clientDTO.getAccountNumber())) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean checkPass(int clientPass) {
        boolean result = false;
        for (ClientDTO clientDTO : clientList) {
            if (clientPass == clientDTO.getClientPass()) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean save(ClientDTO clientDTO) {
        return clientList.add(clientDTO);
    }

    public ClientDTO balance(String accountNumber) {
        ClientDTO clientDTO = null;
        for (ClientDTO dto : clientList) {
            if (accountNumber.equals(dto.getAccountNumber())) {
                clientDTO = dto;
            }
        }
        return clientDTO;
    }

    public ClientDTO deposit(String accountNumber, int deposit) {
        ClientDTO clientDTO = null;
        long money = 0;
        for (int i = 0; i < clientList.size(); i++) {
            if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
                money = clientList.get(i).getBalance();
                money += deposit;
                clientList.get(i).setBalance(money);
                clientDTO = clientList.get(i);
            }
        }
        return clientDTO;
    }

    public ClientDTO withdraw(String accountNumber, int withdraw) {
        ClientDTO clientDTO = null;
        long money = 0;
        for (int i = 0; i < clientList.size(); i++) {
            if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
                money = clientList.get(i).getBalance();
                if (money >= withdraw) {
                    money -= withdraw;
                    clientList.get(i).setBalance(money);
                    clientDTO = clientList.get(i);
                }
            }
        }
        return clientDTO;
    }

    public void depowith(AccountDTO accountDTO) {
        bankingList.add(accountDTO);
    }

    public List<AccountDTO> findAll(String accountNumber) {
        for (int i = 0; i < bankingList.size(); i++) {
            if (accountNumber.equals(bankingList.get(i).getAccountNumber())){
                historyList.add(bankingList.get(i));
            }
        }
        return historyList;
    }

    public List<AccountDTO> findDeposit(String accountNumber) {
        for (int i = 0; i < bankingList.size(); i++) {
            if (accountNumber.equals(bankingList.get(i).getAccountNumber())){
                historyList.add(bankingList.get(i));
            }
        }
        return historyList;
    }

    public List<AccountDTO> findWithdraw(String accountNumber) {
        for (int i = 0; i < bankingList.size(); i++) {
            if (accountNumber.equals(bankingList.get(i).getAccountNumber())){
                historyList.add(bankingList.get(i));
            }
        }
        return historyList;
    }
}
