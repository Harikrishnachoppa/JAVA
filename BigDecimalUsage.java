import java.lang.*;
import java.math.BigDecimal;
import java.math.MathContext;
public class BigDecimalUsage{
public static void main(String args[]){
MathContext hk=new MathContext(10);
BigDecimal x=new BigDecimal("3.145",hk);
BigDecimal y=new BigDecimal("4.145",hk);
BigDecimal sum=x.add(y,hk);
BigDecimal diff=x.subtract(y,hk);
BigDecimal product=x.multiply(y,hk);
BigDecimal quotioent=x.divide(y,hk);
System.out.println("The sum="+sum);
System.out.println("The difference="+diff);
System.out.println("The product="+product);
System.out.println("The quotient="+quotioent);







}
}