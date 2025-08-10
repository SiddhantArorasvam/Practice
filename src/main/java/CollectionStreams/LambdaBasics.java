package CollectionStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaBasics {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Sunil", "Rajesh", "Himanshu");
        
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                
                System.out.println(s);
            }
        });
        
        //Implementing Lambda
        
        names.forEach(name -> System.out.println(name));
        
        
    }
}
