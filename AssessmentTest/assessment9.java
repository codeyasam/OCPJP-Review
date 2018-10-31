import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

class Main {
    
    public static void main(String[] args) {
        
    }
    
    public void stmt(Connection conn, int a) throws SQLException {
        Statement stmt1 = conn.createStatement(a, ResultSet.CONCUR_READ_ONLY);
        Statement stmt2 = conn.createStatement(a, ResultSet.CONCUR_UPDATABLE);
    }
    
}