package Inheritence;

public class InheritanceDemo {

    public static void main(String[] args) {

        Developer dev = new Developer("Ram", 80000);
        dev.work();
        dev.writeCode();
        System.out.println("Developer Bonus: " + dev.calculateBonus());

        System.out.println("----------------------");

        Manager manager = new Manager("Keshav", 100000);
        manager.work();
        manager.conductMeeting();
        System.out.println("Manager Bonus: " + manager.calculateBonus());
    }
}
