import java.util.Scanner;

import MyFile.MyLinkedList;
import MyFile.Node;
public class Swap_LL {
    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        int[] arr = { 1, 2, 5, 18, 32, 58, 46 };
        for (int i = 0; i < arr.length; i++) {
            l1.insertAtLast(arr[i]);
        }
        l1.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k : ");
        int k = sc.nextInt();

        sc.close();
        if (l1.size() < k || k <= 0) {
            System.out.println("Enter Positive value less than " + l1.size());
            return;
        }
        swap(l1.first, k);
        l1.display();

    }

    public static void swap(Node first, int k) {
        Node n1 = first;
        // kth node from starting
        int count = 1;
        while (count < k && n1.next != null) {
            n1 = n1.next;
            count++;
        }

        Node n2 = first; 
        Node temp = n1; // starting from n1 (Kth node from starting)

        while (temp.next != null) {
            temp = temp.next;
            n2 = n2.next;
        }
        int val = n1.data;
        n1.data = n2.data;
        n2.data = val;
    }
}
