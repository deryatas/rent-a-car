/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kontroller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Kontroller.Kirala;
import Kontroller.ConnectionPro;

/**
 *
 * @author ASUS
 */
public class KiralaDatabase {
    Connection con ;
   
    public KiralaDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveKirala(Kirala kirala){
        boolean set = false;
        
        try{
           //Insert register data to database
           String query = "insert into kiralama(alis_tarihi, veris_tarihi, odeme) values(?,?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, kirala.getAlis_tarihi());
           pt.setString(2, kirala.getVeris_tarihi());
           pt.setString(3, kirala.getOdeme());
           
           
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    
    //user login
    
    public Kirala logKirala(String alis_tarihi, String veris_tarihi){
        Kirala kirala=null;
        try{
            String query ="SELECT * FROM kiralama where alis_tarihi=? and veris_tarihi=?";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, alis_tarihi);
            pst.setString(2, veris_tarihi);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                kirala = new Kirala();
               
                kirala.setAlis_tarihi(rs.getString(" alis_tarihi"));
                kirala.setVeris_tarihi(rs.getString(" veris_tarihi"));
                kirala.setOdeme(rs.getString("odeme"));
                kirala.setId(rs.getInt("id"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return kirala;
    }
    
    // update user
    public boolean updateKirala(Kirala kirala){
        boolean set = false;
        try{
           //Insert register data to database
           String query = "UPDATE kiralama set alis_tarihi=?, veris_tarihi=?, odeme=? where id=?";
           
           PreparedStatement pst = this.con.prepareStatement(query);
           
           pst.setString(1, kirala.getAlis_tarihi());
           pst.setString(2, kirala.getVeris_tarihi());
           pst.setString(3, kirala.getOdeme());
           pst.setInt(4, kirala.getId());
           
           pst.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    
    public boolean deleteKirala(int id){
        boolean set = false;
        try{
           //Insert register data to database
           String query = "DELETE FROM kiralama where id=?";
           
           PreparedStatement pst = this.con.prepareStatement(query);
           
           pst.setInt(1, id);
           
           pst.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    
    
}
    

