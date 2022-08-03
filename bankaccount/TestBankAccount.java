

public class TestBankAccount{
    public static void main(String[] args){
        
        BankAccount joe = new BankAccount();
        BankAccount bob = new BankAccount(3.4, 1.0);
        System.out.println(joe.getCheckingBalance());
        System.out.println(joe.getSavingBalance());
        System.out.println(bob.getCheckingBalance());
        System.out.println(bob.getSavingBalance());

        joe.deposit("checking", 100.00);
        joe.deposit("saving", 124.43);
        System.out.println(joe.getCheckingBalance());
        System.out.println(joe.getSavingBalance());

        bob.withdraw("checking", 100.00);
        bob.withdraw("saving", 0.5);
        System.out.println(bob.getCheckingBalance());
        System.out.println(bob.getSavingBalance());
        bob.seeTotalMoney();
        System.out.println(BankAccount.numberOfAccounts());
        System.out.println(BankAccount.totalMoneyFromAccounts());
    }
}