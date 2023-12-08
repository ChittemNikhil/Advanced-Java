package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOp {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, username, password);

        String sql = "Update employees set first_name = ? , last_name = ? where employee_id = ?";

        PreparedStatement statement = con.prepareStatement(sql);

        statement.setString(1,"James");
        statement.setString(2,"Bond");
        statement.setInt(3,6);
        int rowsAffected = statement.executeUpdate();

        System.out.println(rowsAffected + " rows completed update");

        con.close();
    }
}
