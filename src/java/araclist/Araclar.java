/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package araclist;

/**
 *
 * @author ASUS
 */
public class Araclar {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArac_tipi() {
        return arac_tipi;
    }

    public Araclar() {
    }

    public void setArac_tipi(String arac_tipi) {
        this.arac_tipi = arac_tipi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getUcret() {
        return ucret;
    }

    public void setUcret(String ucret) {
        this.ucret = ucret;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
    int id;
    String arac_tipi;

    public Araclar(String arac_tipi, String marka, String renk) {
        this.arac_tipi = arac_tipi;
        this.marka = marka;
        this.renk = renk;
    }
    String marka;

    public Araclar(String arac_tipi, String marka, String renk, String ucret) {
        this.arac_tipi = arac_tipi;
        this.marka = marka;
        this.renk = renk;
        this.ucret = ucret;
    }
    String renk;

    public Araclar(String arac_tipi, String marka, String renk, String ucret, String durum) {
        this.arac_tipi = arac_tipi;
        this.marka = marka;
        this.renk = renk;
        this.ucret = ucret;
        this.durum = durum;
    }
    String ucret;
    String durum;

    public Araclar(int id, String arac_tipi, String marka, String renk, String ucret, String durum) {
        this.id = id;
        this.arac_tipi = arac_tipi;
        this.marka = marka;
        this.renk = renk;
        this.ucret = ucret;
        this.durum = durum;
    }

  
    
}
