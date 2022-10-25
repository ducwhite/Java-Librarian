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
public class TAIKHOAN {
    private String MATK;
    private String MALTK;
    private String TENLTK;
    private String MANV;
    private String TENNV;
    private String TENTK;
    private String MATKHAU;

    public TAIKHOAN() {
    }

    public TAIKHOAN(String MATK, String MALTK, String TENLTK, String MANV, String TENNV, String TENTK, String MATKHAU) {
        this.MATK = MATK;
        this.MALTK = MALTK;
        this.TENLTK = TENLTK;
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.TENTK = TENTK;
        this.MATKHAU = MATKHAU;
    }

    public String getMATK() {
        return MATK;
    }

    public void setMATK(String MATK) {
        this.MATK = MATK;
    }

    public String getMALTK() {
        return MALTK;
    }

    public void setMALTK(String MALTK) {
        this.MALTK = MALTK;
    }

    public String getTENLTK() {
        return TENLTK;
    }

    public void setTENLTK(String TENLTK) {
        this.TENLTK = TENLTK;
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

    public String getTENTK() {
        return TENTK;
    }

    public void setTENTK(String TENTK) {
        this.TENTK = TENTK;
    }

    public String getMATKHAU() {
        return MATKHAU;
    }

    public void setMATKHAU(String MATKHAU) {
        this.MATKHAU = MATKHAU;
    }

    @Override
    public String toString() {
        return "TAIKHOAN{" + "MATK=" + MATK + ", MALTK=" + MALTK + ", TENLTK=" + TENLTK + ", MANV=" + MANV + ", TENNV=" + TENNV + ", TENTK=" + TENTK + ", MATKHAU=" + MATKHAU + '}';
    }

}
