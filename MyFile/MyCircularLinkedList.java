package MyFile;
public class MyCircularLinkedList {
    Node first;
    Node last;

    public void insertAtFirst(int x) {
        Node newNode = new Node(x);
        if (first == null) {
            newNode.next = newNode;
            first = newNode;
            last = newNode;
            return;
        }
        last.next = newNode;
        newNode.next = first;
        first = newNode;
    }

    public void insertAtLast(int x) {
        Node newNode = new Node(x);
        if (last == null) {
            newNode.next = newNode;
            last = newNode;
            first = newNode;
            return;
        }
        last.next = newNode;
        newNode.next = first;
        last = newNode;
    }

    public void display() {
        Node temp = first;
        System.out.print("[");
        do {
            System.out.print(temp.data + " ,");
            temp = temp.next;
        } while (temp != first);
        System.out.println("\b]");
    }

    public int size(){
        int sz = 0;
        Node temp = first;
        do {
            sz++;
            temp = temp.next;
        } while (temp != first);
        return sz;
    }
}
