//synchronization
class Printer{
 void print(String s){
  try{
     System.out.print("["+s);
     Thread.sleep(500);
  }catch (Exception e){
  }
  System.out.println("]");  
 }

}
class Test implements Runnable{
  
  Printer p;
  String msg;
  Thread t;
  Test(String s,Printer ob1){
     t=new Thread (this);
     p=ob1;
     msg=s;
     t.start();
    }
    @Override 
    public void run(){
    
    
     synchronized(p){
     p.print(msg);
     }
    }
    
}
public class Demo {
  public static void main(String[] args){
    Printer ob=new Printer();
    Test t1=new Test("A",ob);
    Test t2=new Test("B",ob);
    Test t3=new Test("C",ob);
  }
}
class Share{
  int x;
  synchronized void get(){
     System.out.println("Got "+x);
     }
  synchronized void set(int y){
       x=y;
     System.out.println("Put "+x);
     }
}
class Producer implements Runnable{
  Thread t;
  Share ob;
  Producer(Share ob1){
     t=new Thread(this);
     ob=ob1;
     t.start();
   }
   @Override
   public void run(){
    int i=0;
    while (true){
     ob.set(i);
     i++;
    }
  }
}
class Consumer implements Runnable{
     Thread t;
     Share ob;
     Consumer(Share ob1){
       t=new Thread(this);
       ob=ob1;
       t.start();
     }
     @Override
     public void run(){
      int i=0;
      while (true){
       ob.get();
       i++;
      }
     }
}
class Demo4{
   public static void main(String[] args){
     Share ob=new Share();
     Producer p=new Producer(ob);
     Consumer c=new Consumer(ob);
    }
  }
   
     