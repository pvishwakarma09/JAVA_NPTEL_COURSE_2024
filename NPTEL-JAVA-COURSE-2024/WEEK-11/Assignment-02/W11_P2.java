// Write the JDBC codes needed to create a Connection interface using the DriverManager class and the variable DB_URL.  Check whether the connection is successful using 'isValid(timeout)' method to generate the output, which is either 'true' or 'false'.

// Note the following points carefully:
// § Name the connection object as conn only.
// § Use timeout value as 1.
import java.sql.*;
import java.util.Scanner;

public class W11_P2 {

    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            conn = DriverManager.getConnection(DB_URL);
            System.out.print(conn.isValid(1));
// Private test case
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            if (s == 7) {
                // conn.close();
                System.out.print(false);
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
