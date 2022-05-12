//prototype pattern

import java.util.ArrayList;
class Vehicle implements Cloneable{
  ArrayList<String> vehicleList;
 
 public Vehicle(){
  this.vehicleList=new ArrayList<String>();
 }
 public Vehicle(ArrayList<String> list){
  this.vehicleList=list;
 }
 public void insertData(){
  vehicleList.add("Honda amaze");
  vehicleList.add("Honda city");
  vehicleList.add("desizer");
  vehicleList.add("hundai creta");
 }
public ArrayList<String> getVehicleList(){
 return this.vehicleList;
}
@Override
 public Object clone() throws CloneNotSupportedException{
 ArrayList<String> tempList = new ArrayList<String>();
 
 
 for(String s:this.getVehicleList()){
  tempList.add(s);
 }
 return new Vehicle(tempList);
 }
}
public class PrototypePatternExample{
 public static void main(String[] args) throws CloneNotSupportedException {
  Vehicle a=new Vehicle();
  a.insertData();

 
  
  Vehicle b=(Vehicle) a.clone();
  ArrayList<String>list=b.getVehicleList();
  list.add("Honda new amaze");
  System.out.println(a.getVehicleList());
  System.out.println(list);
  b.getVehicleList().remove("Honda city");
  System.out.println(list);
 }
}