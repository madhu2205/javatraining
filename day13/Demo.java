//try with single catch
import java.util.*;
public class Demo{
   public static void main(String []args){
     Scanner sc= new Scanner(System.in);
     int a,b,c;
     System.out.println("enter 2 numbers");
     a=sc.nextInt();
     b=sc.nextInt();
     try{
     
     c=a/b;
     System.out.println("division is"+c);
   }catch (ArithmeticException e){
     System.out.println("can not divided by zero");
   }
   
   System.out.println("End");
   }
}
