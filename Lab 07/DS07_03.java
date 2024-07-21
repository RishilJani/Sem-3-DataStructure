import java.util.Scanner;

import MyFile.MyCharStack;

// import MyFiles.MyCharStack;

public class DS07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter string : ");
        String str = sc.next();
        MyCharStack msA = new MyCharStack(str.length());
        MyCharStack msB = new MyCharStack(str.length());

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a'){
                msA.push('a');
            }else{
                msB.push('b');
            }
        }
        sc.close();
        if(msA.top == msB.top){
            System.out.println("Valid string");
            return;
        }
        System.out.println("Invalid string");
    }
}
