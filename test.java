import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class InsecureDeserialization {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"));
        Object obj = ois.readObject();
    }
}
