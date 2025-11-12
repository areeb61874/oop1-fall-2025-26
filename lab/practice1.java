
import java.util.Scanner;
class studentVarification{

String name;
String ID;
int age;


public void DisplayInfo(String name,String ID,int age){

this.name=name;
this.ID=ID;
this.age=age;

System.out.println("Your name is :"+this.name+" \n"+"Your ID number is :"+this.ID+"\n"+"Your age is :"+age);



}





}








public class practice1 {

public static void main(String args[]){

studentVarification sv=new studentVarification();

String name,ID;
int age;

Scanner sc =new Scanner(System.in);

System.out.print("Enter your name: ");
name=sc.nextLine();
System.out.print("Enter your ID: ");
ID=sc.nextLine();
System.out.println("Enter  your age: ");
age=sc.nextInt();

sv.DisplayInfo(name,ID,age);
}    





    
}
