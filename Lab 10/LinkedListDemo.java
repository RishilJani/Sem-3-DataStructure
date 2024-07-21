import java.util.Scanner;

import MyFile.MyLinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n != -1) {
            System.out.print(
                    "1. for insert at first\n2. for insert at last\n3. for inesrt in sorted list\n4. for delete\n5. display \n-1. For Exit\nn = ");
            n = sc.nextInt();
            int x;
            switch (n) {
                case 1:
                    System.out.println("Enter value to insert at first : ");
                    x = sc.nextInt();
                    l1.insertAtFirst(x);
                    break;
                case 2:
                    System.err.println("Enter value to insert at last : ");
                    x = sc.nextInt();
                    l1.insertAtLast(x);
                    break;
                case 3:
                    System.out.println("Enter value to insert in sorted : ");
                    x = sc.nextInt();
                    l1.insertInOrder(x);
                    break;
                case 4:
                    System.err.println("Enter value to delete : ");
                    x = sc.nextInt();
                    l1.deleteNode(x);
                    break;
                case 5:
                    l1.display();
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
