import java.util.UUID;

public class Transaction {
    private UUID transactionId;
    private Client from;
    private Client to;
    private int amount;

    public Transaction(Client from, Client to, int amount) {
        this.transactionId = UUID.randomUUID();
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public UUID getFromId() {
        return from.getClientId();
    }

    public Client getTo() {
        return to;
    }

    public int getAmount() {
        return amount;
    }


}
