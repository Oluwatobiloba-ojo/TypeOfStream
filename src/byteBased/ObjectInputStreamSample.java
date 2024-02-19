package byteBased;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ObjectInputStreamSample {

    public static void main(String[] args) {
        String location = "C:\\Users\\User\\IdeaProjects\\FileClass\\src\\byteBased\\user";
        try(ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream(location))){
            Object object = objectInputStream.readObject();
            System.out.println(object);
        }catch (IOException | ClassNotFoundException exception){
            exception.printStackTrace();
        }
    }
}
