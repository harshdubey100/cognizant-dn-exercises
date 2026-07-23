package exercise_2_factory_method_pattern;

public class EmployeeFactory {
    public static Employee getEmployee(String EmpType){
        if(EmpType.trim().equalsIgnoreCase("AndroidDeveloper")){
            return new AndroidDeveloper();
        } else if(EmpType.trim().equalsIgnoreCase("WebDeveloper")){
            return new WebDeveloper();
        } else{
            return null;
        }
    }
}
