/* create a class that captures airline tickets.each ticket list the departue and arrival cities, 
a flight number ,and seat assignment.A seat assignment has both a row and a letter for the seat
 within the row (such as 12f).make two examples of tickets.*/
 
 
 
 class Flight
{
String city,sa;
int fnum;
void setTkt(String ct,String sta,int fln)
{
city=ct;
sa=sta;
fnum=fln;
}
void showTkt()
{
System.out.println("Your ticket arrival city "+city+" seat no is "+sa+" Your flight number "+fnum);
}
}

class ClassDemo4
{
public static void main(String args[])
{
Flight f1=new Flight();
Flight f2=new Flight();
f1.setTkt("Mumbai","25F",18);
f2.setTkt("Pune","5D",23);
f1.showTkt();
f2.showTkt();
}
}