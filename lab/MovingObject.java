import java.util.Scanner;

class vehicle{

String type;

}

class Car extends vehicle{

String name;
String model;

public void set(String name,String model,String type){

this.type=type;
this.name=name;
this.model=model;

}

public void displayInfo(){

System.out.println("The Type of vehicle is : "+this.type+"\n"+"The name of the vehicle is : "+this.name+"\n"+"The model of the vehicle is : "+this.model);

}
}

class Bike extends vehicle{

String name;
String model;

public void set(String name,String model,String type){

this.type=type;
this.name=name;
this.model=model;

}

public void displayInfo(){

System.out.println("The Type of vehicle is : "+this.type+"\n"+"The name of the vehicle is : "+this.name+"\n"+"The model of the vehicle is : "+this.model);


}
}




public class MovingObject{


public static void main(String args[]){

Car car=new Car();

car.set("Toyota", "HighLander", "FourWheelerLuxuryCar");
car.displayInfo();

}    }




