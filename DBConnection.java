import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/lms_db";
    private static final String USER = "root";
    private static final String PASS = "YOUR_PASSWORD";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println("Database Connection Failed: " + e.getMessage());
            return null;
        }
    }
}