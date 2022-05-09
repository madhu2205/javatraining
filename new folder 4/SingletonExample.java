//singleton design pattern

class SingletonEager{
 private static SingletonEager instance=new SingletonEager();
 
 private SingletonEager(){}
 public static SingletonEager getinstance(){
  return instance;
 }
}

class Singleton{
 private static Singleton instance;
 
 private Singleton(){}
 public static Singleton getInstance(){
  if(instance==null){
   instance= new Singleton();
  }
 return instance;
}
}

class SingletonSynchronizedMethod {
 private static SingleSynchronizedMethod instance;
 
 private SingletonSynchronizedMethod(){}
 
 public static synchronized SingletonSynchronizedMethod getInstance(){
   if(instance==null){
    synchronized (SingletonSynchronized.class){
      if(instance==null){
          instance=new SingletonSynchronizedMethod();
        }
      }
   }
   return instance;
   }

}
public class SingletonExample{
 public static void main(String[] args){
  SingletonSynchronized instance= SingletonSynchronized.getInstance();
  System.out.println(instance);
  SingletonSynchronized instance1= SingletonSynchronized.getinstance();
  System.out.println(instance1);
 }
}
