import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queue : ");
        int size = sc.nextInt();
        SimpleQueue q1 = new SimpleQueue(size);
        int n;
        while (true) {
            System.out.println("\n1. for Enqueue\n2. for dequeue\n3. for display");
            n = sc.nextInt();
            if(n == 4){
                break;
            }
            int x;
            switch (n) {
                case 1:
                    System.out.println("Enter a number to enqueue : ");
                    x = sc.nextInt();
                    q1.enqueue(x);
                    break;
                case 2:
                    x = q1.dequeue();
                    System.out.println("Dequeue element = " + x);
                    break;
                case 3:
                    q1.display();
                    break;
            }
        }
        sc.close();
    }    
}
