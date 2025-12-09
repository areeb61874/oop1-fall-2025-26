class Car{
String name;
String model;
double price;

public void CarDetails(String name,String model,double price){

this.name=name;
this.model=model;
this.price=price;
}

public void displayInfo(){
System.out.println("Car name:"+this.name);
System.out.println("car model:"+this.model);
System.out.println("Car price:"+this.price);
}

}




public class carVision {
public static void main(String[] args) {
 Car ca=new Car();
 ca.CarDetails("Toyota", "bmx0", 2000000);
ca.displayInfo();
}   
}
