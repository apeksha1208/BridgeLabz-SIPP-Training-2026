package EncapsulationAndAbstraction.BankingSystem;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    public double getinterestRate(){
        return interestRate;
    }
    public void setinterestRate(double interestRate){
        this.interestRate=interestRate;
    }
    public void calculateInterest(){
        double interest = getbalance()*interestRate/100; //since the balance is private field in bankaccount , so use the getter method of balance to access it
        System.out.println(interest);
    }
}
