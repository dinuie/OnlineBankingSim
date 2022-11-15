import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<BankAccount> bankAccounts = new ArrayList<>();

    public void addNewBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }
}
