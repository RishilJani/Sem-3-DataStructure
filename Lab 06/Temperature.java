import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit to convert : ");
        String str = sc.next();
        if(str.toLowerCase().charAt(0)== 'c'){
            System.out.println("Enter celsius : ");
            float c = sc.nextFloat();
            System.out.println("Fahrenheit = " + celsiusToFahrenheit(c));
        }
        else if(str.toLowerCase().charAt(0)== 'f'){
            System.out.println("Enter fahrenheit : ");
            float f = sc.nextFloat();
            System.out.println("Celsius = " + fahrenheitToCelsius(f));
        }
        sc.close();
    }

    private static float celsiusToFahrenheit(float c) {
        return (c * (9 / 5f)) + 32;
    }
    private static float fahrenheitToCelsius(float f) {
        return (f - 32) * (5/9);
    }
}
