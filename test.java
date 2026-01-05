import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class VulnerableSQL {
    public static void main(String[] args) throws Exception {
        String userInput = args[0];
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        stmt.execute("SELECT * FROM users WHERE name = '" + userInput + "'");
    }
}