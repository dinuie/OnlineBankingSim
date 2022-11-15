import java.util.UUID;

public abstract class BankAccount {
    private UUID accountId;
    private int currentBalance;
    private String currency;
    private Client client;

    public BankAccount(int currentBalance, String currency) {
        this.accountId = UUID.randomUUID();
        this.currentBalance = currentBalance;
        this.currency = currency;
        this.client = client;
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

    public abstract void transfer(int amount, BankAccount to);



//    public boolean transfer(int amount, Client from, Client to) {
//        Transaction transaction = new Transaction(from, to, amount);
//        if (from.getCurrentBalance() >= amount &&
//                !(from.getId() == to.getId()) &&
//                (from.checkIfCorporate() == true) && (to.checkIfCorporate() == true) &&
//                (from.getCurrency()) ==
//                        to.getCurrency()) {
//            int fromBal = from.getCurrentBalance() - amount;
//            int toBal = to.getCurrentBalance() + amount;
//            System.out.println("Successfully");
//            addTransaction(transaction);
//            System.out.println(allTransactionList);
//        } else {
//            System.out.println("Insufficient funds");
//        }
//        return false;
//    }
}
