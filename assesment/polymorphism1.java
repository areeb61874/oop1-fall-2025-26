
class Shape {

    
    Shape() {
        System.out.println("Shape created");
    }

    
    double area() {
        return 0.0;
    }

   
    double area(double x) {
        return x;
    }
}


class Circle extends Shape {
    double radius;

    
    Circle() {
        radius = 0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

  
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    double length, width;

    
    Rectangle() {
        length = 0;
        width = 0;
    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

  
    @Override
    double area() {
        return length * width;
    }
}


public class polymorphism1 {
    public static void main(String[] args) {

        
        Shape s;

        s = new Circle(5);
        System.out.println("Area of Circle: " + s.area());

        s = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + s.area());
    }
}
