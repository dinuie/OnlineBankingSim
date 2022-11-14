public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client = new Client(100,"USD", BankAccountType.CORPORATE);
        Client client2 = new Client(200,"EURO", BankAccountType.CORPORATE);
        Client client3 = new Client(300,"EURO", BankAccountType.CORPORATE);
        bank.transfer(100, client2, client3);
    }
}
