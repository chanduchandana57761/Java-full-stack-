
class Rectangle {
    private double length;
    private double width;

     double getLength() {
        return length;
    }

 void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Invalid length");
        }
    }

   double getWidth() {
        return width;
    }

     void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Invalid width");
        }
    }

     double calculateArea() {
        return length * width;
    }

     double calculatePerimeter() {
        return 2 * (length + width);
    }
}

 class Encapsulation {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.setLength(10);
        r.setWidth(5);

        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
        System.out.println("Area: " + r.calculateArea());
        System.out.println("Perimeter: " + r.calculatePerimeter());
    }
}

