import java.util.Scanner;

public class Insert_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter a[%d] ele : ",i);
            arr[i] = sc.nextInt(); 
        }
        System.out.println("Enter number to insert : ");
        int num = sc.nextInt();
        int[] newArr = new int[arr.length+1];
        boolean isAdded = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < num){
                newArr[i] = arr[i];
            }else if(!isAdded){
                newArr[i] = num;
                i--;
                isAdded = true;
            }else{
                newArr[i+1] = arr[i];
            }
        }
        if (!isAdded) {
            newArr[newArr.length-1] = num;
        }
        System.out.println("newArr : ");
        for (int i : newArr) {
            System.out.print(i + " , ");
        }
        sc.close();
    }
}