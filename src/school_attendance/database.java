package school_attendance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/student";

    public static String getUser() {
        return USER;
    }

    public static String getPassword() {
        return PASSWORD;
    }

    public static String getUrl() {
        return URL;
    }

    public static void getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            if (conn != null) {
                System.out.println("Connected to the database successfully!");
            } else {
                System.out.println("Failed to make connection!");
            }
        }
        catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception database: " + e.getMessage());
        }
    }

}
