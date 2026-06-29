package EncapsulationAndAbstraction.BankingSystem;

public class CurrentAccount extends BankAccount{
    private double monthlyBonusRate;
    public double getmonthlyBonusRate(){
        return monthlyBonusRate;
    }
    public void setmonthlyBonusRate(int monthlyBonusRate){
        this.monthlyBonusRate=monthlyBonusRate;
    }
    void calculateInterest(){
        double interest = getbalance()* monthlyBonusRate/100;
        System.out.println(interest);
    }
}
