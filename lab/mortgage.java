import java.util.Scanner;
public class mortgage {
    
    public static void info(String name,String id,int age){

System.out.println(name+" "+id+" "+age);
if(age>=0 && age<=9){
    System.out.println(" your ticket price is 0$ ");
}
else if(age>=10 && age<=19){

    System.out.println("your ticket is 10$ ");
}
else
System.out.println("your ticket price is 15$");

    }


public static void main(String []args){
Scanner sc=new Scanner(System.in);
String name;
String id;
int age;
name=sc.nextLine();
id=sc.nextLine();
age=sc.nextInt();
info(name, id, age);



}


}