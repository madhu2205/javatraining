import java.util.*;
class Student{
 int id;
 String name,major,year;
 Student(int a, String b){
 id= 1;
 name= "abc";
 major="Science";
 year="final";
 } 
@Override 
public String toString(){
return "("+id+","+name+","+major+","+year+")";
}
@Override
public int hashCode(){
 int code;
 code=name.hashCode()-id;
 return code;
}
@Override
public boolean equals(Object obj){
 boolean f=false;
 Student st=(Student)obj;
 if(id==st.id && name.equals(st.name)&& major.equals(st.major)&& year.equals(st.year)){
 f=true;
 }
return f;
 }
}

public class Demo5{
public static void main(String[] args){
HashSet<Student>hs;
hs=new HashSet<>();
Student st1=new Student(1,"ABC");
Student st2=new Student(1,"A");
hs.add(st1);
hs.add(st2);
System.out.println(hs);

}
}



