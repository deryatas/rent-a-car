/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package araclist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import araclist.Araclar;
import userdao.ConnectionPro;
/**
 *
 * @author ASUS
 */
public class Database {
   
     Connection con;
    private Araclar Araclar;

    public boolean addAraclar(Araclar Araclar){
        boolean set = false;
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_cars", "root", "root");
           String query = "INSERT INTO araclar(arac_tipi, marka, renk, ucret, durum) values(?,?,?,?,?)";
           PreparedStatement pt = con.prepareStatement(query);
           
           pt.setString(1, Araclar.getArac_tipi());
           pt.setString(2, Araclar.getMarka());
           pt.setString(3,Araclar.getRenk());
           pt.setString(4, Araclar.getUcret());
           pt.setString(5,Araclar.getDurum());
           
           pt.executeUpdate();
           } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
          }
           return set;
    }
    
    public Araclar searchAraclar(String aracTipi, String marka, String renk){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_cars", "root", "root");
            String query ="SELECT * FROM araclar where arac_tipi=? and marka=? and renk=? ";

           PreparedStatement pst = conn.prepareStatement(query);
           pst.setString(1, aracTipi);
           pst.setString(2, marka);
           pst.setString(3, renk);
           
           ResultSet rs = pst.executeQuery();
           if(rs.next()){
                Araclar Araclar = new Araclar();
                Araclar.setId(rs.getInt("id"));
                Araclar.setArac_tipi(rs.getString("arac_tipi"));
                Araclar.setMarka(rs.getString("marka"));
                Araclar.setRenk(rs.getString("renk"));
                Araclar.setUcret(rs.getString("ucret"));
                Araclar.setDurum(rs.getString("durum"));
            }
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
          }
        return Araclar;
    }
    
    public boolean deleteAraclar(int id){
        boolean set = false;
        try{
           //Insert register data to database
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_cars", "root", "root");
           String query = "DELETE FROM araclar where id=?";
           
           PreparedStatement pst = conn.prepareStatement(query);
           
           pst.setInt(1, id);
           
           pst.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }


    
}
