package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismDemo {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Developer("Ram", 80000));
        employees.add(new Manager("Keshav", 100000));

        for (Employee emp : employees) {
            emp.displayRole();
            System.out.println("Bonus: " + emp.calculateBonus());
            System.out.println("--------------------");
        }
    }
}