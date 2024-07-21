// import MyFiles.*;

import MyFile.MyLinkedList;
import MyFile.Node;

class Queue_LinkedList{
    MyLinkedList q1 = new MyLinkedList();
    
    public void push(int x){
        q1.insertAtLast(x);
    }
    
    public int pop(){
        Node last = q1.deleteNodeAtFirst();
        if (last == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return last.data;
    }

    public void display(){
        q1.display();
    }
}

public class QueueByList {
    public static void main(String[] args) {
        Queue_LinkedList q1 = new Queue_LinkedList();
        q1.push(15);
        q1.push(20);
        q1.push(25);

        q1.display();

        System.out.println(q1.pop());
        q1.display();
    }
}
