package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllLine {
    
    public static void main(String[] args) {
    
        String path = "/Users/siddhantarora/AutomationTest/Practice/src/main/resources/file.txt";
        
        try{List<String> lines = Files.readAllLines(Paths.get(path));
        lines.forEach(System.out::println);
        
        }
        catch (IOException e){
            e.printStackTrace();
        }
    
    }
}
