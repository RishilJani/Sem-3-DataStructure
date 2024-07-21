import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        double rad = sc.nextDouble();

        double area = Math.PI * rad * rad;
        System.out.println("Area = " + area);
        sc.close();
    }    
}
