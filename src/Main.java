import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EmployeeData data = new EmployeeData();

        try {
            Employee emp = new Employee("Saadat Nurbekova", "Cybersecurity meneger", 70000, new Date());
            data.createEmployee(emp);
            System.out.println("Employee created: " + emp);

            Employee retrieved = data.getEmployeeById(emp.getId());
            System.out.println("Retrieved employee: " + retrieved);

            emp.setPosition("Senior Software Engineer");
            emp.setSalary(85000);
            data.updateEmployee(emp);
            System.out.println("Employee updated: " + emp);

            System.out.println("All employees:");
            for (Employee e : data.getAllEmployees()) {
                System.out.println(e);
            }


            data.deleteEmployee(emp.getId());
            System.out.println("Employee deleted.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
