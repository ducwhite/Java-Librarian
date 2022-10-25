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
public class CT_VIET {
    private String MASACH;
    private String TENSACH;
    private String MATG;
    private String TENTG;
    private String VAITRO;

    public CT_VIET() {
    }

    public CT_VIET(String MASACH, String TENSACH, String MATG, String TENTG, String VAITRO) {
        this.MASACH = MASACH;
        this.TENSACH = TENSACH;
        this.MATG = MATG;
        this.TENTG = TENTG;
        this.VAITRO = VAITRO;
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

    public String getVAITRO() {
        return VAITRO;
    }

    public void setVAITRO(String VAITRO) {
        this.VAITRO = VAITRO;
    }

    @Override
    public String toString() {
        return "CT_VIET{" + "MASACH=" + MASACH + ", TENSACH=" + TENSACH + ", MATG=" + MATG + ", TENTG=" + TENTG + ", VAITRO=" + VAITRO + '}';
    }

}
