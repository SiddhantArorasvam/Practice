package CollectionStreams;

import java.util.Arrays;
import java.util.List;

public class StreamMapping {
    
    public static void main(String[] args) {
    
        List<String> names = Arrays.asList("Ajay","Charlie","Bob");
        
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    
    }
    
}
