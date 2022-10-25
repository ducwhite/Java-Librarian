/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.NXB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class NXBDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public List<NXB> LayNXB(){
        List<NXB> list = new ArrayList<>();
        String query = "SELECT * FROM NHAXB";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new NXB(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)));
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return list;
    }
    
    public void DeleteNXB(int manxb){
        String query = "DELETE FROM NHAXB WHERE MAXB = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, manxb);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertNXB(String nxb, String diachi, String sdt){
        String query = "INSERT INTO NHAXB VALUES(?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, nxb);
            ps.setString(2, diachi);
            ps.setString(3, sdt);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public NXB getNXBByMaXB(String manxb){
        String query = "SELECT * FROM NHAXB WHERE MAXB=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, manxb);
            rs = ps.executeQuery();
            while(rs.next()){
                return new NXB(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void UpdateNXB(String manxb, String nxb, String diachi, String sdt){
        String query = "UPDATE NHAXB\n" +
                       "SET NXB=?, diachi=?, sdt=?\n" +
                       "WHERE MAXB=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, nxb);
            ps.setString(2, diachi);
            ps.setString(3, sdt);
            ps.setString(4, manxb);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public List<NXB> SearchByName(String nxb){
        List<NXB> list = new ArrayList<>();
        String query = "SELECT * \n" +
                       "FROM NHAXB \n" +
                       "WHERE NXB like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + nxb + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new NXB(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)));                                
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public static void main(String[] args) {
        NXBDAO dao = new NXBDAO();
        List<NXB> list = dao.LayNXB();
        for (NXB nxb : list) {
            System.out.println(nxb);
        }
    }
}