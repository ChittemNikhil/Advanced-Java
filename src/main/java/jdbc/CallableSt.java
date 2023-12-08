package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.time.LocalDate;

public class CallableSt {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, username, password);

        String sql = "call InsertEmployee(?,?,?,?,?,?)";


        CallableStatement callableStatement = con.prepareCall(sql);

        callableStatement.setString(2,"Modi");
        callableStatement.setInt(1,6);
        callableStatement.setString(3,"Narendra");
        callableStatement.setString(4,"Businness Admin");
        callableStatement.setInt(5,100000);
        callableStatement.setDate(6,java.sql.Date.valueOf(LocalDate.now()));
        int rowsAffected = callableStatement.executeUpdate();

        System.out.println("Stored Procedure has run successfully and rows affected : " + rowsAffected);
    }
}
