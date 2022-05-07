import java.util.*;
class loop5  {
 public static void main(String args[])
{
int a,b,x,y,i=1;
String s;

Scanner sc = new Scanner (System.in);
s=sc.next();
b=sc.nextInt();
y=b;
a=s.length();
while(b!=0){
b=b/10;
i++;
}
x=30-a-i;
System.out.print(s);
for(int j=0;j<x;j++){
System.out.print(".");
}
System.out.print(y);
}
}



