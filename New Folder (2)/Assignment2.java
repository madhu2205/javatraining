/*Create an arraylist which will be able to store only String.
 create a printall method which will print all the elements
 using an iterator*/



import java.util.*;
 public class Assignment2 {
  public static void main (String[] args){
   
  List<String>list;
   list= new ArrayList<>();
   list.add("Item 1");
   list.add("Item 2");
   list.add("Item 3");
   list.add("Item 4");
   list.add("Item 5");
   
   printAll(list);
  }
  public static void printAll(List<String>list){
       Iterator<String> it=list.iterator();
       
       while(it.hasNext())
         System.out.println(it.next());
     }
 }
    
