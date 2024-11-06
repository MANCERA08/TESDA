interface Shape {
     public double calculateArea();
     public double calculatePerimeter();
}
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;
    double radius;

    AbstractShape(String color, double length, double width, double radius) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.radius = radius;
    }
    public abstract double calculateArea();  
    public abstract double calculatePerimeter(); 
}
class Circle extends AbstractShape {
    public Circle(String color, double radius) {
        super(color, 0, 0, radius);
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; 
    }
}
class Rectangle extends AbstractShape {

    Rectangle(String color, double length, double width) {
        super(color, length, width, 0);
    }

    @Override
    public double calculateArea() {
        return length * width;  
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);  
    }
}
public class Tasksheet128 {
    public static void main(String[] args) {

        Circle circle = new Circle("White", 3);
        double circle_area = circle.calculateArea();
        double circle_perimeter = circle.calculatePerimeter();

        Rectangle rectangle = new Rectangle("Black", 10, 6);
        double rectangle_area = rectangle.calculateArea();
        double rectangle_perimeter = rectangle.calculatePerimeter();

        System.out.println(circle.color + " Circle" + "\nCircle Area: " + circle_area + 
                           "\nCircle Peremeter: " + circle_perimeter + "\n");
        System.out.println(rectangle.color + " Rectangle" + "\nRectangle Area: " + rectangle_area + 
                           "\nRectangle Peremeter: " + rectangle_perimeter + "\n");
    }
}
