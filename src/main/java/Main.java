public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Corporate corporate = new Corporate(3000, "USD");
        Corporate corporate2 = new Corporate(3000, "USD");
        bank.transfer(100, corporate2, corporate);
        bank.transfer(100, corporate2, corporate);
        bank.transfer(100, corporate2, corporate);
        bank.transfer(100, corporate, corporate2);
        bank.transfer(100, corporate, corporate2);
//        Client client = new Client(100,"USD", BankAccountType.CORPORATE);
//        Client client2 = new Client(200,"EURO", BankAccountType.CORPORATE);
//        Client client3 = new Client(300,"EURO", BankAccountType.CORPORATE);
//        bank.transfer(100, client2, client3);
//        bank.transfer(50, client2, client3);
        bank.printClientTransactions(corporate2);
    }
}
