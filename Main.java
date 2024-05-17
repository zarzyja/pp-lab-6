public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan", 5000, 1);
        Worker worker2 = new Worker("Maria", 6000, 2);
        Worker worker3 = new Worker("Piotr", 7000, 3);
        Worker worker4 = new Worker("Agnieszka", 8000, 4);

        Manager manager = new Manager("Katarzyna", 10000, 5);

        System.out.println("Salary: " + worker1.getSalary());
        worker1.work();

        System.out.println("Salary: " + worker2.getSalary());
        worker2.work();

        System.out.println("Salary: " + worker3.getSalary());
        worker3.work();

        System.out.println("Salary: " + worker4.getSalary());
        worker4.work();

        System.out.println("Salary: " + manager.getSalary());
        manager.work();
    }
}