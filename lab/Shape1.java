abstract class Shape{

public abstract double calculateArea();

public void displayShape(){
    System.out.println("Shape created .");
}

}

class Rectangle extends Shape {

public double length;
public double width;

Rectangle(double l,double w){

    length=l;
    width=w;
}

@Override
public double calculateArea(){

    return length*width;
    
}

}

class Circle extends Shape{

 public double radius;
 
 Circle (double r){
radius=r;
}
@Override
public double calculateArea(){
    return 3.14*radius*radius;
}

}




public class Shape1 {

public static void main (String args []){

Shape s1=new Circle(5);
Shape s2=new Rectangle(3, 05);

System.out.println("The area of the circle is : "+s1.calculateArea());

System.out.print("The area of the rectangle is : "+s2.calculateArea());




}


    
}
