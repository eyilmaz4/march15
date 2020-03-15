package march15Codes;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee myEmployee = new Employee(999,"Esra","QA",5000, "yearly");
        System.out.println(myEmployee.employeeID +"\n"+myEmployee.employeeName+"\n"+myEmployee.employeeDepartment+"\n"+myEmployee.employeeSalary+"\n"+myEmployee.contractType);
    myEmployee.weeklyPayment(40);
    myEmployee.biWeeklyPayment(40);
    myEmployee.display();

    }
}
