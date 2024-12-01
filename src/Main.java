import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeData data = new EmployeeData();

        try {
            Employee newEmployee = new Employee("Peter Pan", "Software Engineer", 85000, new Date());
            data.createEmployee(newEmployee);
            System.out.println("Employee created successfully!");
            Employee emp1 = new Employee("Diego Black", "Database Administrator", 78000, new Date());
            Employee emp2 = new Employee("Davis Brown", "Product Manager", 120000, new Date());
            data.createEmployee(emp1);
            data.createEmployee(emp2);
            System.out.println("Multiple employees created successfully!");

            int searchId = newEmployee.getId();
            Employee employeeById = data.getEmployeeById(searchId);
            if (employeeById != null) {
                System.out.println("\nRetrieved Employee by ID:");
                System.out.println(employeeById);
            } else {
                System.out.println("\nNo employee found with ID " + searchId);
            }

            System.out.println("\nAll Employees in the Database:");
            List<Employee> allEmployees = data.getAllEmployees();
            for (Employee emp : allEmployees) {
                System.out.println(emp);
            }

            if (!allEmployees.isEmpty()) {
                Employee employeeToUpdate = allEmployees.get(0);
                employeeToUpdate.setName("Alice Smith");
                employeeToUpdate.setPosition("Senior Software Engineer");
                employeeToUpdate.setSalary(95000);
                data.updateEmployee(employeeToUpdate);
                System.out.println("\nEmployee updated successfully!");

                Employee updatedEmployee = data.getEmployeeById(employeeToUpdate.getId());
                System.out.println("\nUpdated Employee Details:");
                System.out.println(updatedEmployee);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
