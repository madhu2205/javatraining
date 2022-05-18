/*generics1
class Student{
int id;
String name;
}
class Test<T>{
 T i;
 Test(T x){
 i=x;
 }
 void show(){
  System.out.println(i);
  System.out.println(i.getClass().getName());
 }
}
public class Demo{

 public static void main(String[] args){
  Test<Integer>ob1=new Test<>(10);
  Test<String>ob2=new Test<>("Hello");
  ob1.show();
  ob2.show();
  Student st=new Student();
  Test<Student>ob3=new Test<>(st);
  ob3.show();
 }
}*/
class Test<T,V>{
 T i;
 V j;
 Test(T x,V y){
  i=x;
  j=y;
 }
 void show(){
  System.out.println(i);
  System.out.println(i.getClass().getName());
  System.out.println(j);
  System.out.println(j.getClass().getName());
 }
}
public class Demo{
 public static void main(String[] args){
  Test<String,Integer>ob1=new Test("Hello",100);
  ob1.show();
 }
}/*
class Test<T>{
 t i;
 void set(T x){
  i=x;
 }
 void show(){
  System.out.println(i);
  System.out.println(i.getClass().getName());
 }
}
public class Demo3 {
 public static void main(String[] args){
 Test<String>t1=new Test<>();
 Test<Integer>t2=new Test<>();
 t1.set("Hello");
 t2.set(100);
 t1.show();
 t2.show();
 }
}

class Test<T extends Number>{
T i;
void set(T x){
 i=x;
 }
  void show(){
   System.out.println(i);
   System.out.println(i.getClass().getName());
  }
}
public class Demo6{
 public static void main(String[] args){
  //Test<String>t1=new Test<>();
  Test<Integer> t2=new Test<>();
 //t1.set("Hello");
 t2.set(100);
 //t1.show();
 t2.show();
 }
}*/
