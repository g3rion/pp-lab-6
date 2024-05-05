import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Robert Kubica", 15000, 1);
        Worker worker2 = new Worker("Sergio Perez", 26000, 2);
        Worker worker3 = new Worker("Max Verstappen", 35000, 3);
        Worker worker4 = new Worker("Charles Leclerc", 12000, 4);
        Manager manager = new Manager("Christian Horner", 100000, 5);

        Worker[] workers = {worker1, worker2, worker3, worker4};
        for (Worker worker : workers) {
            System.out.println("Worker's salary: " + worker.getSalary());
            worker.work();
        }

        System.out.println("Manager's salary: " + manager.getSalary());
        manager.work();
    }
}
