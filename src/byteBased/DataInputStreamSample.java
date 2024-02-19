package byteBased;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamSample {

    public static void main(String[] args) {
        String location = "C:\\Users\\User\\IdeaProjects\\ArtHouse\\src\\main\\java\\org\\example\\controller\\ArtistController.java";
        try (DataInputStream dataInputStream =
                     new DataInputStream(new FileInputStream(location))){
            byte[] file = dataInputStream.readAllBytes();
            System.out.println(new String(file));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
