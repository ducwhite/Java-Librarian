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
public class CHUCVU {
    private String MACV;
    private String TENCV;
    private int LUONG;

    public CHUCVU(String MACV, String TENCV, int LUONG) {
        this.MACV = MACV;
        this.TENCV = TENCV;
        this.LUONG = LUONG;
    }

    public CHUCVU() {
    }

    public String getMACV() {
        return MACV;
    }

    public void setMACV(String MACV) {
        this.MACV = MACV;
    }

    public String getTENCV() {
        return TENCV;
    }

    public void setTENCV(String TENCV) {
        this.TENCV = TENCV;
    }

    public int getLUONG() {
        return LUONG;
    }

    public void setLUONG(int LUONG) {
        this.LUONG = LUONG;
    }

    @Override
    public String toString() {
        return "CHUCVU{" + "MACV=" + MACV + ", TENCV=" + TENCV + ", LUONG=" + LUONG + '}';
    }

    
}
