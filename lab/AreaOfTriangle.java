import java.util.Scanner;

class AreaOfTriangleCalculator {

    private Double length;
    private Double height;

    AreaOfTriangleCalculator(Double length, Double height) {
        this.length = length;
        this.height = height;
    }

    public Double area() {
        return 0.5 * this.length * this.height;
    }
}

public class AreaOfTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        Double length = sc.nextDouble();

        System.out.print("Enter the height: ");
        Double height = sc.nextDouble();

        AreaOfTriangleCalculator triangle = new AreaOfTriangleCalculator(length, height);

        System.out.println("Area of triangle: " + triangle.area());

        sc.close();
    }
}
