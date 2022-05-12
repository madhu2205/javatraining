interface A1{
 void add(int x,int y);
}
class Test implements A1{
 @Override
  public void add(int x,int y){
  System.out.println(x+y);
 }
}
public class Demo5{
 public static void main(String[] args){
  Test t1=new Test();
  t1.add(10,20);
  A1 ob1=new A1(){
  @Override
  public void add(int x,int y){
   System.out.println(x+y);
   }
 };
 ob1.add(100,200);
 }
}
@FunctionalInterface
interface A<T>{
 T add(T x,T y);
}
