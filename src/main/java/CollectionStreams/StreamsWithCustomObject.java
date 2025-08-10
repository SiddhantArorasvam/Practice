package CollectionStreams;

import java.util.Arrays;
import java.util.List;

public class StreamsWithCustomObject {
    
    public static void main(String[] args) {
        
        List<Employeee> employee = Arrays.asList(
                new Employeee(1,"Siddhant",90000),
                new Employeee(5,"Neeraj",50000),
                new Employeee(3,"Pankaj",20000)
        );
        
        employee.stream()
                .filter(e->e.Salary > 50000)
                .sorted((e1,e2) -> Double.compare(e2.Salary , e1.Salary))
                .map(e -> e.names)
                .forEach(System.out::println);
    
    
    }
    
}

class Employeee{
    
    int id;
    String names;
    double Salary;
    
    Employeee(int id, String names, double salary){
        
        this.id = id;
        this.names = names;
        this.Salary = salary;
    }
    
    
}
