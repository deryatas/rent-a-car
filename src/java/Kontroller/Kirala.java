/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kontroller;

/**
 *
 * @author ASUS
 */
public class Kirala {
    
    int id;
    String alis_tarihi;
    String veris_tarihi;
    String odeme;

    public Kirala(int id, String alis_tarihi, String veris_tarihi, String odeme) {
        this.id = id;
        this.alis_tarihi = alis_tarihi;
        this.veris_tarihi = veris_tarihi;
        this.odeme = odeme;
    }

    public Kirala(String alis_tarihi, String veris_tarihi, String odeme) {
        this.alis_tarihi = alis_tarihi;
        this.veris_tarihi = veris_tarihi;
        this.odeme = odeme;
    }

    public Kirala(String alis_tarihi, String veris_tarihi) {
        this.alis_tarihi = alis_tarihi;
        this.veris_tarihi = veris_tarihi;
    }

    public Kirala() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlis_tarihi() {
        return alis_tarihi;
    }

    public void setAlis_tarihi(String alis_tarihi) {
        this.alis_tarihi = alis_tarihi;
    }

    public String getVeris_tarihi() {
        return veris_tarihi;
    }

    public void setVeris_tarihi(String veris_tarihi) {
        this.veris_tarihi = veris_tarihi;
    }

    public String getOdeme() {
        return odeme;
    }

    public void setOdeme(String odeme) {
        this.odeme = odeme;
    }
    


    
    
    
}
