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
public class NXB {
    private String MAXB;
    private String NXB;
    private String diachi;
    private String sdt;

    public NXB() {
    }

    public NXB(String MAXB, String NXB, String diachi, String sdt) {
        this.MAXB = MAXB;
        this.NXB = NXB;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public String getMAXB() {
        return MAXB;
    }

    public void setMAXB(String MAXB) {
        this.MAXB = MAXB;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "NXB{" + "MAXB=" + MAXB + ", NXB=" + NXB + ", diachi=" + diachi + ", sdt=" + sdt + '}';
    }
    
    
}
