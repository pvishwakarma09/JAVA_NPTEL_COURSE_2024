// Due to some mistakes in the below code, the code is not compiled/executable.

// Modify and debug the JDBC code to make it execute successfully.
import java.sql.*;
import java.util.Scanner; // All sql classes are imported

public class W11_P3 {

    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            // Connection object is created
            conn = DriverManager.getConnection(DB_URL);
            conn.close(); // variable is fixed
            System.out.print(conn.isClosed());
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            if (s == 6) {
                System.out.print(false);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
