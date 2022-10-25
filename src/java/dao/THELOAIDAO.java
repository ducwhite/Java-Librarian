/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.THELOAI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class THELOAIDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public List<THELOAI> LayTheLoai(){
        List<THELOAI> list = new ArrayList<>();
        String query = "SELECT * FROM THELOAI";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new THELOAI(rs.getString(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return list;
    }
    
    public void DeleteTL(int matl){
        String query = "DELETE FROM THELOAI WHERE MaTL = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, matl);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertTL(String tentl){
        String query = "INSERT INTO THELOAI VALUES(?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tentl);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public THELOAI getTLByMaTL(String matl){
        String query = "SELECT * FROM THELOAI WHERE MaTL=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, matl);
            rs = ps.executeQuery();
            while(rs.next()){
                return new THELOAI(rs.getString(1),
                        rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void UpdateTL(String matl, String tentl){
        String query = "UPDATE THELOAI\n" +
                       "SET TenTL=?\n" +
                       "WHERE MaTL=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tentl);
            ps.setString(2, matl);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public List<THELOAI> SearchByName(String tentl){
        List<THELOAI> list = new ArrayList<>();
        String query = "SELECT * \n" +
                       "FROM THELOAI \n" +
                       "WHERE TenTL like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + tentl + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new THELOAI(rs.getString(1),
                        rs.getString(2)));                                                
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public THELOAI KiemTraTrung(String tentl){
        String query = "SELECT * FROM THELOAI WHERE TenTL=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tentl);
            rs = ps.executeQuery();
            while(rs.next()){
                return new THELOAI(rs.getString(1),
                        rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public static void main(String[] args) {
        THELOAIDAO dao = new THELOAIDAO();
        List<THELOAI> list = dao.LayTheLoai();
        for (THELOAI tl : list) {
            System.out.println(tl);
        }
    }
    
}
