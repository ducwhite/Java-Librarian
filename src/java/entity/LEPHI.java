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
public class LEPHI {
    private String MALP;
    private String TENLP;
    private String SOTIEN;

    public LEPHI() {
    }

    public LEPHI(String MALP, String TENLP, String SOTIEN) {
        this.MALP = MALP;
        this.TENLP = TENLP;
        this.SOTIEN = SOTIEN;
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
        return "LEPHI{" + "MALP=" + MALP + ", TENLP=" + TENLP + ", SOTIEN=" + SOTIEN + '}';
    }
    
}
