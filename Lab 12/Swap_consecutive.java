import MyFile.MyLinkedList;
import MyFile.Node;

public class Swap_consecutive {
    public static void main(String[] args) {
        MyLinkedList ml1 = new MyLinkedList();
        ml1.insertAtLast(1);
        ml1.insertAtLast(2);
        ml1.insertAtLast(3);
        ml1.insertAtLast(4);
        ml1.insertAtLast(5);
        ml1.insertAtLast(6);
        ml1.insertAtLast(7);
        ml1.insertAtLast(8);
        ml1.display();

        ml1.first = swap(ml1.first);
        ml1.display();
    }

    public static Node swap(Node first) {
        Node temp = first.next;
        first.next = temp.next;
        temp.next = first;
        first = temp;

        Node pre = temp.next;

        Node save = pre.next;
        while (save != null && save.next != null) {

            temp = save.next;
            save.next = temp.next;
            temp.next = save;

            pre.next = temp;

            pre = save;
            save = pre.next;
        }
        return first;
    }
}
