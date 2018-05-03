package com.juja.sqlcmd.model;

import java.sql.*;

public class ConnectManager  {

    public static void main(String[] args) throws SQLException{
        final String nameDB = "postgres";
        final String passwordDB = "1111";
        final String urlDB = "jdbc:postgresql://localhost:5432/postgres";

        final Connection connection = DriverManager.getConnection(urlDB, nameDB, passwordDB);
    }
}
