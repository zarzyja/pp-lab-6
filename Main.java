public class Main {
    public static void main(String[] args) {
        // ...

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalary = 0;
        double managerSalary = 0;
        double workerSalary = 0;

        Map<Integer, Employee> idToEmployee = new HashMap<>();

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                managerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                workerSalary += employee.getSalary();
            }
            idToEmployee.put(employee.getId(), employee);
        }

        System.out.println("Total salary: " + totalSalary);
        System.out.println("Manager salary: " + managerSalary);
        System.out.println("Worker salary: " + workerSalary);

        System.out.println("Instances with the same id:");
        for (Employee employee : employees) {
            if (idToEmployee.containsValue(employee)) {
                System.out.println(employee);
            }
        }
    }
}
