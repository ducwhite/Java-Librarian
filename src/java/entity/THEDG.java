/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ASUS
 */
public class THEDG {
    private String MATHE;
    private String MADG;
    private String TENDG;
    private String MANV;
    private String TENNV;
    private String ngaycap;
    private String HANSD;
    private String TINHTRANG;

    public THEDG() {
    }

    public THEDG(String MATHE, String MADG, String TENDG, String MANV, String TENNV, String ngaycap, String HANSD, String TINHTRANG) {
        this.MATHE = MATHE;
        this.MADG = MADG;
        this.TENDG = TENDG;
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.ngaycap = ngaycap;
        this.HANSD = HANSD;
        this.TINHTRANG = TINHTRANG;
    }

    public String getMATHE() {
        return MATHE;
    }

    public void setMATHE(String MATHE) {
        this.MATHE = MATHE;
    }

    public String getMADG() {
        return MADG;
    }

    public void setMADG(String MADG) {
        this.MADG = MADG;
    }

    public String getTENDG() {
        return TENDG;
    }

    public void setTENDG(String TENDG) {
        this.TENDG = TENDG;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getTENNV() {
        return TENNV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

    public String getNgaycap() {
        return ngaycap;
    }

    public void setNgaycap(String ngaycap) {
        this.ngaycap = ngaycap;
    }

    public String getHANSD() {
        return HANSD;
    }

    public void setHANSD(String HANSD) {
        this.HANSD = HANSD;
    }

    public String getTINHTRANG() {
        return TINHTRANG;
    }

    public void setTINHTRANG(String TINHTRANG) {
        this.TINHTRANG = TINHTRANG;
    }

    @Override
    public String toString() {
        return "THEDG{" + "MATHE=" + MATHE + ", MADG=" + MADG + ", TENDG=" + TENDG + ", MANV=" + MANV + ", TENNV=" + TENNV + ", ngaycap=" + ngaycap + ", HANSD=" + HANSD + ", TINHTRANG=" + TINHTRANG + '}';
    }

    
}
