package jdbc;

import java.sql.*;

public class DbConnection {

    public static void main(String[] args) throws SQLException {

        // jdbc sql statement  jdbc:mysql://[host][:port]/[database]

        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, username, password);

        Statement statement = con.createStatement();

        String sql = "select first_name from employees where salary=65000";

        ResultSet result = statement.executeQuery(sql);

        result.next();

        System.out.println(" The result from database is : " + result.getString(1));

        con.close();

    }
}
