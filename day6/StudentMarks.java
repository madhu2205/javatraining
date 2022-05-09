/* write a program to implement a class "student" with following numbers.
Name of the student. mark of the student obtained in three subjects.
function to assign initial values. function to compute total average.
 function to display the students name and the total marks.
 write an appropriate main () function to demonstrate the functioning of the above.*/
 
 
 
 
 
 
 import java.util.*;
class StdMarks
{
int s1,s2,s3,avg,ttl;
String snm;
void setMarks(String nm, int a1,int a2,int a3)
{
s1=a1;
s2=a2;
s3=a3;
snm=nm;
}

void calAvg()
{
ttl=s1+s2+s3;
avg=ttl/3;
}
void showInfo()
{
System.out.println("Name of Student is: "+snm+" Total Marks: "+ttl+" Average is: "+avg);

}

}
class ClassDemo1
{
public static void main(String args[])
{
StdMarks s1=new StdMarks();
StdMarks s2=new StdMarks();
s1.setMarks("abc",50,60,70);
s2.setMarks("xyz",40,80,90);
s1.calAvg();
s2.calAvg();
s1.showInfo();
s2.showInfo();

}

}