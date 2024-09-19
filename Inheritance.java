class Employee {
    String name, ph, address;
    int age, sal;

    public Employee(String name, int age, String ph, String address, int sal) {
        this.name = name;
        this.age = age;
        this.ph = ph;
        this.address = address;
        this.sal = sal;
    }

    void printSalary() {
        System.out.println("Salary is " + this.sal);
    }
}

class officer extends Employee {
    String specialisation, department;

    public officer(String name, int age, String ph, String address, int sal, String specialisation, String department) {
        super(name, age, ph, address, sal);
        this.specialisation = specialisation;
        this.department = department;
    }

}

class manager extends Employee {
    String specialisation, department;

    public manager(String name, int age, String ph, String address, int sal, String specialisation, String department) {
        super(name, age, ph, address, sal);
        this.specialisation = specialisation;
        this.department = department;
    }

}

public class Inheritance {
    public static void main(String[] args) {
        officer o = new officer("John", 25, "987654321", "House", 85000, "accountant", "finance");
        manager m = new manager("Sam", 28, "897546321", "Home", 94000, "Engineer", "IT");
        o.printSalary();
        m.printSalary();
    }
}
