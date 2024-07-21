import java.util.Scanner;

public class String_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >='a' && c <= 'z'){
                str =str.replaceFirst(c+ "", (char) (c-32) + "" );
            }else if(c >= 'A' && c <= 'Z'){
                
                str = str.replaceFirst(c+ "", (char)(c+32) + "" );
            }
        }
        sc.close();
        System.out.println("Str = " + str);
    }
}