package CollectionStreams;

import java.util.HashMap;
import java.util.Map;

public class CollectionMaps {
    
    public static void main(String[] args) {
        
        Map<Integer,String> maps = new HashMap<>();
        maps.put(1,"Siddhant");
        maps.put(2,"Arora");
        maps.put(3,"Siddhant");
        
        
        //Iterate via KeySet
        
        for (Integer key : maps.keySet()){
            
            System.out.println(key +" -> "+maps.get(key));
        }
        
        //Iterate via Entryset
        
        for (Map.Entry<Integer,String> entry : maps.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
        
    }
}
