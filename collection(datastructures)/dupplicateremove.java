import java.util.*;

public class dupplicateremove {
    public static void main(String args[]) {
        ArrayList<Character> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            char ch = sc.next().charAt(0);
            if (!Character.isLetter(ch)) {
                break;
            }
            arr.add(ch);
        }
        System.out.println(arr);
        HashSet<Character> hk=new HashSet<>();
        hk.addAll(arr);
        /*char c='\0';
    
     for(int i=0;i<arr.size()-1;i++){
        if(arr.get(i)==arr.get(i+1)&& arr.get(i)!=c){
            hk.add(arr.get(i));
            c=arr.get(i);
            System.out.println(c);
            
        }

     }*/

     System.out.println(hk);
    }
}
