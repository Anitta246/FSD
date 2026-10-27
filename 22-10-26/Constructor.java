package Fundamentals;

public class Constructor {

    public static void main(String[] args) {

        son s = new son();
        son i = new son(5);
        son n = new son("Maria Anitta Hiiiii");

        s.bike();
    }
}

class Father {
    String name = "Anitta";

    public void bike() {
        System.out.println("Father owns a Honda bike");
        System.out.println("Owner Name: " + name);
    }

    Father() {
        System.out.println("Father Default Constructor Called");
    }

    Father(int a) {
        System.out.println("Father Constructor Value: " + (a * 2));
    }

    Father(String s) {
        System.out.println("Hello from Father: " + s);
    }
}

class son extends Father {

    public void bike() {
        super.bike();
        System.out.println("Son is learning to ride the bike");
    }

    son() {
        super();
        System.out.println("Son Default Constructor Called");
    }

    son(int a) {
        super(a);
        System.out.println("Son Constructor Value: " + (a + 10));
    }

    son(String s) {
        super(s);
        System.out.println("Hello from Son: " + s);
    }
}