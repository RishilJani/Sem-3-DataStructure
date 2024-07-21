import java.util.Scanner;

class Employee_Detail {
    int employee_Id;
    String name;
    String designation;
    float salary;

    public Employee_Detail(int employee_Id, String name, String designation, float salary) {
        this.employee_Id = employee_Id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    public void printInfo(){
        System.out.println("Id = " + this.employee_Id);
        System.out.println("name = " + this.name);
        System.out.println("designation = " + this.designation);
        System.out.println("salary = " + this.salary);
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employer's Id , name , designation , salay : ");
        Employee_Detail ed1 = new Employee_Detail(sc.nextInt(), sc.next(), sc.next(), sc.nextFloat());

        ed1.printInfo();
        sc.close();
    }
}
