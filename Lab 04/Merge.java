import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr1 :");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Enter a[%d] ele : ",i);
            arr1[i] = sc.nextInt(); 
        }
        System.out.println("Enter size of arr1 :");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("Enter a[%d] ele : ",i);
            arr2[i] = sc.nextInt(); 
        }
        sc.close();
        int[] newArr = new int[arr1.length + arr2.length];
        int i;
        for (i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            newArr[i+j] = arr2[j];
        }

        System.out.println("newArr : ");
        for (int e : newArr) {
            System.out.print(e + " , ");
        }
    }
}