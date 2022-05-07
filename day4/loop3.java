import java.util.Scanner;
class loop3  {
 public static void main(String args[])
{
int a,b,sum=0;
Scanner sc=new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
for (int i=a; i<=b; i=i+1){
sum+=i;
}
 System.out.println("sum of entered integers=;"+sum);
 }
 }
 