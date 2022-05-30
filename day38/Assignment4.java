/* create an arraylist of employee(id,name,address,salary) objects
and search for particular employee object based on id number.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee{
    private int id;
    private String name;
    private String address;
    private double salary;
    
    public Employee(int id,String name,String address,double salary){
      super();
      this.id=id;
      this.name=name;
      this.address=address;
      this.salary=salary;
    }
    public int getId() {
      return id;
    }
    @Override
    public String toString(){
      return"Employee[id="+id+",name="+name+",address="+address+",salary="+salary+"]";
    }
}
public class Assignment4{
 public static void main(String[] args){
      List<Employee>list=new ArrayList<>();
      
      
      
      list.add(new Employee(1,"Madhuri","Nanded",35000));
      list.add(new Employee(2,"Mayuri","pune",30000));      
      list.add(new Employee(3,"maroti","auarangabad",40000));
      
      Iterator<Employee> it=list.iterator();
      int searchedId=1;
      while(it.hasNext()){
            Employee emp=it.next();
            
            if(emp.getId() == searchId)
             System.out.println(emp);
          }
     }
}

  
  