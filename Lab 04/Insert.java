import java.util.Scanner;
public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arr :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter a[%d] ele : ",i);
            arr[i] = sc.nextInt(); 
        }
        System.out.println("Enter element and index to insert : ");
        int num = sc.nextInt();
        int ind = sc.nextInt();

        int[] newArr = new int[arr.length+1];
        
        for (int i = 0; i < newArr.length; i++) {
            if(i == ind){
                newArr[i] = num;

            }else if(i < ind){
                newArr[i] = arr[i];
            }else{
                newArr[i] = arr[i-1];
            }
            System.out.printf("newArr[%d] = %d\n",i,newArr[i]);
        }

        System.out.println("\nnewArr : ");
        for (int i : newArr) {
            System.out.print(i + " , ");
        }
        sc.close();
    }
}