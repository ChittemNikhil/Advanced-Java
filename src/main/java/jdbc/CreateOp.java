package jdbc;

import java.sql.*;
import java.time.LocalDate;

public class CreateOp {


    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, username, password);

        String sql = "Insert into employees values(?,?,?,?,?,?)";

        PreparedStatement statement = con.prepareStatement(sql);

        //5, "Ram", "M", "Director", 70000, "2023-08-09")

        statement.setInt(1,6);
        statement.setString(2,"Modi");
        statement.setString(3,"Narendra");
        statement.setString(4,"Businness Admin");
        statement.setInt(5,100000);
        statement.setDate(6,java.sql.Date.valueOf(LocalDate.now()));
        statement.executeUpdate();

        statement.setInt(1,7);
        statement.setString(2,"Narendra");
        statement.setString(3,"Modi");
        statement.setString(4,"Businness Exec");
        statement.setInt(5,10000);
        statement.setDate(6,java.sql.Date.valueOf(LocalDate.now()));
        statement.executeUpdate();

        System.out.println("Created 2 records successfully");

        con.close();

    }
}
