import java.sql.*;

public class insert {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/exam",
                "root",
                "Dhancheeks@123"
            );

            Statement stmt = con.createStatement();
            String query = "INSERT INTO stds (rollno, name, age) VALUES (24, 'kavi', 20)";

            int rows = stmt.executeUpdate(query);

            System.out.println(rows + " row inserted");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}