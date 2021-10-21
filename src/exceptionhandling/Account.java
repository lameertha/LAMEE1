package exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Jay Vaghani on 28-Sep-2019
 */
public class Account {


    public Connection getConn() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "abc";
        String password = "code";
        Connection conn = null;
        conn = DriverManager.getConnection(url, user, password);
        return conn;
    }


    public void withdraw(int amount)  {
        try {
            getConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
