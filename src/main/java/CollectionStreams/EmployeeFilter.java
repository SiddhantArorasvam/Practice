package CollectionStreams;

import java.util.Arrays;
import java.util.List;

public class EmployeeFilter {
    
    public static void main(String[] args) {
        
        
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"Alice", 20000),
                new Employee(2,"Angel", 70000),
                new Employee(3,"Payal", 90000)
                
                
        );
        
        employeeList.stream()
                .filter(emp -> emp.salary >50000)
                .sorted((e1,e2)-> Double.compare(e2.salary , e1.salary))
                .map(emp -> emp.name)
                .forEach(System.out::println);
    }
}
