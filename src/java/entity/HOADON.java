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
public class HOADON {
    private String MAHD;
    private String MANV;
    private String TENNV;
    private String MATDG;
    private String TENDG;
    private String NGAYLAP;
    private String TONGTIEN;
    private String GHICHU;

    public HOADON() {
    }

    public HOADON(String MAHD, String MANV, String TENNV, String MATDG, String TENDG, String NGAYLAP, String TONGTIEN, String GHICHU) {
        this.MAHD = MAHD;
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.MATDG = MATDG;
        this.TENDG = TENDG;
        this.NGAYLAP = NGAYLAP;
        this.TONGTIEN = TONGTIEN;
        this.GHICHU = GHICHU;
    }

    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
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

    public String getMATDG() {
        return MATDG;
    }

    public void setMATDG(String MATDG) {
        this.MATDG = MATDG;
    }

    public String getTENDG() {
        return TENDG;
    }

    public void setTENDG(String TENDG) {
        this.TENDG = TENDG;
    }

    public String getNGAYLAP() {
        return NGAYLAP;
    }

    public void setNGAYLAP(String NGAYLAP) {
        this.NGAYLAP = NGAYLAP;
    }

    public String getTONGTIEN() {
        return TONGTIEN;
    }

    public void setTONGTIEN(String TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }

    public String getGHICHU() {
        return GHICHU;
    }

    public void setGHICHU(String GHICHU) {
        this.GHICHU = GHICHU;
    }

    @Override
    public String toString() {
        return "HOADON{" + "MAHD=" + MAHD + ", MANV=" + MANV + ", TENNV=" + TENNV + ", MATDG=" + MATDG + ", TENDG=" + TENDG + ", NGAYLAP=" + NGAYLAP + ", TONGTIEN=" + TONGTIEN + ", GHICHU=" + GHICHU + '}';
    }

}
