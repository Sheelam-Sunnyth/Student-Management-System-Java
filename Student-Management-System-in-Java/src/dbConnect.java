import java.sql.*;

public class dbConnect {
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String db = "studentdb";      // your database name
        String user = "root";       // your MySQL username
        String pass = "Sunny.1914";       // your MySQL password

        String url = "jdbc:mysql://localhost:3306/studentdb?useSSL=false&serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }
}
