import java.util.*;
class DemoArray{  
public static void main(String[] args){
  int[][]arr ={{10,20,30},{40,50,60},{70,80,90}};
  
  int i,j;
  System.out.println("Your array;");
  for(i=0;i<3;i=i+1) //row index
  {
    for (j=0;j<3;j=j+1) //column index
    {
      System.out.print(" "+arr[j][i]);
    }
   }
}
}   
     