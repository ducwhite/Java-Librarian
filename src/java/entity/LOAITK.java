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
public class LOAITK {
    private String MALTK;
    private String TENLTK;

    public LOAITK() {
    }

    public LOAITK(String MALTK, String TENLTK) {
        this.MALTK = MALTK;
        this.TENLTK = TENLTK;
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

    @Override
    public String toString() {
        return "LOAITK{" + "MALTK=" + MALTK + ", TENLTK=" + TENLTK + '}';
    }
    
}
