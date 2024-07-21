import java.util.Scanner;

public class Sum_Of_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            temp += i;
            sum += temp;
        }
        System.out.println("Sum = " + sum);
    }
}