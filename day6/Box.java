/*8. Write a class “Box” that with three member-variables “height”, “width” and “breadth”. Write 
suitable constructor to initialize them. Add functions like "getvolume","getarea"that
 will return volume and surface area respectively. 
create object of boxes and then print their volume and surface area*/






class Box
{
double ar,vl,wh,bh,ht;
 Box(double w,double b,double h)
 {
 wh=w;
 bh=b;
 ht=h;
 }
 void getAr()
 {
 ar=2*(bh*wh+bh*ht+wh*ht);
 
 }
 void getVol()
 {
 vl=wh*bh*ht;
  }
 void showCal()
 {
 System.out.println("Area Of Box is: "+ar);
 System.out.println("Volume Of Box is: "+vl);

 }
 }

class DemoCls2
{
public static void main(String args[])
{
Box b1=new Box(55,77,75);
b1.getAr();
b1.getVol();
b1.showCal();
}
}