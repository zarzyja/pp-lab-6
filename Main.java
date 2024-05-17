import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker(1, "Piotr Nowak", 3000.0);
        worker1.setPosition("Worker");
        worker1.setHireDate("2020-02-01");

        Worker worker2 = new Worker(1, "Piotr Nowak", 3000.0);
        worker2.setPosition("Worker");
        worker2.setHireDate("2020-02-01");

        Worker worker3 = new Worker(2, "Anna Wiśniewska", 3500.0);
        worker3.setPosition("Worker");
        worker3.setHireDate("2020-03-01");

        Manager manager = new Manager(3, "Jan Kowalski", 5000.0);
        manager.setPosition("Manager");
        manager.setHireDate("2020-01-01");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println("Comparing worker2 with:");
        System.out.println("worker1: " + worker2.equals(worker1));
        System.out.println("worker3: " + worker2.equals(worker3));
        System.out.println("manager: " + worker2.equals(manager));
    }
}