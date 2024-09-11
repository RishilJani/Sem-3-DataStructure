
import MyFile.MyLinkedList;
import MyFile.Node;

public class Mid {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7};
        MyLinkedList ml1 = new MyLinkedList();
        for (int i : data) {
            ml1.insertAtLast(i);
        }    
        ml1.display();

    }   
    public int mid(Node first){
        Node prev = first;
        Node curr = first;

        while (curr != null && curr.next != null) {
            curr = curr.next.next;
            prev = prev.next;
        }
        return prev.data;
    }
}
