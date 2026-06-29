package EncapsulationAndAbstraction.BankingSystem;

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;
    public int getaccountNumber(){
        return accountNumber;
    }
    public void setaccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getholderName(){
        return holderName;
    }
    public void setholderName(String holderName){
        this.holderName=holderName;
    }
    public double getbalance(){
        return balance;
    }
    public void setbalance(double balance){
        this.balance=balance;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println(amount+"money deposited");
    }
    void withdraw(double amount){
        balance-=amount;
        System.out.println(amount +"money withdraw");
    }
    void displayAccountDetails(){
        System.out.println(accountNumber);
        System.out.println(holderName);
        System.out.println(balance);
    }
    abstract void calculateInterest();
}
