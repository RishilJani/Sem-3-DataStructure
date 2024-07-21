// import MyFiles.*;

import MyFile.MyLinkedList;
import MyFile.Node;

public class DeleteDuplicates {

    public static void main(String[] args) {
        MyLinkedList m1 = new MyLinkedList();
        int[] arr = {1,2,2};
        for (int i = 0; i < arr.length; i++) {
            m1.insertAtLast(arr[i]);
        }        
        m1.display();
        
        Node t1 = m1.first;
        while (t1 != null) {
            Node t2 = t1;
            while (t2.next != null) {
                if (t1.data == t2.next.data) {
                    t2.next = t2.next.next;
                    continue;
                }
                t2 = t2.next;
            }
            t1 = t1.next;
        }
        System.out.println("t1 = " + t1);
        m1.display();
    }
}  