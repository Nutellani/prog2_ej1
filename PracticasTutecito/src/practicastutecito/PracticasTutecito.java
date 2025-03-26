package practicastutecito;

// POSIBLE AGREGAR EXCEPTIONS
import java.util.Scanner;
import service.MathService;

public class PracticasTutecito {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double number1 = scan.nextDouble();

        System.out.print("Ahora ingrese el otro numero pls: ");
        double number2 = scan.nextDouble();

        System.out.print("Ingrese una opcion: \n" + "1 para sumarlos \n2 para restarlos \n 3 para multiplicarlos \n4 para dividirlos ");
        int option = scan.nextInt();

        switch (option) {

            case 1:
                MathService.addition(number1, number2);
                break;

            case 2:
                MathService.rest(number1, number2);
                break;

            case 3:
                MathService.multiplication(number1, number2);
                break;

            case 4:
                MathService.division(number1, number2);
                break;

            default:
                System.out.println("Q mandaste crack ?? Opcion incorrecta");
                break;
        }
    }

}
