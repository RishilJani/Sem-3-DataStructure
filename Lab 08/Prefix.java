import java.util.HashMap;
import java.util.Scanner;

import MyFile.MyCharStack;

// import MyFiles.MyCharStack;

public class Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.next();
        sc.close();
        String opr = "*^+-/";

        s = rev(s) + ')';

        MyCharStack n1 = new MyCharStack(s.length());
        n1.push('(');

        String postTemp = "";
        int i = 0;
        while (i < s.length()) {
            if (opr.contains(s.charAt(i) + "")) {
                while (OperatorP(s.charAt(i), n1.peek())) {
                    postTemp += n1.pop();
                }
                n1.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                while (n1.peek() != '(') {
                    postTemp += n1.pop();
                }
                n1.pop();
            } else if (s.charAt(i) == '(') {
                n1.push('(');
            } else {
                postTemp += s.charAt(i);
            }
            i++;
        }
        String ans = rev(postTemp);

        System.out.println("ans = " + ans);
    }

    public static boolean OperatorP(char c1, char c2) {
        HashMap<Character, Integer> mp1 = new HashMap<>();
        mp1.put('^', 3);
        mp1.put('*', 2);
        mp1.put('/', 2);
        mp1.put('+', 1);
        mp1.put('-', 1);

        mp1.put('(', 0);
        mp1.put(')', 0);

        if (c1 == '^') {
            if (c2 == '^') {
                return true;
            } else {
                return false;
            }
        } else {
            if (mp1.get(c1) < mp1.get(c2)) {
                return true;
            }
        }
        return false;
    }

    public static String rev(String s) {
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                temp += ')';
            } else if (s.charAt(i) == ')') {
                temp += '(';
            } else {
                temp += s.charAt(i);
            }
        }
        return temp;
    }
}