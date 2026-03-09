public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        final double ratio = 9.0/5.0;
        final int common = 32;
        double celsius = 10.00;
        double fahrenheit = (celsius*ratio)+common;
        System.out.println(celsius + " degree celsius = " + fahrenheit + " degree fahrenheit");
    }
}
