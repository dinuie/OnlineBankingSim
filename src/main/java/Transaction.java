import java.util.UUID;

public class Transaction {
    private UUID transactionId;
    private BankAccount from;
    private BankAccount to;
    private int amount;

    public Transaction(BankAccount from, BankAccount to, int amount) {
        this.transactionId = UUID.randomUUID();
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public BankAccount getFrom() {
        return from;
    }

    public BankAccount getTo() {
        return to;
    }

    public int getAmount() {
        return amount;
    }

}
