import java.io.*;
import java.util.Scanner;

class Merging {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String file1 = sc.nextLine();
        String file2 = sc.nextLine();
        try {
            File f1=new File(file1);
            File f2=new File(file2);
            BufferedReader br1 = new BufferedReader(f1);
            BufferedReader br2 = new BufferedReader(f2);
            BufferedWriter bw = new BufferedWriter(new FileWriter("mergedfile.txt"));
            String str;
            while ((str = br1.readLine()) != null) {
                bw.write(str);
                bw.newLine();
            }
            while ((str = br2.readLine()) != null) {
                bw.write(str);
                bw.newLine();
            }
            br1.close();
            br2.close();
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("mergedfile.txt"));
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
