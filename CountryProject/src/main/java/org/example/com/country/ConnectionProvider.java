package org.example.com.country;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    static Connection con;
    public static Connection createConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user="root";
            String password="root";
            String url="jdbc:mysql://localhost:3306/country";

            con= DriverManager.getConnection(url,user,password);

        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
