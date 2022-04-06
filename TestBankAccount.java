public class TestBankAccount{
    public static void main(String[] args){

        BankAccount account1 = new BankAccount();
        account1.depositMoney("checking", 250);
        account1.depositMoney("savings", 1000);
        account1.withdrawMoney("checking", 10);
        account1.withdrawMoney("savings", 300);

        BankAccount account2 = new BankAccount();
        // account2.depositMoney("checking", 1055.75);
        // account2.depositMoney("savings", 985.00);
        // account2.withdrawMoney("checking", 200);
        // account2.withdrawMoney("savings", 500.00);

        account1.getAccountSummary();
        // account2.getAccountSummary();
        System.out.println("\n**Number of Accounts**");
        System.out.println(BankAccount.numberOfAccounts());

    }
}

