import java.util.Scanner;

public class Alphabetical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter arr[%d] = ", i);
            arr[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int k = 0;
                while (k < arr[i].length() && k < arr[j].length() && arr[i].charAt(k) == arr[j].charAt(k)) {
                    k++;
                }
                if (arr[i].charAt(k) > arr[j].charAt(k)) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("arr = [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("]");
    }
}
