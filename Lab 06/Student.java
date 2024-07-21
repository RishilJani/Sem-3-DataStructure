import java.util.Scanner;

class Student_Detail {
    long Enrollment_No;
    String name;
    int semester;
    float CPI;

    public Student_Detail(long Eno, String name, int sem, float CPI) {
        this.Enrollment_No = Eno;
        this.name = name;
        this.semester = sem;
        this.CPI = CPI;
    }

    public void printInfo() {
        System.out.println("\nEnroll : " + this.Enrollment_No);
        System.out.println("Name : " + this.name);
        System.out.println("Semester : " + this.semester);
        System.out.println("CPI : " + this.CPI);
        System.out.println("\n");
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_Detail[] stu = new Student_Detail[5];

        
        for (int i = 0; i < stu.length; i++) {
            System.out.println("Enter " + i + "th Enrollment no : ");
            long e1 = sc.nextLong();

            System.out.println("Enter " + i + "th name : ");
            String n1 = sc.next();

            System.out.println("Enter " + i + "th Semester : ");
            int s1 = sc.nextInt();

            System.out.println("Enter " + i + "th CPI : ");
            float c1 = sc.nextFloat();

            stu[i] = new Student_Detail(e1, n1, s1, c1);
        }

        for (int i = 0; i < stu.length; i++) {
            stu[i].printInfo();
        }
        sc.close();
    }
}
