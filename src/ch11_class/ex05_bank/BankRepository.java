package ch11_class.ex05_bank;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    List<ClientDTO> clientDTOList = new ArrayList<>();
    List<AccountDTO> accountDTOList = new ArrayList<>();

    public boolean checkAccount(String accountNumber) {
        boolean result = false;
        for (ClientDTO clientDTO : clientDTOList) {
            if (accountNumber.equals(clientDTO.getAccountNumber())) {
                result = true;
            }
        }
        return result;
    }

    public boolean save(ClientDTO clientDTO) {
        return clientDTOList.add(clientDTO);
    }

    public ClientDTO balance(String accountNumber) {
        ClientDTO clientDTO = null;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                clientDTO = clientDTOList.get(i);
            }
        }
        return clientDTO;
    }
}
