import MyFile.MyLinkedList;

public class Reverse_LL {
    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        int[] arr = {1,2,5,3,15};
        for (int i = 0; i < arr.length; i++) {
            l1.insertAtLast(arr[i]);
        }
        l1.display();
        l1.reverse();

        l1.display();
    }
}
