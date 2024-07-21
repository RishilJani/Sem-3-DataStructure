import java.util.Scanner;

public class Position {
    public static void main(String[] args) {
        int minInd = 0;
        int minn = Integer.MAX_VALUE;
        int maxInd = 0;
        int maxx = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            if(maxx < arr[i]){
                maxx = arr[i];
                maxInd = i;
            }
            if(minn > arr[i]){
                minn = arr[i];
                minInd = i;
            }
        }
        System.out.println(minInd + " , " + maxInd);
    }
}
