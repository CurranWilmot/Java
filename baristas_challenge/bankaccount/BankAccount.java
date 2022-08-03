import java.lang.Math;


public class BankAccount{
    //member variables
    private double checkingBalance;
    private double savingBalance;
    private String accountNumber;
    private static int totalAccounts = 0;
    private static double totalMoney = 0.0;

    //constructors
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingBalance = 0;
        totalAccounts++;
    }

    public BankAccount(double checkingBalance, double savingBalance){
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        totalAccounts++;
        totalMoney += (checkingBalance + savingBalance);
    }

    //getters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingBalance(){
        return this.savingBalance;
    }

    //setters
    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }

    public void setSavingBalance(double savingBalance){
        this.savingBalance = savingBalance;
    }

    //BankAccount methods

    public static int numberOfAccounts(){
        return totalAccounts;
    }

    public static double totalMoneyFromAccounts(){
        return totalMoney;
    }

    public void deposit(String accountType, double moneyAmount){
        if(accountType == "checking"){
            this.checkingBalance += moneyAmount;
            totalMoney += moneyAmount;
        }
        else if(accountType == "saving"){
            this.savingBalance += moneyAmount;
            totalMoney += moneyAmount;
        }
    }

    public void withdraw(String accountType, double moneyAmount){
        if(accountType == "checking" && this.checkingBalance > moneyAmount){
            this.checkingBalance -= moneyAmount;
            totalMoney -= moneyAmount;
        }
        else if(accountType == "saving" && this.savingBalance > moneyAmount){
            this.savingBalance -= moneyAmount;
            totalMoney -= moneyAmount;
        }
    }

    public void seeTotalMoney(){
        System.out.println(this.checkingBalance + this.savingBalance);
    }

    // public String createAccountNum(){
    //     return String.valueOf((long) (Math.random() * 8999999999 + 1000000000));
    // }

}