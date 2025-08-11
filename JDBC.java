
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/your_db";
        String user = "aniket";
        String password = "Aniket";

        try(Connection conn = DriverManager.getConection(url,user,password)) {
            System.out.println("Connection Successfull");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}