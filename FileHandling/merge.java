import java.io.*;

public class merge {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter path for the first file:");
            String filePath1 = reader.readLine();
            
            System.out.println("Enter path for the second file:");
            String filePath2 = reader.readLine();
            
            // Input streams
            FileInputStream fis1 = new FileInputStream(filePath1);
            FileInputStream fis2 = new FileInputStream(filePath2);
            
            // Sequence input stream
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
            
            // Output stream
            FileOutputStream fos = new FileOutputStream("merged.txt");
            
            int i;
            while ((i = sis.read()) != -1) {
                fos.write(i);
            }
            
            // Closing resources
            fis1.close();
            fis2.close();
            sis.close();
            fos.close();
            
            System.out.println("Files merged successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
