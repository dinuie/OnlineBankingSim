import java.util.UUID;

public class Client extends BankAccount {
    private UUID clientId;

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

    public UUID getClientId() {
        return clientId;
    }
}
