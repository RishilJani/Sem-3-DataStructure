import java.util.Scanner;

import MyFile.MyCharStack;

public class Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.next();
        sc.close();
        s += ')';
        MyCharStack m1 = new MyCharStack(s.length());
        m1.push('(');
        String polish = "";
        char temp = ' ';
        int i = 0, rank = 0;

        while (i < s.length()) {
            if (m1.isEmpty()) {
                System.out.println("Stack Underflow");
                return;
            }
            while (StackP(m1.peek()) > InputP(s.charAt(i))) {
                temp = m1.pop();
                polish += temp;
                rank += Rank(temp);
                if (rank < 0) {
                    System.out.println("Invalid");
                    return;
                }
            }
            if (StackP(m1.peek()) != InputP(s.charAt(i))) {
                m1.push(s.charAt(i));
            }
            else{
                m1.pop();
            }
            i++;
        }
        if (!m1.isEmpty() || rank !=1) {
            System.out.println("Invalid");
        }else{
            System.out.println("Valid");
            System.out.println("Polish = " + polish);
        }
    }

    public static int InputP(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 3;
        } else if (c == '^') {
            return 6;
        } else if (c == '(') {
            return 9;
        } else if (c == ')') {
            return 0;
        }
        return 7;
    }

    public static int StackP(char c) {
        if (c == '+' || c == '-') {
            return 2;
        } else if (c == '*' || c == '/') {
            return 4;
        } else if (c == '*') {
            return 5;
        } else if (c == '(') {
            return 0;
        }
        return 8;
    }

    public static int Rank(char c) {
        String opr = "*^+-/";
        if (opr.contains(c + "")) {
            return -1;
        }
        if (c == '(' || c == ')') {
            return 0;
        }
        return 1;
    }
}
