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
public class CT_HOADON {
    private String MAHD;
    private String MALP;
    private String TENLP;
    private String SOTIEN;

    public CT_HOADON() {
    }

    public CT_HOADON(String MAHD, String MALP, String TENLP, String SOTIEN) {
        this.MAHD = MAHD;
        this.MALP = MALP;
        this.TENLP = TENLP;
        this.SOTIEN = SOTIEN;
    }

    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public String getMALP() {
        return MALP;
    }

    public void setMALP(String MALP) {
        this.MALP = MALP;
    }

    public String getTENLP() {
        return TENLP;
    }

    public void setTENLP(String TENLP) {
        this.TENLP = TENLP;
    }

    public String getSOTIEN() {
        return SOTIEN;
    }

    public void setSOTIEN(String SOTIEN) {
        this.SOTIEN = SOTIEN;
    }

    @Override
    public String toString() {
        return "CT_HOADON{" + "MAHD=" + MAHD + ", MALP=" + MALP + ", TENLP=" + TENLP + ", SOTIEN=" + SOTIEN + '}';
    }

}
