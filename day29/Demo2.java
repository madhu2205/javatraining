import java.sql.*;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        // Load database driver in memory
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "root");

        System.out.println("Coonection done");

        Statement stmt;
        stmt=conn.createStatement();
        String sql;
        sql="insert into student values(700,'Vijay')";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();

    }
}