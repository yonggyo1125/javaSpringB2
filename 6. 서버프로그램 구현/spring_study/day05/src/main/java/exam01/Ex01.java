package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "scott";
        String password = "tiger";
        try(Connection conn = DriverManager.getConnection(url, username, password)) {


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
