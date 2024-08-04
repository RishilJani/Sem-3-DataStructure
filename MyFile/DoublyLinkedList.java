package MyFile;
public class DoublyLinkedList {
    public DNode left = null;
    public DNode right = null;

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

    public void insertInOrder(int x){
        if (left == null) {
            return;
        }
        DNode newNode = new DNode(x);
        DNode save = left;
        if (newNode.info < left.info) {
            insertAtFirst(x);
            return;
        }
        while (save.rptr != null && newNode.info >= save.rptr.info) {
            save = save.rptr;
        }
        if (save.rptr == null) {
            insertAtLast(x);
            return;
        }
        newNode.rptr = save.rptr;
        save.rptr.lptr = newNode;
        newNode.lptr = save;
        save.rptr = newNode;

    }
    
    public void display(){
        DNode temp = left;
        System.out.print("\n[");
        while (temp != null) {
            System.out.print(temp.info + " ,");
            temp = temp.rptr;
        }
        System.out.println("\b]");
    }

    public void deleteNode(int x){
        if (left.info == x) {
            if (left == right) {
                left = right = null;
                return;
            }else{
                left = left.rptr;
                left.lptr = null;
                return;
            }
        }
        DNode temp = left;
        while (temp.rptr != null && temp.rptr.info != x) {
            temp = temp.rptr;
        }
        if (temp.rptr != null) {
            temp.rptr = temp.rptr.rptr;
            temp.rptr.lptr = temp; 
        }
    }

    public int size(){
        DNode temp = left;
        int sz = 0;
        while (temp != null) {
            temp = temp.rptr;
            sz++;
        }
        return sz;
    }
}
