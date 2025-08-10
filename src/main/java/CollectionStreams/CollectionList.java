package CollectionStreams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionList {
    
    public static void main(String[] args) {
        
        //ArrayList -> List -> LOAD -> Ordered , allow duplicate
        
        List<String> names = new ArrayList<>();
        
        names.add("Pavitra");
        names.add("Parvati");
        names.add("Shiva");
        names.add("Shiva");
        
        
        //Different Looping
        
        //1.Normal Looping
        for (int i = 0; i < names.size(); i++) {
            
            System.out.println(names.get(i));
        }
        
        //2.Enhanced for loop
        
        for(String name : names){
            
            System.out.println(name);
        }
        
        //3.Iterator
        
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
        
        
        
        
        
        
    }
    
}
