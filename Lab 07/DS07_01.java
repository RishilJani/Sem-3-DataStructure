import java.util.Scanner;


public class DS07_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maximum size of Stack : ");
        MyIntStack ms = new MyIntStack(sc.nextInt());

        int n = 0;
        while (n != 6) {
            System.out.println(
                    "\nEnter 1 to add element in stack\n2 to remove last element of stack\n3 to get any element from stack\n4 to change any element of stack \n5 to display stack \n6 for Exit\n n =");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter element to add : ");
                    int temp = sc.nextInt();
                    ms.push(temp);
                    break;

                case 2:
                    System.out.println("Last Element = " + ms.pop());
                    break;
                case 3:
                    System.out.println("Enter i = ");
                    int i = sc.nextInt();
                    System.out.println(i + "th element = " + ms.peep(i));
                    break;
                case 4:
                    System.out.println("Enter i & new Value of element = ");
                    int j = sc.nextInt();
                    int val = sc.nextInt();
                    ms.change(j, val);
                    break;
                case 5:
                    ms.display();
                default:
                    break;
            }
        }

        sc.close();
    }
}
