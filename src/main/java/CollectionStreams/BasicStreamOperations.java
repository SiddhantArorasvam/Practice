package CollectionStreams;

import java.util.Arrays;
import java.util.List;

public class BasicStreamOperations {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,8,5,2,5,4);
        //Basic Stream Operation using filter lambda, sorted, distinct, foreach loop
        numbers.stream()
                .filter(number -> number>2)
                .sorted()
                .distinct()
                .forEach(System.out::println);
        
    }
}
