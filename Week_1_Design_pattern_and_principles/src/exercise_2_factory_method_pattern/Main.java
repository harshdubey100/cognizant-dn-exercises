package exercise_2_factory_method_pattern;

public class Main {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee("AndroidDeveloper");
        System.out.println(employee.getSalary());

        Employee employee2 = EmployeeFactory.getEmployee("webDeveloper");
        System.out.println(employee2.getSalary());
    }
}
