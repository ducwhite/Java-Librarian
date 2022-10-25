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
public class NHANVIEN {
    private String MANV;
    private String MACV;
    private String TENCV;
    private String TENNV;
    private String NGAYSINH;
    private String PHAI;
    private String SDT;
    private String CCCD;

    public NHANVIEN() {
    }

    public NHANVIEN(String MANV, String MACV, String TENCV, String TENNV, String NGAYSINH, String PHAI, String SDT, String CCCD) {
        this.MANV = MANV;
        this.MACV = MACV;
        this.TENCV = TENCV;
        this.TENNV = TENNV;
        this.NGAYSINH = NGAYSINH;
        this.PHAI = PHAI;
        this.SDT = SDT;
        this.CCCD = CCCD;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getMACV() {
        return MACV;
    }

    public void setMACV(String MACV) {
        this.MACV = MACV;
    }

    public String getTENCV() {
        return TENCV;
    }

    public void setTENCV(String TENCV) {
        this.TENCV = TENCV;
    }

    public String getTENNV() {
        return TENNV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

    public String getNGAYSINH() {
        return NGAYSINH;
    }

    public void setNGAYSINH(String NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public String getPHAI() {
        return PHAI;
    }

    public void setPHAI(String PHAI) {
        this.PHAI = PHAI;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    @Override
    public String toString() {
        return "NHANVIEN{" + "MANV=" + MANV + ", MACV=" + MACV + ", TENCV=" + TENCV + ", TENNV=" + TENNV + ", NGAYSINH=" + NGAYSINH + ", PHAI=" + PHAI + ", SDT=" + SDT + ", CCCD=" + CCCD + '}';
    }

}
