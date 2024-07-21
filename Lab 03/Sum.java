import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter m,n : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        sc.close();
    }    
}
