/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.LOAITK;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class LOAITKDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public List<LOAITK> LayLOAITK(){
        List<LOAITK> list = new ArrayList<>();
        String query = "SELECT * FROM LOAITK";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new LOAITK(rs.getString(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return list;
    }
    
    public void DeleteLOAITK(int maltk){
        String query = "DELETE FROM LOAITK WHERE MaLTK = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, maltk);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertLOAITK(String tenltk){
        String query = "INSERT INTO LOAITK VALUES(?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tenltk);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public LOAITK getLTKByMaLTK(String maltk){
        String query = "SELECT * FROM LOAITK WHERE MaLTK=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, maltk);
            rs = ps.executeQuery();
            while(rs.next()){
                return new LOAITK(rs.getString(1),
                        rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public LOAITK KiemTraTrung(String tenltk){
        String query = "SELECT * FROM LOAITK WHERE TenLTK=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tenltk);
            rs = ps.executeQuery();
            while(rs.next()){
                return new LOAITK(rs.getString(1),
                        rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void UpdateLTK(String maltk, String tenltk){
        String query = "UPDATE LOAITK\n" +
                       "SET TenLTK=?\n" +
                       "WHERE MaLTK=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tenltk);
            ps.setString(2, maltk);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public List<LOAITK> SearchByName(String tenltk){
        List<LOAITK> list = new ArrayList<>();
        String query = "SELECT * FROM LOAITK WHERE TenLTK like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + tenltk + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new LOAITK(rs.getString(1),
                        rs.getString(2)));               
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public static void main(String[] args) {
        LOAITKDAO dao = new LOAITKDAO();
        List<LOAITK> list = dao.LayLOAITK();
        for (LOAITK ltk : list) {
            System.out.println(ltk);
        }
//        System.out.println(s);
    }
}
