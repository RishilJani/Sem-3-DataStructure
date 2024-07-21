import MyFile.MyLinkedList;
import MyFile.Node;

class Stack_LinkedList {
    MyLinkedList st1 = new MyLinkedList();

    public void push(int x) {
        st1.insertAtLast(x);
    }

    public int pop() {
        Node last = st1.deleteNodeAtLast();
        if (last == null) {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return last.data;
    }

    public void display() {
        st1.display();
    }

    public int peek(){
        Node last = st1.getValueAtLast();
        if (last == null) {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return last.data;
    }

}

public class StackByList {
    public static void main(String[] args) {
        Stack_LinkedList sl1 = new Stack_LinkedList();

        sl1.push(15);
        sl1.display();

        sl1.push(20);
        sl1.display();

        sl1.pop();
        sl1.display();

        System.out.println("last value = " + sl1.peek());
    }
}