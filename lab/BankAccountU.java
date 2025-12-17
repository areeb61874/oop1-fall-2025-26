class BankAcc{

private String accountNo;
private double balance;    

public void deposit (double balance){
    this.balance+=balance;
    System.out.println("You have deplosited : "+balance+"$");
}
public void withdraw(double balance){
        this.balance-=balance;}
    
public double getBalance(){
    
    return this.balance;
}
}

class SavingsAccount extends BankAcc{

@Override    
public void withdraw(double balance){

if(getBalance()>=balance){
    System.out.println("You have withdrawn "+ balance +"$"+"\n"+"4% interest has been charged for the transaction.");
super.withdraw(balance+(balance*4)/100);

}    
else {
    System.out.println("Don't have sufficient balance .");
}
}

}
class CurrentAcc extends BankAcc{

@Override
public void withdraw(double balance){

if ((getBalance()+5000)>=balance){
    System.out.println("You have widthdrawn : "+balance);

    if(balance>getBalance()){
        System.out.println("You have widthdrawn "+getBalance()+"$ from the balance. ");
        System.out.println(balance-getBalance()+"$ has been given as loan.");
    }
    else {System.out.println(balance+"$ has been widthdrawn.");}
}  
else {System.out.println("Extend your card limit or deposit money .");}  
super.withdraw(balance);
}
    

}





public class BankAccountU {

public static void main(String args []){

//BankAcc a1= new SavingsAccount();
//a1.deposit(10000);
//a1.withdraw(5000);
BankAcc c1=new CurrentAcc();
c1.deposit(7000);
c1.withdraw(10000);
}    
}