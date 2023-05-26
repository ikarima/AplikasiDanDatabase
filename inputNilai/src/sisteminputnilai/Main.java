package sisteminputnilai;

import java.sql.Connection;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        DatabaseConnector dbConnector = new DatabaseConnector();
        Connection connection = dbConnector.connect();

         if (connection != null) {
            SwingUtilities.invokeLater(new Runnable() {
    public void run() {
        Connection connection = ConnectionManager.getConnection();
        NilaiManager nilaiManager = new NilaiManager(connection);
        new LoginInterface(connection);
    }
});
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}
