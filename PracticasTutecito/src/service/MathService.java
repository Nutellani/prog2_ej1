package service;

public class MathService {

    public static void addition(double number1, double number2) {
        System.out.println("La Suma entre " + number1 + " y " + number2 + " es: " + (number1 + number2));
    }

    public static void rest(double number1, double number2) {
        System.out.println("La Resta entre " + number1 + " y " + number2 + " es: " + (number1 - number2));
    }
    
    public static void multiplication(double number1, double number2) {
        System.out.println("La Multiplicacion entre " + number1 + " y " + number2 + " es: " + (number1 * number2));
    }

    public static void division(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Is not possible to divide to zero");
        } else {
            System.out.println("La Division entre " + number1 + " y " + number2 + " es: " + (number1 / number2));
        }
    }
    
}
