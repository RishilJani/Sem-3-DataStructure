import java.util.Scanner;

public class SumOfMatix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m & n : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        int[][] sum = new int[m][n];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("Enter arr1[%d][%d] = ",i,j);
                arr1[i][j] = sc.nextInt();
                sum[i][j] += arr1[i][j];
            }
        }
        
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("Enter arr2[%d][%d] = ",i,j);
                arr2[i][j] = sc.nextInt();
                sum[i][j] += arr2[i][j];
            }
        }
        sc.close();

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}