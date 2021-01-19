/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kontroller;

import araclist.Araclar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class KiralaList {
    
     public List<Kirala> getirTumKiralaListe() {
       List<Kirala> r = new ArrayList<>();
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_cars", "root", "root");
           String query = "Select * from kiralama";
           PreparedStatement psmt = conn.prepareStatement(query);
           ResultSet rs = psmt.executeQuery();

          while (rs.next()) {
           Kirala reh = new Kirala(rs.getInt("id"), rs.getString("alis_tarihi"), rs.getString("veris_tarihi"), rs.getString("odeme"));
           r.add(reh);
          }

          } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
          }
           return r;
    }
     public int getirTumKira(){
        int num = 0;
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/boooking_cars", "root", "root");
           String query = "Select count(*) as toplamkira from  kiralama";
           PreparedStatement psmt = conn.prepareStatement(query);
           ResultSet rs = psmt.executeQuery();
           
            while(rs.next()){
              num = (rs.getInt("toplamkira"));
            }

          } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
          }
        return num;
    }
}
