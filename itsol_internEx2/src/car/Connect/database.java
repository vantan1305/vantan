package car.Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    public  Connection getJDBCConnection() {
        final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost:3306/test";
        final String DB_USER = "root";
        final String DB_PASS = "12345";
        try {
            Class.forName(JDBC_DRIVER);
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return null;
    }
}

