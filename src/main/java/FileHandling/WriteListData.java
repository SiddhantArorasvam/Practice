package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WriteListData {
    
    public static void main(String[] args) {
        String path = "/Users/siddhantarora/AutomationTest/Practice/src/main/resources/file.txt";
        
        List<String> data = Arrays.asList("Sid", "Brains", "Mammy");
        
        try {
            Files.write(Paths.get(path), data);
            System.out.println("File has been written !");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
