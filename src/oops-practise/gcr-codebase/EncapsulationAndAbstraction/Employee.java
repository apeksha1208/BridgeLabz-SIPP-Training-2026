package EncapsulationAndAbstraction;

public abstract class Employee {
    private int employeeId;
    private String employeeName;

    Employee(int employeeId,String employeeName){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
    }
    public abstract int calculateSalary();

    public void displayEmployeeInfo(){
        System.out.println("employee id is"+ employeeId);
        System.out.println("employee name is "+ employeeName);
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }

}
class FullTimeEmployee extends Employee{
    private int monthlySalary;
    FullTimeEmployee(int employeeId,String employeeName, int monthlySalary){
        super(employeeId,employeeName);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public  int  calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private int hourlyRate;
    PartTimeEmployee(int employeeId, String employeeName,int hoursWorked, int hourlyRate){
        super(employeeId ,employeeName);
    this.hoursWorked=hoursWorked;
    this.hourlyRate=hourlyRate;
}
    @Override
    public  int  calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
class mainEmployee{
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1,"Apeksha",30000);
        Employee e2 = new PartTimeEmployee(2,"vaishu",10,200);
        e1.displayEmployeeInfo();
        System.out.println("salary of id 1"+ e1.calculateSalary());
        e2.displayEmployeeInfo();
        System.out.println("salary of id 2" +e2.calculateSalary());
    }
}
