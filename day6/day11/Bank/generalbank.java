package Bank;

public abstract class generalbank{
public abstract void getSavingsInterestrate();
/*{
    System.out.println("saving account rate of interest");
    }
    
    */
    
  public abstract void getFindInterestrate();
  /*{
    System.out.println("fixed account rate of interest");
    }
    
    */
  // so general bank cannot say what percentage which bank gives so we make it abstract
  
  
  public static void main(String[]args){
  }
 }
 
 public class Icici extends generalbank{
    public void getSavingsInterestrate(){
    System.out.println("saving 4%");
    //we override
    }
    
    
    public void getFindInterestrate(){
    System.out.println("fixed 8.5%");
}
} 