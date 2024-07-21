import MyFile.MyLinkedList;

public class Copy_LL {
    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        int[] arr = {2,3,5,8,9};
        for (int i = 0; i < arr.length; i++) {
            l1.insertAtLast(arr[i]);
        }
        
        l1.display();
        MyLinkedList l2 = new MyLinkedList();
        l2.first = l1.copy();
        l2.display();
    }    
}
