import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 = ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 = ");
        int b = sc.nextInt();

        System.out.println("a = " + a + " b = " + b);
        swapTwoNumbers(a, b);
        swapUsingXOR(a, b);
        sc.close();
    }

    private static void swapUsingXOR(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("XOR a = " + a + " b = " + b);
    }

    private static void swapTwoNumbers(int a, int b) {// 3 , 7
        a = a - b; 
        b = a + b;
        a = b - a;

        System.out.println("Without XOR a = " + a + " b = " + b);
    }
}
