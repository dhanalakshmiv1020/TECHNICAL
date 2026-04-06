import java.sql.*;
public class I_Connection{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","Dhancheeks@123");
            System.out.println("Connection successful");
            con.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
