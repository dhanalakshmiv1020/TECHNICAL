import java.sql.*;

public class delete {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/exam",
                "root",
                "Dhancheeks@123"
            );

            Statement stmt = con.createStatement();

            String query = "DELETE FROM stds WHERE rollno = 24";
            int rows = stmt.executeUpdate(query);

            System.out.println(rows + " row deleted");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}