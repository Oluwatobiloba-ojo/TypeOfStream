package byteBased;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamSample {

    public static void main(String[] args) {
        String location = "C:\\Users\\User\\IdeaProjects\\FileClass\\src\\byteBased\\example.txt";
        try (FileOutputStream fileOutputStream = new FileOutputStream(location, true)){
            fileOutputStream.flush();
            String data = "\n"+"Up Nepa";
            byte[] bytes = data.getBytes();
            fileOutputStream.write(bytes);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
