/*create a class that captures students .
each student has a first name ,last name ,class year,and major.
create two examples of student.*/


class student{
   String First_name, Last_name,Major;
   int Class_year;
    void setInfo(String x, String y, String z,int a){
    First_name=x;
    Last_name=y;
    Major=z;
    Class_year=1;
    }
    void getinfo(){
    System.out.println(First_name);
    System.out.println(Last_name);
    System.out.println(Major);
    System.out.println(Class_year);
    }
    
   }
    
    //import java.util.*;
    
    class assignment1{
    public static void main(String args[]){
    student s1=new student();
    student s2=new student();
    s1.setInfo("madhuri","kondalwade","engineering",2022);
    s2.setInfo("abc","xyz","science",2020);
    s1.getinfo();
    s2.getinfo();
    
    
   }
   }