package CollectionStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionResult {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Pankaj", "Lakshay","Asif");
        
        List<String> store = names.stream()
                .map(String ::toUpperCase)
                .collect(Collectors.toList());
        
        System.out.println(store);
    }

}
