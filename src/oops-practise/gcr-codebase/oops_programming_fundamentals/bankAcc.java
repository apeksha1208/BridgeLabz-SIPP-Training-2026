package oops_programming_fundamentals;

public class bankAcc {
    int accNumber;
    String holder;
    int balance;
    static int count=0;
    bankAcc(int accNumber , String holder , int balance){
        this.accNumber=accNumber;
        this.holder = holder;
        this.balance=balance;
        count++;
    }
    public static int totalAccounts(){
        return count;
    }
    public void deposit(int amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println();
        }

        else System.out.println("Invalid amount");
    }
    public void withdraw(int amount){
        if(amount<balance){
            balance=balance-amount;
            System.out.println();
        }
        else System.out.println("insufficient");
    }
    public void getStatement(){
        System.out.println(accNumber);
        System.out.println(holder);
        System.out.println(balance);
    }
}
 class main{
     public static void main(String[] args) {
         bankAcc ba= new bankAcc(1234,"apeksha",2800);
         bankAcc bb = new bankAcc(4567,"vaishnavi",780);
         bankAcc bc = new bankAcc(7890 , "anime",200);
         System.out.println(bankAcc.totalAccounts());
         ba.deposit(200);
         ba.withdraw(1000);
         ba.getStatement();
         bb.deposit(201);
         bb.withdraw(1000);
         bb.getStatement();
         bc.deposit(202);
         bc.withdraw(1000);
         bc.getStatement();
         ba.deposit(203);
         ba.withdraw(1000);
         ba.getStatement();
         bb.deposit(204);
         bb.withdraw(1000);
         bb.getStatement();

     }
}