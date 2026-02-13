package Inheritence;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    public void writeCode() {
        System.out.println(name + " is writing code.");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;  // Developers get higher bonus
    }
}