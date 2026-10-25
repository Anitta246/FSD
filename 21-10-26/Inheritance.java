package Fundamentals;

public class Inheritance {

    public static void main(String[] args) {

        father f = new father();
        f.scooter();

        System.out.println();

        daughter d = new daughter();
        d.scooter();
        d.cycle();
    }
}

class father {
    int sbi = 100000;

    void scooter() {
        System.out.println("Father's SBI Balance: " + sbi);
        System.out.println("Father purchased a new scooter");
    }
}

class daughter extends father {
    int hdfc = 1000;

    void cycle() {
        System.out.println("Daughter's HDFC Balance: " + hdfc);
        System.out.println("Daughter received a cycle");
        System.out.println("Total Amount: " + (sbi + hdfc));
    }
}
