import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Client> clientList;
    private Transaction transaction;

    public List<Client> allClientsAccounts(BankAccountType bankAccountType, String currency) {
        List<Client> clientList = new ArrayList<>();
        for (Client client : clientList) {
            if (client.getBankAccountType() == bankAccountType)
                if (client.getCurrency() == currency)
                    clientList.add(client);
        }
        return clientList;
    }

    public boolean transfer(int amount, Client from, Client to) {
        if (from.getCurrentBalance() >= amount &&
                !(from.getId() == to.getId()) &&
                (from.checkIfCorporate() == true) && (to.checkIfCorporate() == true) &&
                (from.getCurrency()) ==
                        to.getCurrency()) {
            int fromBal = from.getCurrentBalance() - amount;
            int toBal = to.getCurrentBalance() + amount;
            System.out.println("Successfully");
            transaction.addTransaction();
        } else {
            System.out.println("Insufficient funds");
        }
        return false;
    }


}
