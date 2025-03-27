package javaapplication2;

import java.util.Scanner;
import models.Rectangle;
import service.RectangleService;

public class JavaApplication2 {

    public static void main(String[] args) {

        double height, length;
        double area1, area2, perimeter1, perimeter2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el valor de la base de su rectangulo: ");
        height = scan.nextDouble();

        System.out.print("Ingrese el valor de la altura de su rectangulo: ");
        length = scan.nextDouble();

        Rectangle rect1 = new Rectangle(height, length);
        
        System.out.println(rect1.calculatePerimeter());

        System.out.print("Ingrese el valor de la base de su 2do rectangulo: ");
        height = scan.nextDouble();

        System.out.print("Ingrese el valor de la altura de su 2do rectangulo: ");
        length = scan.nextDouble();

        Rectangle rect2 = new Rectangle(height, length);
        
        System.out.println(rect2.calculatePerimeter());
        
        area1 = rect1.calculateArea();
        perimeter1 = rect1.calculatePerimeter();
        area2 = rect2.calculateArea();
        perimeter2 = rect2.calculatePerimeter();
        
        RectangleService.higherArea(area1, area2);
        RectangleService.higherPerimeter(perimeter1, perimeter2);
        
    }

}
