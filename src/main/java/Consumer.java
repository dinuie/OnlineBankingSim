public class Consumer extends BankAccount{
    public Consumer(int currentBalance, String currency) {
        super(currentBalance, currency);
    }

    @Override
    public void transfer(int amount, BankAccount to) {

    }
}
