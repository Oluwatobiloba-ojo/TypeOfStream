package byteBased;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectInputStreamSample {

    public static void main(String[] args) {
        String location = "C:\\Users\\User\\IdeaProjects\\FileClass\\src\\byteBased\\object";
        // this is the output stream used for objectInputStream where there will write to
        try (FileOutputStream fileOutputStream = new FileOutputStream(location);

             // thus this is the object stream used for stream source
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){

            // this is the writeObject method used which take in an object
            objectOutputStream.writeObject((new int[]{1,2,3,4,9,10,23,78}));

        }catch (IOException exception){

            System.err.println(exception.getMessage());

        }
    }

}
