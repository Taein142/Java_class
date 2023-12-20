package ch11_class.ex05_bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AccountDTO {
    private Long id;
    private String accountNumber; // 계좌번호
    private int deposit; // 입금액
    private int withdraw; // 출금액
    private String backingAt; // 입출금 발생 시간

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public String getBackingAt() {
        return backingAt;
    }

    public void setBackingAt(String backingAt) {
        this.backingAt = backingAt;
    }

    public AccountDTO() {
    }
    private static Long inValue = 1L;
    public AccountDTO(String accountNumber, int deposit, int withdraw) {
        this.id = inValue++;
        this.accountNumber = accountNumber;
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.backingAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", deposit=" + deposit +
                ", withdraw=" + withdraw +
                ", backingAt='" + backingAt + '\'' +
                '}';
    }
}
