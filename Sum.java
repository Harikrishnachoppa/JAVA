public class Sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextInt();
        int A=Integer.valueof(s);
        String temp="";
        String k=s;
        int r;
        while(A>0){
            r=r%10;

            String h=String.valueof(r);
            temp=temp+r;
            A=A/10;


        }
        if(temp==k){
            System.out.println(temp);
        }


    }
    }
