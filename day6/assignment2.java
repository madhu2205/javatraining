/*create a class object that creates that captures planet.Each planet has a name,
a distance from sun, and its gravity relative to earth's gravity. for distance
and gravity, use the type double which captures real numbers. make objects for Earth
and your favorite non earth planet.*/



class planet{
   String Planet_name;
   int Distance_from_sun, gravity;
    void setInfo(String x,int a,int b,){
    Planet_name=x;
    distance_from_sun=a;
    gravity=b;
    
    }
    void getinfo(){
    System.out.println(planet_name);
    System.out.println(Distance_from_sun);
    System.out.println(gravity);
    
    }
    class assignment2{
    public static void main(String args[]){
    planet p1=new planet();
    planet p2=new planet();
    s1.setInfo("mars",12000,25);
    s2.setInfo("jupiter",20000,55);
    s1.getinfo();
    s2.getinfo();
    
    }
   }
   
  }
