

public class DoublyLinkedList {
    DNode left = null;
    DNode right = null;

    public void insertAtFirst(int info){
        DNode newNode = new DNode(info);
        if (left == null) {
            left = newNode;
            right = newNode;
            return;
        }
        left.lptr = newNode;
        newNode.rptr = left;
        left = newNode;
    }
    public void insertAtLast(int info){
        DNode newNode = new DNode(info);
        if (right == null) {
            right = newNode;
            left = newNode;
            return;
        }
        right.rptr = newNode;
        newNode.lptr = right;
        right = newNode;
    }

    public void display(){
        DNode temp = left;
        while (temp != null) {
            System.out.print(temp.info + " ,");
            temp = temp.rptr;
        }
        System.out.println("\b ");
    }
}
