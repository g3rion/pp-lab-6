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

        Worker worker8 = new Worker("Daniel Ricciardo", 28000, 6, "2018-06-06", "Driver");
        Manager manager3 = new Manager("Cyril Abiteboul", 110000, 8, "2013-07-07", "Team Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker5);
        employees.add(worker6);
        employees.add(worker7);
        employees.add(manager2);
        employees.add(worker8);
        employees.add(manager3);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Total salary of all employees: " + totalSalary);
        System.out.println("Total salary of all managers: " + totalManagerSalary);
        System.out.println("Total salary of all workers: " + totalWorkerSalary);

        List<Employee> duplicateIdEmployees = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).equals(employees.get(j))) {
                    if (!duplicateIdEmployees.contains(employees.get(i))) {
                        duplicateIdEmployees.add(employees.get(i));
                    }
                    if (!duplicateIdEmployees.contains(employees.get(j))) {
                        duplicateIdEmployees.add(employees.get(j));
                    }
                }
            }
        }

        System.out.println("Employees with duplicate IDs:");
        for (Employee employee : duplicateIdEmployees) {
            System.out.println(employee.getName() + " with ID: " + employee.hashCode());
        }
    }
}
