/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.CT_VIET;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class CT_VIETDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public void DeleteCT_VIET(int mas, int matg){
        String query = "DELETE FROM CT_VIET WHERE MaSach = ? AND MaTG=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, mas);
            ps.setInt(2, matg);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertCT_VIET(String masach, String matg, String vaitro){
        String query = "INSERT INTO CT_VIET VALUES(?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, masach);
            ps.setString(2, matg);
            ps.setString(3, vaitro);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public List<CT_VIET> getCTByMaCT(String masach){
        List<CT_VIET> list = new ArrayList<>();
        String query = "SELECT S.MaSach,S.TenSach,TG.MaTG,TG.TenTG,Vai_Tro\n" +
                       "FROM CT_VIET CT, SACH S, TACGIA TG\n" +
                       "WHERE CT.MaSach=? AND CT.MaSach=S.MaSach AND CT.MaTG=TG.MaTG";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, masach);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new CT_VIET(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return list;
    }
    
    public CT_VIET getCTByMaCT(String masach,String matg){
        String query = "SELECT S.MaSach,S.TenSach,TG.MaTG,TG.TenTG,Vai_Tro\n" +
                       "FROM CT_VIET CT, SACH S, TACGIA TG\n" +
                       "WHERE CT.MaSach=? AND CT.MaTG=? AND CT.MaSach=S.MaSach AND CT.MaTG=TG.MaTG";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, masach);
            ps.setString(2, matg);
            rs = ps.executeQuery();
            while(rs.next()){
                return new CT_VIET(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return null;
    }
    
    public void UpdateCT(String masach, String matg, String vaitro){
        String query = "UPDATE CT_VIET\n" +
                       "SET Vai_Tro=?\n" +
                       "WHERE MaSach=? AND MaTG=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, vaitro);
            ps.setString(2, masach);
            ps.setString(3, matg);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public static void main(String[] args) {
        CT_VIETDAO dao = new CT_VIETDAO();
        List<CT_VIET> list = dao.getCTByMaCT("1");
        for (CT_VIET ct : list) {
            System.out.println(ct);
        }
    }
}
