import java.util.Scanner;

public class HammingDistance {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter T : ");
        int t = sc.nextInt();
        int i = 0;
        int[][] data = new int[t][];
        while (t > 0) {
            System.out.println("Enter size : ");
            int n = sc.nextInt();
            data[i] = new int[n];
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = sc.nextInt();
            }
            i++;
            t--;
        }
        sc.close();

    }
}
// System.out.println("Data : ");
// for (int j = 0; j < data.length; j++) {
//     System.out.println("Hello");
//     for (int j2 = 0; j2 < data[j].length; j2++) {
//         System.out.println("data[j][j2] = " + data[j][j2]);
//     }
// }