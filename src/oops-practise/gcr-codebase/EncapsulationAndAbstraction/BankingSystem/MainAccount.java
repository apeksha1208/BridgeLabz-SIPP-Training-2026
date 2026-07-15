package EncapsulationAndAbstraction.BankingSystem;

public class MainAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();

        sa.setaccountNumber(101);
        sa.setholderName("Apeksha");
        sa.setinterestRate(5);

        sa.deposit(2000);
        sa.withdraw(1000);

        sa.displayAccountDetails();
        sa.calculateInterest();

        CurrentAccount ca = new CurrentAccount();

        sa.setaccountNumber(102);
        sa.setholderName("Apekshaa");
        sa.setinterestRate(7);

        ca.deposit(3000);
        ca.withdraw(1000);
        ca.displayAccountDetails();
        ca.calculateInterest();
    }
}
