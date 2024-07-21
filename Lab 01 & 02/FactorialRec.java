import java.util.Scanner;

public class FactorialRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("n! = " + fac(n));
    }
    private static int fac(int n){
        if(n == 1){
            return 1;
        }
        return n * fac(n-1);
    }
}
