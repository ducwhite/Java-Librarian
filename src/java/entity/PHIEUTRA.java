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
public class PHIEUTRA {
    private String MAPT;
    private String MANV;
    private String TENNV;
    private String MASACH;
    private String TENSACH;
    private String MAPM;
    private String NGAYTRA;
    private String GHICHU;

    public PHIEUTRA() {
    }

    public PHIEUTRA(String MAPT, String MANV, String TENNV, String MASACH, String TENSACH, String MAPM, String NGAYTRA, String GHICHU) {
        this.MAPT = MAPT;
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.MASACH = MASACH;
        this.TENSACH = TENSACH;
        this.MAPM = MAPM;
        this.NGAYTRA = NGAYTRA;
        this.GHICHU = GHICHU;
    }

    public String getMAPT() {
        return MAPT;
    }

    public void setMAPT(String MAPT) {
        this.MAPT = MAPT;
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

    public String getNGAYTRA() {
        return NGAYTRA;
    }

    public void setNGAYTRA(String NGAYTRA) {
        this.NGAYTRA = NGAYTRA;
    }

    public String getGHICHU() {
        return GHICHU;
    }

    public void setGHICHU(String GHICHU) {
        this.GHICHU = GHICHU;
    }

    @Override
    public String toString() {
        return "PHIEUTRA{" + "MAPT=" + MAPT + ", MANV=" + MANV + ", TENNV=" + TENNV + ", MASACH=" + MASACH + ", TENSACH=" + TENSACH + ", MAPM=" + MAPM + ", NGAYTRA=" + NGAYTRA + ", GHICHU=" + GHICHU + '}';
    }

}
