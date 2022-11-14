import java.util.List;
import java.util.UUID;

public class Transaction {
    private UUID transactionId;
    private Client from;
    private Client to;
    private int amount;
    private List<Transaction> transactionsList;

    public Transaction(Client from, Client to, int amount) {
        this.transactionId = UUID.randomUUID();
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public Client getFrom() {
        return from;
    }

    public Client getTo() {
        return to;
    }

    public int getAmount() {
        return amount;
    }

    public void addTransaction(Transaction transaction){
        transactionsList.add(transaction);
    }
}
