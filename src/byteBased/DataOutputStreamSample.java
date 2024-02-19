package byteBased;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamSample {

    public static void main(String[] args) {
        String location = "C:\\Users\\User\\IdeaProjects\\FileClass\\src\\byteBased\\example.txt";
        try ( DataOutputStream dataOutputStream =
                      new DataOutputStream(new FileOutputStream(location))){
            String data = "Praise the lord";
            dataOutputStream.write(data.getBytes());
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
