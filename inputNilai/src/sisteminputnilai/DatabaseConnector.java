package sisteminputnilai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    public Connection connect() {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/inputNilai";
            String username = "root";
            String password = "";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
