package models;

public class Rectangle {

    private double height;
    private double length;

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

    // Height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calculatePerimeter() {
        return length * 2 + height * 2;
    }

    public double calculateArea(){
        return length * height;
    }
    
}
