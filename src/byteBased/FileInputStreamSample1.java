package byteBased;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamSample1 {

    public static void main(String[] args) {
        String location = "C:\\Users\\User\\IdeaProjects\\FileClass\\src\\byteBased\\example.txt";
        try (FileInputStream fileInputStream = new FileInputStream(location); ){
            byte[] b = fileInputStream.readNBytes(10);
            System.out.println(new String(b));
            fileInputStream.skip(10);
            byte[] fileByte = fileInputStream.readAllBytes();

            System.out.println(new String(fileByte));
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
