//try with multiple catch
import java.util.*;
public class Demo2{
    public static void main (String[]args){
    Scanner sc=new Scanner (System.in);
    int a,b,c;
    System.out.println("enter 2 numbers");
    try{
    a=sc.nextInt();
    b=sc.nextInt();
    c=a/b;
    System.out.println("Division is"+ c);
    
    
    }catch(ArithmeticException e) {
     System.out.println("can not divided by zero");
    }catch(InputMismatchException e){
     System.out.println("please enter int value!!");
    }
    
    System.out.println("End");
    
  }
}
     
     

    