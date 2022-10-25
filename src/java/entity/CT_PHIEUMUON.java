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
public class CT_PHIEUMUON {
    private String MASACH;
    private String TENSACH;
    private String MAPM;
    private String ghichu;

    public CT_PHIEUMUON() {
    }

    public CT_PHIEUMUON(String MASACH, String TENSACH, String MAPM, String ghichu) {
        this.MASACH = MASACH;
        this.TENSACH = TENSACH;
        this.MAPM = MAPM;
        this.ghichu = ghichu;
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

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    @Override
    public String toString() {
        return "CT_PHIEUMUON{" + "MASACH=" + MASACH + ", TENSACH=" + TENSACH + ", MAPM=" + MAPM + ", ghichu=" + ghichu + '}';
    }
    
}
