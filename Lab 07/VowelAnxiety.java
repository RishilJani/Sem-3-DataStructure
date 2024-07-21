import java.util.Scanner;

public class VowelAnxiety {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String[] str = new String[T];
        String[] answer = new String[T];
        for (int i = 0; i < str.length; i++) {
            sc.nextInt();
            str[i] = sc.next();
            answer[i] = rev(str[i]);
        }
        sc.close();
        for (String s : answer) {
            System.out.println(s);
        }
    }

    public static String rev(String s) {
        String vowel = "aeiou";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (vowel.contains(s.charAt(i) + "")) {
                StringBuffer str = new StringBuffer(ans.substring(0, i));
                ans = str.reverse().toString();
                ans += s.charAt(i);
            } else {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}
