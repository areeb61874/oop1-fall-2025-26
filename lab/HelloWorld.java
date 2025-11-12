
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args ){

    System.out.println("The score for 3 students are bellow");

    Scanner sc = new Scanner(System.in);

    double one = sc.nextDouble();
    double two =sc.nextDouble();
    double three =sc.nextDouble();


    double avarage =(one + two + three)/3;

    System.out.println("The avarage is "+ avarage);
    }
    
}
