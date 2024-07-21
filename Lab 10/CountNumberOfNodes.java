import MyFile.MyCircularLinkedList;

public class CountNumberOfNodes {
    public static void main(String[] args) {
        MyCircularLinkedList cl1 = new MyCircularLinkedList();

        cl1.insertAtFirst(5);
        cl1.insertAtFirst(10);
        cl1.insertAtLast(15);
        cl1.insertAtLast(20);
        
        cl1.display();
        System.out.println("Size = " + cl1.size());
    }
}