import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char : ");
        char c = sc.next().charAt(0);
        sc.close();
        String vowel = "aeiouAEIOU";
        if(vowel.contains(c + "")){
            System.out.println("Vowel");
        }else{
            System.out.println("not a Vowel");
        }
    }
}
