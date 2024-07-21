import java.util.Scanner;

import MyFile.MyCharStack;

// import MyFiles.MyCharStack;

public class DS07_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number test case : ");
        int len = sc.nextInt();
        String[] str = new String[len];
        int[] ans = new int[len];

        for (int i = 0; i < str.length; i++) {
            System.out.println("Enter " + i + "th String : ");
            str[i] = sc.next();
        }
        for (int i = 0; i < str.length; i++) {
            if (isValid(str[i])) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println("ans[i] = " + ans[i]);
        }
        sc.close();
    }

    private static boolean isValid(String s) {
        MyCharStack ms1 = new MyCharStack(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                ms1.push(s.charAt(i));
            } else {
                if (s.charAt(i) == ')' && ms1.peek() == '(') {
                    ms1.pop();
                } else if (s.charAt(i) == '}' && ms1.peek() == '{') {
                    ms1.pop();
                } else if (s.charAt(i) == ']' && ms1.peek() == '[') {
                    ms1.pop();
                }
            }
        }
        return ms1.isEmpty();
    }
}