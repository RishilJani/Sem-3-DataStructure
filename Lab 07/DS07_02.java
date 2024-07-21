import java.util.Scanner;

import MyFile.MyCharStack;

// import MyFiles.MyCharStack;


public class DS07_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.next();
        MyCharStack ms1 = new MyCharStack(str.length() + 1);

        if (isSame(str, ms1)) {
            System.out.println("Valid String");
        } else {
            System.out.println("Invalid String");
        }
        sc.close();
    }

    private static boolean isSame(String s, MyCharStack ms1) {
        int i = 0;
        ms1.push('c');
        while (i < s.length() && s.charAt(i) != 'c') {
            ms1.push(s.charAt(i));
            i++;
        }
        if (i == s.length()) {
            return false;
        }
        i++;
        while (i < s.length()) {
            if (ms1.pop() != s.charAt(i)) {
                return false;
            }
            i++;
        }
        if (ms1.pop() == 'c') {
            return true;
        }
        return false;
    }
}
