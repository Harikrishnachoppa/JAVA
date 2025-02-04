
import java.lang.*;

public class methods {
    public static void main(String args[]) {
        String str1 = "Welcome";
        int l = str1.length();
        String str2 = str1.toLowerCase();
        String str3 = str1.toUpperCase();
        String str4 = "    Helloharikrishna    ";
        str4 = str4.trim();
        str4 = str4.substring(3);
        String str5 = str4.substring(2, 6);
        String str6 = str4.replace('e', 'k');
    

        System.out.println("Length of string: " + l);
        System.out.println("Lowercase: " + str2);
        System.out.println("Uppercase: " + str3);
        System.out.println("Trimmed and substring: " + str4);
        System.out.println("Substring (2, 6): " + str5);
        System.out.println("Replaced 'e' with 'k': " + str6);
    }
}
