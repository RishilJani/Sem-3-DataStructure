import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("1 ");
        for (int i = 2; i <= n/2; i++) {
            if(n%i==0){
                System.out.print(i + " ,");
            }
            
        }
        System.out.println(n);
        sc.close();
    }
}
