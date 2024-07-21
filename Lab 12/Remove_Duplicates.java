import MyFile.MyLinkedList;
import MyFile.Node;

public class Remove_Duplicates {
    public static void main(String[] args) {
        MyLinkedList ml1 = new MyLinkedList();
        int[] data = {1,1,6,13,13,13,27,27};
        for (int i : data) {
            ml1.insertAtLast(i);
        }
        ml1.first = toRemoveDuplicate(ml1.first);

        ml1.display();
    }
    public static Node toRemoveDuplicate(Node first){
        if(first == null){
            return null;
        }
        Node t1 = first;
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
        return first;
    }
}
