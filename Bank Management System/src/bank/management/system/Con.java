package bank.management.system;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Con {
    Connection connection;

    Statement statement;

    public Con() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            // To connect our database with this project
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem",
                    "root",
                    "Nikita300506@Aradhya");

            statement = connection.createStatement();
        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
