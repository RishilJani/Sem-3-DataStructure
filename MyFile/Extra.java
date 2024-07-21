import java.util.ArrayList;
import java.util.List;

import MyFile.*;

public class Extra {
    public static void main(String[] args) {
        MyLinkedList m1 = new MyLinkedList();
        int[] data = { 2, 10, 9 };
        int[] nums = { 9, 2, 5 };
        for (int i = 0; i < data.length; i++) {
            m1.insertAtLast(data[i]);
        }
        Extra e1 = new Extra();
        m1.first = e1.modifiedList(nums, m1.first);
        m1.display();
    }

    public Node modifiedList(int[] nums, Node head) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : nums) {
            arr.add(i);
        }
        while (arr.contains(head.data)) {
            head = head.next;
        }
        Node temp = head;
        while (temp.next != null) {
            if (arr.contains(temp.next.data)) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
