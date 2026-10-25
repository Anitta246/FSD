package Fundamentals;

public class BankAccount {
    public static void main(String[] args) {

        Savings s = new Savings();
        s.accNo = 101;
        s.balance = 15000;
        s.deposit(5000);
        s.show();

        System.out.println();

        Current c = new Current();
        c.accNo = 102;
        c.balance = 25000;
        c.withdraw(3000);
        c.show();
    }
}

class Bank {
    int accNo;
    int balance;

    void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

class Savings extends Bank {
    void deposit(int amount) {
        balance = balance + amount;
    }

    void show() {
        System.out.println("Savings Account");
        display();
    }
}

class Current extends Bank {
    void withdraw(int amount) {
        balance = balance - amount;
    }

    void show() {
        System.out.println("Current Account");
        display();
    }
}