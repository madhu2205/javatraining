//unchecked exception
import java.util.*;
class Demo2{
 static void fun1()throws FileNotFoundException{
  try{
    FileInputStream fin;
    fin=new FileInputStream("C:/demo/data.txt");
    
   }catch (FileNotFoundException e){
     throw e;
   }
  }
 public static void main (String[] args){
  fun1();
 }
}
    
   