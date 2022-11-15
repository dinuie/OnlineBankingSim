import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Transaction> clientTransactionList = new ArrayList<>();
    private List<Transaction> allTransactionList = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        allTransactionList.add(transaction);
    }

    public void transfer(int amount, BankAccount from, BankAccount to) {
        Transaction transaction = new Transaction(from, to, amount);
        if (from.getCurrentBalance() >= amount &&
                !(from.getId() == to.getId()) &&
                from.getCurrency() == to.getCurrency()) {
        }
        from.transfer(amount, to);
        int fromBal = from.getCurrentBalance() - amount;
        int toBal = to.getCurrentBalance() + amount;
        addTransaction(transaction);
        System.out.println(allTransactionList);
    }


    public void printClientTransactions(BankAccount bankAccount) {
        for (Transaction transaction : allTransactionList) {
            if (bankAccount.getId().equals(transaction.getFrom().getId())){
                clientTransactionList.add(transaction);
            }
        }
        System.out.println(clientTransactionList);
    }

}
