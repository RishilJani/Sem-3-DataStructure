import java.util.Scanner;

public class DeleteDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter a[%d] ele : ",i);
            arr[i] = sc.nextInt(); 
        }
        sc.close();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    temp++;
                }
            }
            count += temp;
        }
        System.out.println("Count =  " + count);
        int[] newArr = new int[arr.length - count];
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = i+1;
            for (; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j){
                    newArr[ind] = arr[i];
                    break;
                }
            }
            if(j == arr.length){
                newArr[ind] = arr[i];
                ind++;
            }
        }

        System.out.println("newArr : ");
        for (int i : newArr) {
            System.out.print(i + " , ");
        }
    }
}