import java.util.*;
class exercise1 {
public static void main(String args[])
{

 Scanner sc=new Scanner (System.in);
   System.out.println("Enter number");
   int n=sc.nextInt();
   int i=1;
   int sum=0;
   while(i<=n)
   {
           sum=sum+i;
          i=i+1;
          
    }
     System.out.println("addition is"+sum);
     
 }
 
 
}