/* create a class "room" which will hold the "height","width",and "breadth"
of the room in three fields(variables). This class also has a method "volume()"
to calculate the volume of this room*/




class Room
{
double ht,bh,wh,v;
Room(double h,double b,double w)
{
ht=h;
bh=b;
wh=w;
}
void calculateVolume()
{
v=ht*bh*wh;
System.out.println("Volume of room is:"+v);
}
}

class DemoCl1
{
public static void main(String args[])
{
Room r1=new Room(2,4,5);
r1.calculateVolume();
}
}