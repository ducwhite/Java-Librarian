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
public class PHIEUMUON {
    private String MAPM;
    private String NGAYMUON;
    private String NGAYTRA;
    private String MANV;
    private String TENNV;
    private String MATHE;
    private String TENDG;

    public PHIEUMUON() {
    }

    public PHIEUMUON(String MAPM, String NGAYMUON, String NGAYTRA, String MANV, String TENNV, String MATHE, String TENDG) {
        this.MAPM = MAPM;
        this.NGAYMUON = NGAYMUON;
        this.NGAYTRA = NGAYTRA;
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.MATHE = MATHE;
        this.TENDG = TENDG;
    }

    public String getMAPM() {
        return MAPM;
    }

    public void setMAPM(String MAPM) {
        this.MAPM = MAPM;
    }

    public String getNGAYMUON() {
        return NGAYMUON;
    }

    public void setNGAYMUON(String NGAYMUON) {
        this.NGAYMUON = NGAYMUON;
    }

    public String getNGAYTRA() {
        return NGAYTRA;
    }

    public void setNGAYTRA(String NGAYTRA) {
        this.NGAYTRA = NGAYTRA;
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

    public String getMATHE() {
        return MATHE;
    }

    public void setMATHE(String MATHE) {
        this.MATHE = MATHE;
    }

    public String getTENDG() {
        return TENDG;
    }

    public void setTENDG(String TENDG) {
        this.TENDG = TENDG;
    }

    @Override
    public String toString() {
        return "PHIEUMUON{" + "MAPM=" + MAPM + ", NGAYMUON=" + NGAYMUON + ", NGAYTRA=" + NGAYTRA + ", MANV=" + MANV + ", TENNV=" + TENNV + ", MATHE=" + MATHE + ", TENDG=" + TENDG + '}';
    }

}
