/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package araclist;

import araclist.Araclar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class araclarDatabase {
    private String ucret;
    public List<Araclar> getirTumAraclarListe() {
       List<Araclar> r = new ArrayList<>();
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_cars", "root", "root");
           String query = "Select * from araclar";
           PreparedStatement psmt = conn.prepareStatement(query);
           ResultSet rs = psmt.executeQuery();

          while (rs.next()) {
           Araclar reh = new Araclar(rs.getInt("id"), rs.getString("arac_tipi"), rs.getString("marka"), rs.getString("renk"), rs.getString("ucret"), rs.getString("durum"));
           r.add(reh);
          }

          } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
          }
           return r;
    }
    public List<Araclar> getirSearchAraclar(String arac_tipi,String marka,String renk) {
       List<Araclar> r = new ArrayList<>();
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_cars", "root", "root");
           String query = "Select * from araclar where arac_tipi=? and marka=? and renk=?";
           PreparedStatement psmt = conn.prepareStatement(query);
           psmt.setString(1, arac_tipi);
           psmt.setString(2, marka);
           psmt.setString(3, renk);
           psmt.setString(4, ucret);
           psmt.setString(5, "müsait");
           ResultSet rs = psmt.executeQuery();

          while (rs.next()) {
           Araclar reh = new Araclar(rs.getInt("id"), rs.getString("arac_tipi"), rs.getString("marka"), rs.getString("renk"), rs.getString("ucret"),rs.getString("durum"));
           r.add(reh);
          }
         

          } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
          }
          return r;
    }
    
    public int getirTumAraclar(){
        int num = 0;
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/boooking_cars", "root", "root");
           String query = "Select count(*) as toplamarac from  araclar";
           PreparedStatement psmt = conn.prepareStatement(query);
           ResultSet rs = psmt.executeQuery();
           
            while(rs.next()){
              num = (rs.getInt("toplamarac"));
            }

          } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
          }
        return num;
    }

    }
    

