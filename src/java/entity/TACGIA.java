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
public class TACGIA {
    private String MATG;
    private String TENTG;
    private String DIACHI;
    private String EMAIL;
    private String CCCD;

    public TACGIA() {
    }

    public TACGIA(String MATG, String TENTG, String DIACHI, String EMAIL, String CCCD) {
        this.MATG = MATG;
        this.TENTG = TENTG;
        this.DIACHI = DIACHI;
        this.EMAIL = EMAIL;
        this.CCCD = CCCD;
    }

    public String getMATG() {
        return MATG;
    }

    public void setMATG(String MATG) {
        this.MATG = MATG;
    }

    public String getTENTG() {
        return TENTG;
    }

    public void setTENTG(String TENTG) {
        this.TENTG = TENTG;
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

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    @Override
    public String toString() {
        return "TACGIA{" + "MATG=" + MATG + ", TENTG=" + TENTG + ", DIACHI=" + DIACHI + ", EMAIL=" + EMAIL + ", CCCD=" + CCCD + '}';
    }
    
}
