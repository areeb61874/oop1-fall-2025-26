import java.util.Scanner;

class BnaAcc{

private long  accNumber=120928200;
private double balance;

public void deposit(double balance ){

this.balance=balance +this.balance;

System.out.println("Your amount has been deposited ");

}

public double withdraw(double balance){

this.balance=this.balance-balance;

System.out.println("You have withdrawn your amount ");
return this.balance;
}

public void displayInfo(){

System.out.println("-----YOUR BANK STATEMENT-----");
System.out.println("Your balance is : "+this.balance);
System.out.println("Your account number is : "+this.accNumber );

}

}
public class BankAccount {

public static void main(String args[]){
boolean g=true;
BnaAcc ba=new BnaAcc();
Scanner sc =new Scanner (System.in);
while(g){

System.out.println("-----BANK MENU-----");
System.out.println("Enter 1 to deposit "+"\n"+"Enter 2 to Withdraw"+"\n"+"Enter 3 to see Info ");
int x;

x=sc.nextInt();

switch(x){

case 1:
System.out.print("What amount do you want to deposit : ");
double a;
a=sc.nextDouble();
ba.deposit(a);
break;

case 2:
System.out.println("What amount do you want to withdraw : ");
double b;
b=sc.nextDouble();
if(ba.withdraw(b)<0){

System.out.println("You don't have sufficient balance, deposit first you broke ass shit");
}
else{
    ba.withdraw(b);
}
break;

case 3:
ba.displayInfo();

}


System.out.print("Do you want to do any more transactions: (yes/no)");

String choice ;
sc.nextLine();
choice =sc.nextLine();

if (choice.equalsIgnoreCase("yes")){



}
else {
    break;
}

}    

}

}
