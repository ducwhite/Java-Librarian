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
public class THELOAI {
    private String MATL;
    private String TENTL;

    public THELOAI() {
    }

    public THELOAI(String MATL, String TENTL) {
        this.MATL = MATL;
        this.TENTL = TENTL;
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

    @Override
    public String toString() {
        return "THELOAI{" + "MATL=" + MATL + ", TENTL=" + TENTL + '}';
    }

    
}
