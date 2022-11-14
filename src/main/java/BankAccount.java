import java.util.UUID;

public abstract class BankAccount {
    private UUID accountId;
    private int currentBalance;
    private String currency;
    private BankAccountType bankAccountType;

    public BankAccount (int currentBalance, String currency, BankAccountType bankAccountType) {
        this.accountId = UUID.randomUUID();
        this.currentBalance = currentBalance;
        this.currency = currency;
        this.bankAccountType = bankAccountType;
    }

    public UUID getId() {
        return accountId;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }
}
