import java.util.Scanner;

public class Array_Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter a[%d] ele : ", i);
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Sum = " + sum(arr));
        System.out.println("Min = " + min(arr));
        System.out.println("Max = " + max(arr));
        System.out.println("avg = " + avg(arr));
    }
    private static int sum(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans+= arr[i];
        }
        return ans;
    }

    private static int min(int[] arr){
        int ans = Integer.MAX_VALUE;
        for (int i : arr) {
            ans = Math.min(ans, i);
        }
        return ans;
    }
    
    private static int max(int[] arr){
        int ans = Integer.MIN_VALUE;
        for (int i : arr) {
            ans = Math.max(ans, i);
        }
        return ans;
    }

    private static float avg(int[] arr){
        float avg = sum(arr);
        avg = avg / arr.length;
        return avg;
    }
}