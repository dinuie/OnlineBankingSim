public class Corporate extends BankAccount{
    public Corporate(int currentBalance, String currency) {
        super(currentBalance, currency);
    }

    @Override
    public void transfer(int amount, BankAccount to) {

    }
}
