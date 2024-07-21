import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  n : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            for (int c = 0; c <= i; c++) {
                System.out.print(nCr(i, c) + " ");
            }

            System.out.println("");
        }
    }

    private static int nCr(int n, int r) {
        int ans = fac(n) / (fac(n - r) * fac(r));
        return ans;
    }

    private static int fac(int n) {
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}
