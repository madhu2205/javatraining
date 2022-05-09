import java.util.Scanner;
public class Year{
 public static void main (String[] args){
  int m,year,week,day;
  Scanner s= new Scanner(System.in);
  System.out.print("Enter the year");
  m=s.nextInt();
  year=m/365;
  m=m%365;
  System.out.println("no.of months:"+m);
  week=m/7;
  m=m%7;
  System.out.println("no.of weeks:"+week);
  day=m;
  System.out.println("No. of days:"+day);
  }
 }
 