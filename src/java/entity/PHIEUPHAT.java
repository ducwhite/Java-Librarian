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
public class PHIEUPHAT {
    private String MAPP;
    private String MANV;
    private String TENNV;
    private String MASACH;
    private String TENSACH;
    private String MAPM;
    private String MALP;
    private String TENLP;
    private String SOTIEN;
    private String NGAYPHAT;
    private String PHIPHAT;

    public PHIEUPHAT() {
    }

    public PHIEUPHAT(String MAPP, String MANV, String TENNV, String MASACH, String TENSACH, String MAPM, String MALP, String TENLP, String SOTIEN, String NGAYPHAT, String PHIPHAT) {
        this.MAPP = MAPP;
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.MASACH = MASACH;
        this.TENSACH = TENSACH;
        this.MAPM = MAPM;
        this.MALP = MALP;
        this.TENLP = TENLP;
        this.SOTIEN = SOTIEN;
        this.NGAYPHAT = NGAYPHAT;
        this.PHIPHAT = PHIPHAT;
    }

    public String getMAPP() {
        return MAPP;
    }

    public void setMAPP(String MAPP) {
        this.MAPP = MAPP;
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

    public String getMASACH() {
        return MASACH;
    }

    public void setMASACH(String MASACH) {
        this.MASACH = MASACH;
    }

    public String getTENSACH() {
        return TENSACH;
    }

    public void setTENSACH(String TENSACH) {
        this.TENSACH = TENSACH;
    }

    public String getMAPM() {
        return MAPM;
    }

    public void setMAPM(String MAPM) {
        this.MAPM = MAPM;
    }

    public String getMALP() {
        return MALP;
    }

    public void setMALP(String MALP) {
        this.MALP = MALP;
    }

    public String getTENLP() {
        return TENLP;
    }

    public void setTENLP(String TENLP) {
        this.TENLP = TENLP;
    }

    public String getSOTIEN() {
        return SOTIEN;
    }

    public void setSOTIEN(String SOTIEN) {
        this.SOTIEN = SOTIEN;
    }

    public String getNGAYPHAT() {
        return NGAYPHAT;
    }

    public void setNGAYPHAT(String NGAYPHAT) {
        this.NGAYPHAT = NGAYPHAT;
    }

    public String getPHIPHAT() {
        return PHIPHAT;
    }

    public void setPHIPHAT(String PHIPHAT) {
        this.PHIPHAT = PHIPHAT;
    }

    @Override
    public String toString() {
        return "PHIEUPHAT{" + "MAPP=" + MAPP + ", MANV=" + MANV + ", TENNV=" + TENNV + ", MASACH=" + MASACH + ", TENSACH=" + TENSACH + ", MAPM=" + MAPM + ", MALP=" + MALP + ", TENLP=" + TENLP + ", SOTIEN=" + SOTIEN + ", NGAYPHAT=" + NGAYPHAT + ", PHIPHAT=" + PHIPHAT + '}';
    }
    
}
