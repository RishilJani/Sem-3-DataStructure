import java.util.Scanner;

/**
 * Days
 */
public class Days {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days : ");
        int d = sc.nextInt();

        int yy = d / 365;
        int ww = (d - yy * 365) / 7;
        int dd = d - ww * 7 - yy * 365;

        System.out.println("YY:WW:DD = " + yy + ":" + ww + ":" + dd);
        sc.close();
    }
}