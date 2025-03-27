package service;

public class RectangleService {

    public static void higherArea(double area1, double area2) {

        if (area1 < area2) {
            System.out.println("El area mas grande es del SEGUNDO Rectangulo");
        } else if (area1 > area2){
            System.out.println("El area mas grande es del PRIMER Rectangulo");
        } else {
            System.out.println("Ambos tienen el mismo area");
        }

    }

    public static void higherPerimeter(double perimeter1, double perimeter2) {
        
        if (perimeter1 < perimeter2) {
            System.out.println("El perimetro mas grande es del SEGUNDO Rectangulo");
        } else if(perimeter1 > perimeter2) {
            System.out.println("El perimetro mas grande es del PRIMER Rectangulo");
        } else {
            System.out.println("Ambos tienen el mismo perimetro");
        }
    }

}
