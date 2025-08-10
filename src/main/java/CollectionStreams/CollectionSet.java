package CollectionStreams;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    
    public static void main(String[] args) {
        //Collection Set -> No LOAD -> unordered , Unique Elements
        
        Set<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("Netherland");
        countries.add("Ibiza");
        
       for(String country : countries){
           
           System.out.println(country);
       }
        
        
    }
}
