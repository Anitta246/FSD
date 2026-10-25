package Fundamentals;

public class MultilevelInheritance {

    public static void main(String[] args) {

        person p = new person();
        p.detail();

        System.out.println();

        employee e = new employee();
        e.detail();

        System.out.println();

        manager m = new manager();
        m.detail();
    }
}

class person {
    String name = "Maria Anitta";
    int age = 19;

    void detail() {
        System.out.println("Person Name: " + name);
        System.out.println("Person Age: " + age);
    }
}

class employee extends person {
    int id = 22;
    int salary = 100000;

    void detail() {
        super.detail();
        System.out.println("Employee ID: " + id);
        System.out.println("Monthly Salary: " + salary);
    }
}

class manager extends employee {
    String dep = "IT";

    void detail() {
        super.detail();
        System.out.println("Department: " + dep);
        System.out.println("Annual Salary: " + (salary * 12));
    }
}