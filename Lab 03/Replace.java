import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter num1 , num2 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(num1 == arr[i]){
                arr[i] = num2;
                System.out.println("ind = " + i);
            }
        }

        for (int i : arr) {
            System.out.print(i + " ,");
        }
        sc.close();
    }
}
