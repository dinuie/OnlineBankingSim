import java.util.List;
import java.util.UUID;

public class Client extends BankAccount {
    private UUID clientId;
    private List<BankAccount> accounts;

    public Client(int currentBalance, String currency, BankAccountType bankAccountType) {
        super(currentBalance, currency, bankAccountType);
        clientId = UUID.randomUUID();
    }


    public boolean checkIfCorporate() {
        if (getBankAccountType() == BankAccountType.CORPORATE) {
            return true;
        }
        return false;
    }

    public List<BankAccount> accounts(){
        return accounts;
    }

}
