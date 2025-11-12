import java.util.Scanner;

class Employee{

String name;
String id;
double salary;

}

class Mannager extends Employee{

double bonus;
int projectCount;

Mannager(String name,String id,double salary,double bonus,int projectCount){

this.name=name;
this.id=id;
this.salary=salary;
this.bonus=bonus;
this.projectCount=projectCount;

}

public void displayInfo(){

System.out.println("Your name is : "+this.name);
System.out.println("Your id number is : "+this.id);
System.out.println("Your expected salary is : "+this.salary);
System.out.println("You will get atleast "+this.bonus+"% bonus");
System.out.println("Your project count is : "+this.projectCount);

}
}

class Programmer extends Employee{

double bonus;
int projectCount;

Programmer(String name,String id,double salary,double bonus,int projectCount){

this.name=name;
this.id=id;
this.salary=salary;
this.bonus=bonus;
this.projectCount=projectCount;

}

public void displayInfo(){
System.out.println();
    System.out.println("-------EMPLOYEE INFO-------");

System.out.println("Your name is : "+this.name);
System.out.println("Your id number is : "+this.id);
System.out.println("Your expected salary is : "+this.salary+"$");
System.out.println("You will get atleast "+this.bonus+"% bonus");
System.out.println("Your project count is : "+this.projectCount);
this.salary+=(this.bonus*this.salary)/100;
System.out.println("The salary including bonus is : "+ this.salary);
}
}




public class AccountMannegement {

public static void main(String args []){

String name;
String id;
double salary;
String position;
double bonus;
int projectCount;

Scanner sc=new Scanner(System.in);

System.out.print("Enter your name : ");
name=sc.nextLine();
System.out.print("Enter your id number : ");
id=sc.nextLine();
System.out.print("Enter your expected salary : ");
salary=sc.nextDouble();
sc.nextLine();
System.out.print("Enter the position you are appling for (mannager/programmer): ");
position=sc.nextLine();
System.out.print("Enter your project counts : ");
projectCount=sc.nextInt();

if (position.equalsIgnoreCase("mannager")){
    bonus=15;
    Mannager mannarer=new Mannager(name, id, salary, bonus, projectCount);
    mannarer.displayInfo();
}
else if (position.equalsIgnoreCase("programmer") ){

bonus=5;
Programmer programmer=new Programmer(name, id, salary, bonus, projectCount);
programmer.displayInfo();

}
else{System.out.println("Invalid input");}
}

    
}
