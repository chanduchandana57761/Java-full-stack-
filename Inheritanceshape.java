
class Shape {
    String color;

     void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

     double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    double calculateArea() {
        return length * width;
    }
}

class Inheritanceshape   {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.color = "Red";
        c.radius = 5;

        Rectangle r = new Rectangle();
        r.color = "Blue";
        r.length = 10;
        r.width = 5;

        System.out.println("Circle Details:");
        c.displayColor();
        System.out.println("Area: " + c.calculateArea());

        System.out.println();

        System.out.println("Rectangle Details:");
        r.displayColor();
        System.out.println("Area: " + r.calculateArea());
    }
}
