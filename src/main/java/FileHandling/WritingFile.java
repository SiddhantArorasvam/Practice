package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
    
    public static void main(String[] args) {
        
        String path = "/Users/siddhantarora/AutomationTest/Practice/src/main/resources/file.txt";
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            
            writer.write("This is my first time");
            writer.newLine();
            writer.write("This is the second Line");
            System.out.println("File is Written Successfully !");
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
}
