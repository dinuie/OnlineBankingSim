import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Transaction> clientTransactionList = new ArrayList<>();
    private List<Transaction> allTransactionList = new ArrayList<>();

    public boolean transfer(int amount, Client from, Client to) {
        Transaction transaction = new Transaction(from, to, amount);
        if (from.getCurrentBalance() >= amount &&
                !(from.getId() == to.getId()) &&
                (from.checkIfCorporate() == true) && (to.checkIfCorporate() == true) &&
                (from.getCurrency()) ==
                        to.getCurrency()) {
            int fromBal = from.getCurrentBalance() - amount;
            int toBal = to.getCurrentBalance() + amount;
            System.out.println("Successfully");
            addTransaction(transaction);
            System.out.println(allTransactionList);
        } else {
            System.out.println("Insufficient funds");
        }
        return false;
    }

    public void addTransaction(Transaction transaction) {
        allTransactionList.add(transaction);
    }

    public void printClientTransactions(Client client){
        for (Transaction transaction : allTransactionList){
            if (client.getId().toString() == transaction.getFromId().toString()){
                clientTransactionList.add(transaction);
            }
        }
        System.out.println(clientTransactionList);
    }

}
