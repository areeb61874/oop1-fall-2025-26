import java.util.Scanner;

class BankAccount {
    String name;
    double balance;

    // Constructor
    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void displayInfo() {
        System.out.println("Account Holder: " + this.name);
        System.out.println("Current Balance: " + this.balance);
    }
}

public class jiklo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter starting balance: ");
        double startBalance = sc.nextDouble();

        BankAccount ba = new BankAccount(name, startBalance);

        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        ba.deposit(amount);

        ba.displayInfo();
    }
}
