package MyFile;
public class MyLinkedList {
    public Node first;

    public void insertAtFirst(int x) {
        Node newNode = new Node(x);

        if (first == null) {
            first = newNode;
            return;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertAtLast(int x) {
        Node newNode = new Node(x);

        if (first == null) {
            first = newNode;
            return;
        }
        Node temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void insertInOrder(int x) {
        Node newNode = new Node(x);
        if (first == null || first.data >= newNode.data) {
            newNode.next = first;
            first = newNode;
            return;
        }

        Node temp = first;
        while (temp.next != null && newNode.data >= temp.next.data) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void deleteNode(int x) {
        // if (first.data == x) {
        //     first = first.next;
        //     return;
        // }
        Node temp = first;
        while (temp.next != null) {
            if (temp.data == x) {
                temp.val = temp.next.val;
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }

    public Node deleteNodeAtFirst() {
        if (first == null) {
            return null;
        }
        Node temp = first;
        first = first.next;
        return temp;
    }

    public Node deleteNodeAtLast() {
        if (first == null) {
            return null;
        }
        Node temp = first;
        Node last = null;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        last = temp.next;
        temp.next = null;
        return last;
    }

    public void display() {
        Node current = first;
        System.out.print("\n[ ");
        while (current != null) {
            System.out.print(current.data + " ,");
            current = current.next;
        }
        System.out.println("\b] \n");
    }

    public int size() {
        if (first == null) {
            return 0;
        }
        int sz = 1;
        Node current = first.next;
        while (current != null) {
            sz++;
            current = current.next;
        }
        return sz;
    }

    public boolean isEquals(MyLinkedList start) {
        if (this.size() != start.size()) {
            return false;
        }
        Node n1 = first;
        Node n2 = start.first;

        while (n1 != null && n2 != null) {
            if (n1.data != n2.data) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return true;
    }

    public Node getValueAtLast() {
        if (first == null) {
            return null;
        }
        Node temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public Node copy() {

        Node begin = new Node(first.data);
        Node temp = first.next;
        Node pre = begin;
        while (temp != null) {
            pre.next = new Node(temp.data);
            pre = pre.next;
            temp = temp.next;
        }
        return begin;
    }

    public void sort() {
        if (first == null) {
            return;
        }
        Node i = first;
        while (i.next != null) {
            Node j = i.next;
            while (j != null) {
                if (i.data >= j.data) {
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
                j = j.next;
            }
            i = i.next;
        }
    }

    public void reverse() {
        if (first == null) {
            return;
        }
        Node rev = new Node(first.data);
        Node save = first;
        while (save != null) {
            Node temp = new Node(save.data);
            temp.next = rev;
            rev = temp;
            save = save.next;
        }
        first = rev;
    }

}