package Inheritence;

public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public double calculateBonus() {
        return salary * 0.10;
    }
}
