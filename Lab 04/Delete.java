import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter a[%d] ele : ",i);
            arr[i] = sc.nextInt(); 
        }
        System.out.println("Enter index to delete : ");
        int ind = sc.nextInt();
        int[] newArr = new int[arr.length-1];
        
        
        for (int i = 0; i < arr.length; i++) {
            if(i == ind){
                continue;
            }
            if(i < ind){
                newArr[i] = arr[i];
            }
            else{
                newArr[i-1]=arr[i];
            }
        }

        System.out.println("newArr : ");
        for (int i : newArr) {
            System.out.print(i + " , ");
        }
        sc.close();
    }
}