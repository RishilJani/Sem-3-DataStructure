import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 2; i <= n/2; i++) {
            if(n%i == 0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
