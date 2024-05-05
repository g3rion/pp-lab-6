// Main.java
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker5 = new Worker("Lewis Hamilton", 40000, 6, "2015-01-01", "Driver");
        Worker worker6 = new Worker("Sebastian Vettel", 30000, 7, "2016-02-02", "Driver");
        Worker worker7 = new Worker("Valtteri Bottas", 32000, 7, "2017-03-03", "Driver");
        Manager manager2 = new Manager("Toto Wolff", 150000, 8, "2014-05-05", "Team Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker5);
        employees.add(worker6);
        employees.add(worker7);
        employees.add(manager2);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " has code: " + employee.hashCode());
        }

        System.out.println("Comparing worker7 with:");
        System.out.println(worker7.getName() + " equals " + worker6.getName() + ": " + worker7.equals(worker6));
        System.out.println(worker7.getName() + " equals " + worker5.getName() + ": " + worker7.equals(worker5));
        System.out.println(worker7.getName() + " equals " + manager2.getName() + ": " + worker7.equals(manager2));
    }
}
