import java.util.HashMap;
import java.util.Scanner;

import MyFile.MyCharStack;

// import MyFiles.MyCharStack;

public class GeneralPolish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.next();
        sc.close();
        s += ')';

        String opr = "*^+-/";
        MyCharStack n1 = new MyCharStack(s.length());
        n1.push('(');
        String postfix = "";
        int i = 0;
        while (i < s.length()) {
            if (opr.contains(s.charAt(i) + "")) {
                while (OperatorP(s.charAt(i), n1.peek())) {
                    postfix += n1.pop();
                }
                n1.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                while (n1.peek() != '(') {
                    postfix += n1.pop();
                }
                n1.pop();
            }else if(s.charAt(i) == '('){
                n1.push('(');
            }else{
                postfix += s.charAt(i);
            }
            i++;
        }
        System.out.println("Polish " + postfix);
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
            return false;
        } else {
            if (mp1.get(c1) <= mp1.get(c2)) {
                return true;
            }
        }
        return false;
    }
}
