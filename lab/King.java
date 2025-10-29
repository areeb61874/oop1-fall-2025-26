
import java.util.Scanner;


public class King {
    

    public static void main(String[] args){

    System.out.println("Enter the price of the product :");

    Scanner sc = new Scanner(System.in);

    double price = sc.nextDouble();

    if (price >=250){

    price =price -(price*15)/100;

    }

    System.out.println("You have to pay :" + price);



    }
}
