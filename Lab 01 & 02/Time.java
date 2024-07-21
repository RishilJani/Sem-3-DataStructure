import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds : ");
        int s = sc.nextInt();
        sc.close();
        int hh = (s / 3600);
        int mm = (s - hh*3600) / 60;
        int ss = s - (mm * 60) - (hh * 3600);

        System.out.println("HH:MM:SS = " + hh + ":" + mm + ":" + ss);
    }
}
