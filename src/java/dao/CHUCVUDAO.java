/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.CHUCVU;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class CHUCVUDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public List<CHUCVU> LayCHUCVU(){
        List<CHUCVU> list = new ArrayList<>();
        String query = "SELECT * FROM CHUCVU";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new CHUCVU(rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3)));
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return list;
    }
    
    public void DeleteCV(int macv){
        String query = "DELETE FROM CHUCVU WHERE MaCV = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, macv);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertCV(String tencv, String luong){
        String query = "INSERT INTO CHUCVU VALUES(?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tencv);
            ps.setString(2, luong);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public CHUCVU getCVByMaCV(String macv){
        String query = "SELECT *\n" +
                       "FROM CHUCVU\n" +
                       "WHERE MaCV=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, macv);
            rs = ps.executeQuery();
            while(rs.next()){
                return new CHUCVU(rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void UpdateCV(String macv, String tencv, int luong){
        String query = "UPDATE CHUCVU\n" +
                       "SET TenCV=?, Luong=?\n" +
                       "WHERE MaCV=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tencv);
            ps.setInt(2, luong);
            ps.setString(3, macv);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public CHUCVU KiemTraTrung(String tencv){
        String query = "SELECT *\n" +
                       "FROM CHUCVU\n" +
                       "WHERE TenCV=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tencv);
            rs = ps.executeQuery();
            while(rs.next()){
                return new CHUCVU(rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public List<CHUCVU> SearchByName(String tencv){
        List<CHUCVU> list = new ArrayList<>();
        String query = "SELECT * \n" +
                       "FROM CHUCVU \n" +
                       "WHERE TenCV like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + tencv + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new CHUCVU(rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3)));                                    
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public static void main(String[] args) {
        CHUCVUDAO dao = new CHUCVUDAO();
        List<CHUCVU> list = dao.LayCHUCVU();
        for (CHUCVU cv : list) {
            System.out.println(cv);
        }
    }
}
