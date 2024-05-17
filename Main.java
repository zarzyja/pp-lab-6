import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "Jan Kowalski", 5000.0);
        manager.setPosition("Manager");
        manager.setHireDate("2020-01-01");

        Worker worker1 = new Worker(2, "Piotr Nowak", 3000.0);
        worker1.setPosition("Worker");
        worker1.setHireDate("2020-02-01");

        Worker worker2 = new Worker(3, "Anna Wiśniewska", 3500.0);
        worker2.setPosition("Worker");
        worker2.setHireDate("2020-03-01");

        List<Employee> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(worker1);
        employees.add(worker2);

        for (Employee employee : employees) {
            ((Object) employee).work();
            System.out.println("-" + employee.getName() + " (ID: " + employee.getId() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
        }
    }
}