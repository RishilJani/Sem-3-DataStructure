import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            System.out.print(i + " ,");
        }
        sc.close();
    }
}