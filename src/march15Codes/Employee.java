package march15Codes;

public class Employee {
    int employeeID;
    String employeeName;
    String employeeDepartment;
    double employeeSalary;
    String contractType;

    public  Employee(){
        this.employeeID=2536478;
        this.employeeName="Esra Yilmaz";
        this.employeeDepartment="QA TEsting";
        this.employeeSalary=5000;
        this.contractType="Yearly";
    }
    public Employee(int ID, String name, String dep, double salary,String contuc){
        this.employeeID=ID;
        this.employeeName=name;
        this.employeeDepartment=dep;
        this.employeeSalary=salary;
        this.contractType=contuc;
    }
    public void weeklyPayment(double hourly){
        double weekPay=hourly*40;
        System.out.println("weekly payment:"+weekPay);
    }
    public void biWeeklyPayment(double hourly){
        double biWeekPay=hourly*80;
        System.out.println("Biweekly Payment:"+biWeekPay);
    }
    public void display(){
        System.out.println(employeeID);
        System.out.println(employeeName);
        System.out.println(employeeDepartment);
        System.out.println(employeeSalary);
        System.out.println(contractType);

    }
}
