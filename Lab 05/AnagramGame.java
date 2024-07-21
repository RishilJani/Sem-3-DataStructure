import java.util.Scanner;

public class AnagramGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        String[] words = new String[n];
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Enter words[%d] = ", i);
            words[i] = sc.next();
        }
        int num = (int)(Math.random() * (n - 1));
        System.out.println("num = " + num);
        System.out.println("Enter anagram of word : " + words[num]);
        String str = sc.next();

        if (isAnagram(words[num], str)) {
            System.out.println("str = " + str);
            System.out.println("Anagram");
        } else {
            System.out.println("not Anagram");
        }
        sc.close();

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        s = s.toLowerCase();
        t = t.toLowerCase();
        int[] c1 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            c1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            c1[t.charAt(i) - 'a']--;
        }

        for (int i : c1) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
