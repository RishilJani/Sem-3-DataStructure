import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        
        double avg = (n * (n-1)) / (2.0 * n);

        System.out.println("Avg = " + avg);
        sc.close();
    }
}
