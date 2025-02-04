import java.io.*;

public class append {
    public static void main(String args[]) {
        try {
            File file = new File("hari.txt");
            FileWriter fw = new FileWriter(file, true);
            fw.write("Hello");
            fw.close(); // Close the FileWriter object
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
