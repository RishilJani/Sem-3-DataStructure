import java.util.Scanner;

public class Multiplicatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("Enter arr1[%d][%d] = ",i,j);
                arr1[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("Enter arr2[%d][%d] = ",i,j);
                arr2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int[][] ans = new int[2][2];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                int temp = 0;
                for (int k = 0; k < arr2.length; k++) {
                    temp += arr1[i][j] * arr2[j][k];
                }
                ans[i][j] = temp; 
            }
        }

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}

/*
 [1  0] [1  0]
 [0  1] [0  1]
= 
 [1  ]
 */