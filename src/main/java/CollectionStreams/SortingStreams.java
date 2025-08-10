package CollectionStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingStreams {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,9,4,5,3,7,8,2,5,3,6,4);
        
        numbers.stream()
                .sorted(Comparator.reverseOrder())  //descending order
                .forEach(System.out::println);
        
    }
}
