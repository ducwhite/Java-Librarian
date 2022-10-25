/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Admin
 */
public class SACH {
    private int MASACH;
    private String TENSACH;
    private int NAMXB;
    private int SL;
    private String MATL;
    private String TENTL;
    private String MAXB;
    private String TENNXB;

    public SACH() {
    }

    public SACH(int MASACH, String TENSACH, int NAMXB, int SL, String MATL, String TENTL, String MAXB, String TENNXB) {
        this.MASACH = MASACH;
        this.TENSACH = TENSACH;
        this.NAMXB = NAMXB;
        this.SL = SL;
        this.MATL = MATL;
        this.TENTL = TENTL;
        this.MAXB = MAXB;
        this.TENNXB = TENNXB;
    }

    public int getMASACH() {
        return MASACH;
    }

    public void setMASACH(int MASACH) {
        this.MASACH = MASACH;
    }

    public String getTENSACH() {
        return TENSACH;
    }

    public void setTENSACH(String TENSACH) {
        this.TENSACH = TENSACH;
    }

    public int getNAMXB() {
        return NAMXB;
    }

    public void setNAMXB(int NAMXB) {
        this.NAMXB = NAMXB;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public String getMATL() {
        return MATL;
    }

    public void setMATL(String MATL) {
        this.MATL = MATL;
    }

    public String getTENTL() {
        return TENTL;
    }

    public void setTENTL(String TENTL) {
        this.TENTL = TENTL;
    }

    public String getMAXB() {
        return MAXB;
    }

    public void setMAXB(String MAXB) {
        this.MAXB = MAXB;
    }

    public String getTENNXB() {
        return TENNXB;
    }

    public void setTENNXB(String TENNXB) {
        this.TENNXB = TENNXB;
    }

    @Override
    public String toString() {
        return "SACH{" + "MASACH=" + MASACH + ", TENSACH=" + TENSACH + ", NAMXB=" + NAMXB + ", SL=" + SL + ", MATL=" + MATL + ", TENTL=" + TENTL + ", MAXB=" + MAXB + ", TENNXB=" + TENNXB + '}';
    }
    
    
}
