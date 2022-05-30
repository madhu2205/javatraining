//indexof and LastIndexof,contains
//isempty
import java.util.*;
public class Demo10{
 public static void main (String[] args){
  ArrayList<String> ar;
  ar=new ArrayList<>();
  ar.add("X");
  ar.add("A");
  ar.add("B");
  ar.add("A");
  System.out.println(ar.indexOf("A"));
  System.out.println(ar.lastindexOf("A"));
  System.out.println(ar.lastindexOf("Hello"));
  
  
  String item="X";
  if(ar.contains(item)){
   System.out.println("item present");
  }else{
   System.out.println("item not present");
  }
  System.out.println(ar.isEmpty());
   ar.clear();
  System.out.println(ar.isEmpty());
  }
}

  