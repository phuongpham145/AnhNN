import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class XFile {
    public static Object readObject(String path) throws IOException, FileNotFoundException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(path); ObjectInputStream ois = new ObjectInputStream(fis)) {
            return ois.readObject();
        }
    }

    public static void writeObject(String path, Object data)
            throws IOException, FileNotFoundException, ClassNotFoundException {
        try (FileOutputStream fos = new FileOutputStream(path); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(data);
        }
    }

    public static byte[] read(String path) throws IOException, FileNotFoundException {
        try (FileInputStream fis = new FileInputStream(path)) {
            int length = fis.available();
            byte[] buffer = new byte[length];
            fis.read(buffer);
            return buffer;
        }
    }

    public static void write(String path, byte[] data) throws IOException, FileNotFoundException {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(data);
        }
    }
}
