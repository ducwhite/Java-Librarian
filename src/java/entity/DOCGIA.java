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
public class DOCGIA {
    private String MADOCGIA;
    private String TENDOCGIA;
    private String DIACHI;
    private String EMAIL;
    private String SDT;
    private String NGAYSINH;
    private String GIOITINH;
    private String CCCD;

    public DOCGIA() {
    }

    public DOCGIA(String MADOCGIA, String TENDOCGIA, String DIACHI, String EMAIL, String SDT, String NGAYSINH, String GIOITINH, String CCCD) {
        this.MADOCGIA = MADOCGIA;
        this.TENDOCGIA = TENDOCGIA;
        this.DIACHI = DIACHI;
        this.EMAIL = EMAIL;
        this.SDT = SDT;
        this.NGAYSINH = NGAYSINH;
        this.GIOITINH = GIOITINH;
        this.CCCD = CCCD;
    }

    public String getMADOCGIA() {
        return MADOCGIA;
    }

    public void setMADOCGIA(String MADOCGIA) {
        this.MADOCGIA = MADOCGIA;
    }

    public String getTENDOCGIA() {
        return TENDOCGIA;
    }

    public void setTENDOCGIA(String TENDOCGIA) {
        this.TENDOCGIA = TENDOCGIA;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getNGAYSINH() {
        return NGAYSINH;
    }

    public void setNGAYSINH(String NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    @Override
    public String toString() {
        return "DOCGIA{" + "MADOCGIA=" + MADOCGIA + ", TENDOCGIA=" + TENDOCGIA + ", DIACHI=" + DIACHI + ", EMAIL=" + EMAIL + ", SDT=" + SDT + ", NGAYSINH=" + NGAYSINH + ", GIOITINH=" + GIOITINH + ", CCCD=" + CCCD + '}';
    }

}
