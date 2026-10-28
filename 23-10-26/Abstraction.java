
package Fundamentals;

public class Abstraction {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.deposit();
        s.withdrawal();
        s.carLoan();
        s.houseLoan();
        s.educationLoan();
        s.agriLoan();

        HondoCity h = new HondoCity();
        h.BS6();
        h.DualDiskBreaks();
        h.AirBags();
        h.RootsHorn();
        h.SonyMediaPlayer();
    }
}

abstract class RBI {
    void deposit() {
        System.out.println("Deposit Method");
    }

    void withdrawal() {
        System.out.println("Withdrawal Method");
    }

    abstract void educationLoan();
    abstract void agriLoan();
}

class SBI extends RBI {
    void carLoan() {
        System.out.println("ROI 11.25%");
    }

    void houseLoan() {
        System.out.println("ROI 13.25%");
    }

    void educationLoan() {
        System.out.println("ROI 9%");
    }

    void agriLoan() {
        System.out.println("Agriculture Loan");
    }
}

interface RTO {
    void BS6();
    void DualDiskBreaks();
    void AirBags();
}

class HondoCity implements RTO {
    void RootsHorn() {
        System.out.println("Roots Horn");
    }

    void SonyMediaPlayer() {
        System.out.println("Sony Media Player");
    }

    public void BS6() {
        System.out.println("BS6 Engine");
    }

    public void DualDiskBreaks() {
        System.out.println("Dual Disk Brakes");
    }

    public void AirBags() {
        System.out.println("Air Bags");
    }
}
