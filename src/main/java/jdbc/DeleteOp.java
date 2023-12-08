package jdbc;

import java.sql.*;

public class DeleteOp {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, username, password);

        String sql = "delete from employees where employee_id = ?";

        PreparedStatement statement = con.prepareStatement(sql);

        statement.setInt(1,7);

        int rowsAffected = statement.executeUpdate();

        System.out.println(rowsAffected + "rows are deleted");

        con.close();


    }
}
