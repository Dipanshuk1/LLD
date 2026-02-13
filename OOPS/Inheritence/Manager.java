package Inheritence;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting.");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;  // Managers get highest bonus
    }
}