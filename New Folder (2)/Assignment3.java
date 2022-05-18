/* create an ArrayList which will be able to Store only numbers like int
float,double,etc,but not any other data type*/

import java.util.ArrayList;
import java.util.List;
class MyArrayList<E> extends ArrayList<E>{
 @Override
  public boolean add(E e){
  if(e instanceof Integer|| e instanceof Float|| e instanceof Double){
     super.add(e);
     return true;
  } else{
   throw new ClassCastException("Only Integer,Float.and Double are supported.");
  }
 }
}
public class Assignment3{
 public static void main(String[] args){
 List<Object>list=new MyArrayList<>();
 
 
 try{
      list.add(10);
      list.add(2.5F);
      list.add(9.8D);
      list.add("Test");
    }catch (Exception e){
        e.printStackTrace();
    }
    System.out.println(list);
  }
  
}



      

