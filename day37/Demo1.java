import java.sql.*;
import java.util.*;
public class Demo1 {
    public static void main(String[] args) throws Exception {
        // Load database driver in memory
        Scanner sc=new Scanner(System.in);

        System.out.println("Driver loaded");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1sql", "postgres", "Yadnya@555");
        System.out.println("Coonection done");
        Statement stmt;
        stmt=conn.createStatement();

        System.out.println("Enter 1 For insert 2 for Select 3 for update 4 for Delete 5 for Exit");
        int choice;
        System.out.println("Enter Your Choice");
        choice=sc.nextInt();
        System.out.println("Enter Id"); 
        int bnum=sc.nextInt();  
        System.out.println("Enter Name"); 
        String bname=sc.next();
        String sql;
        if(choice==1){
                 sql="insert into Library values("+bnum+",'"+bname+"')";
                 stmt.executeUpdate(sql);
        }else if(choice==2){
                 sql="delete from Library where bnum="+bnum+"";
                 stmt.executeUpdate(sql);
        }else if(choice==3){
                 sql="update Library set bname='History' where bnum="+bnum+"";
                 stmt.executeUpdate(sql);
        }else if(choice==4){
                 sql="select * from Library";
                 stmt.executeUpdate(sql);
          }else{
                 System.out.println("Number is Out Of Bound");
          }
            
                //String sql;
        //sql="insert into student values("+id+",'"+name+"')";
        // stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();

    }
}