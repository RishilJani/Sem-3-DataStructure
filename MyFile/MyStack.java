package MyFile;


import java.lang.reflect.*;

public class MyStack<E> {
    private E[] arr;
    int top = -1;

    @SuppressWarnings("unchecked")
    MyStack(Class<E> cls, int n) {
        arr = (E[]) Array.newInstance(cls, n);
    }

    public void push(E val) {
        if (top == arr.length) {
            System.out.println("Operation failed! stack overflow!!");
            return;
        }
        top++;
        arr[top] = val;
    }

    public E pop() {
        if (top == -1) {
            System.out.println("Operation failed! stack Underflow!!");
            return null;
        }
        top--;
        return arr[top + 1];
    }

    public E peep(int ind) {
        if (top - ind + 1 < 0) {
            System.out.println("Operation failed : IndexOutOfBound!");
            return null;
        }
        return arr[top - ind + 1];
    }

    public void change(int ind, E val) {
        if (top - ind + 1 < 0) {
            System.out.println("Operation failed : IndexOutOfBound!");
            return;
        }
        arr[top - ind + 1] = val;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty. ");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    public E peek(){
        if (top == -1) {
            System.out.println("Stack Underflow !!");
            return null;
        }
        return arr[top];
    }

}
