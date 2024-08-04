import java.util.Scanner;

public class CircularDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queue = ");
        int sz = sc.nextInt();
        CircularQueue q1 = new CircularQueue(sz);

        while (true) {
            System.out.println("1. for enqueue\n2. for dequeue\n3. display");
            int n = sc.nextInt();
            if (n == 4) {
                break;
            }
            int x;
            switch (n) {
                case 1:
                    System.out.println("Enter number to enqueue = ");
                    x = sc.nextInt();
                    q1.enqueue(x);  
                    break;
                case 2:
                    x = q1.dequeue();
                    System.out.println("Dequeue element = " + x);
                case 3:
                    q1.display();    
                    break;
            }
        }
        sc.close();
    }
}
