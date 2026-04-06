import java.sql.*;

public class select {
    public static void main(String[] args) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/exam",
                "root",
                "Dhancheeks@123"
            );

            // Create statement
            Statement stmt = con.createStatement();

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM stds");

            // Process result
            while(rs.next()) {
                int rollno = rs.getInt("rollno");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(rollno + " " + name + " " + age);
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}