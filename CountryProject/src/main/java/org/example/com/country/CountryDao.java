package org.example.com.country;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CountryDao {


    public static void addCountry(Country c) {

        try{
            Connection con= ConnectionProvider.createConnection();
            String q="insert into countries (cname,ccapital,ccode) values (?,?,?)";
            PreparedStatement pstmt= con.prepareStatement(q);
            pstmt.setString(1,c.getCountryName());
            pstmt.setString(2,c.getCountryCapital());
            pstmt.setInt(3,c.getCountryCode());

            pstmt.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void getAllCountries() {

        try{
            Connection con= ConnectionProvider.createConnection();
            String q="select * from countries";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(q);
            while (set.next()){
                int id= set.getInt(1);
                String name= set.getString(2);
                String capital= set.getString(3);
                int code= set.getInt(4);

                System.out.println("ID : "+id);
                System.out.println("CountryName : "+name);
                System.out.println("CountryCapital : "+capital);
                System.out.println("CountryCode : "+code);
                System.out.println("++++++++++++++++++++++++++++");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void deleteCountry(int cid) {

        try{
            Connection con = ConnectionProvider.createConnection();
            String q="delete from countries where cid=?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1,cid);

            pstmt.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void updateCountry(Country country, int cid) {

        try{
            Connection con= ConnectionProvider.createConnection();
            String q = "update countries set cname=?, ccapital=?, ccode=? where cid=?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,country.getCountryName());
            pstmt.setString(2,country.getCountryCapital());
            pstmt.setInt(3,country.getCountryCode());
            pstmt.setInt(4,cid);

            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
