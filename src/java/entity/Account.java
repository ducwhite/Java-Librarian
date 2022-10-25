/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Dau
 */
public class Account {
    private String MATK;
    private String MALTK;
    private String TENLTK;
    private String MANV;
    private String TENNV;
    private String username;
    private String password;

    public Account() {
    }

    public Account(String MATK, String MALTK, String TENLTK, String MANV, String TENNV, String username, String password) {
        this.MATK = MATK;
        this.MALTK = MALTK;
        this.TENLTK = TENLTK;
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.username = username;
        this.password = password;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" + "MATK=" + MATK + ", MALTK=" + MALTK + ", TENLTK=" + TENLTK + ", MANV=" + MANV + ", TENNV=" + TENNV + ", username=" + username + ", password=" + password + '}';
    }

}
