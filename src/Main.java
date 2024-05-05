import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Robert Kubica", 15000, 1, "2019-01-01", "Driver");
        Worker worker2 = new Worker("Sergio Perez", 26000, 2, "2018-02-02", "Driver");
        Worker worker3 = new Worker("Max Verstappen", 35000, 3, "2017-03-03", "Driver");
        Worker worker4 = new Worker("Charles Leclerc", 12000, 4, "2016-04-04", "Driver");
        Manager manager = new Manager("Christian Horner", 100000, 5, "2015-05-05", "Team Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
        }
    }
}
