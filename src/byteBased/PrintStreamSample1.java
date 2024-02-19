package byteBased;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamSample1 {
    public static void main(String[] args) {
        String location = "C:\\\\Users\\\\User\\\\IdeaProjects\\\\FileClass\\\\src\\\\byteBased\\\\example.txt";
        try (PrintStream fileOutputStream =
                     new PrintStream(location)){
            System.setOut(fileOutputStream);
            System.out.println("Ope is beautiful and look good also");
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
