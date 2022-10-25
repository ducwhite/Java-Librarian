/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.CT_PHIEUMUON;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class CT_PMDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua

    public List<CT_PHIEUMUON> LayCTPM(){
        List<CT_PHIEUMUON> list = new ArrayList<>();
        String query = "SELECT CT.MaSach,S.TenSach,CT.MaPM,ghichu\n" +
                       "FROM CT_PHIEUMUON CT,SACH S, PHIEUMUON PM\n" +
                       "WHERE CT.MaPM=PM.MaPM AND S.MaSach=CT.MaSach";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new CT_PHIEUMUON(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)));
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return list;
    }
    
    public void DeleteCT_PM(int mapm, int masach){
        String query = "DELETE FROM CT_PHIEUMUON WHERE MaPM=? AND MaSach=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, mapm);
            ps.setInt(2, masach);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertCTPM(String mapm, String masach, String ghichu){
        String query = "INSERT INTO CT_PHIEUMUON VALUES(?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, masach);
            ps.setString(2, mapm);
            ps.setString(3, ghichu);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public List<CT_PHIEUMUON> getCTPMByMaCT(String mapm){
        String query = "SELECT CT.MaSach,S.TenSach,CT.MaPM,ghichu\n" +
                       "FROM CT_PHIEUMUON CT,SACH S, PHIEUMUON PM\n" +
                       "WHERE CT.MaPM=? AND CT.MaPM=PM.MaPM AND S.MaSach=CT.MaSach";
        List<CT_PHIEUMUON> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, mapm);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new CT_PHIEUMUON(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public CT_PHIEUMUON getCTPMByMaCT(String mapm, String masach){
        String query = "SELECT CT.MaSach,S.TenSach,CT.MaPM,ghichu\n" +
                       "FROM CT_PHIEUMUON CT,SACH S, PHIEUMUON PM\n" +
                       "WHERE CT.MaPM=? AND CT.MaSach=? AND CT.MaPM=PM.MaPM AND S.MaSach=CT.MaSach";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, mapm);
            ps.setString(2, masach);
            rs = ps.executeQuery();
            while(rs.next()){
                return new CT_PHIEUMUON(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void UpdateCT(String masach, String mapm, String ghichu){
        String query = "UPDATE CT_PHIEUMUON\n" +
                       "SET ghichu=?\n" +
                       "WHERE MaSach=? AND MaPM=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, ghichu);
            ps.setString(2, masach);
            ps.setString(3, mapm);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public static void main(String[] args) {
        CT_PMDAO dao = new CT_PMDAO();
        List<CT_PHIEUMUON> list = dao.getCTPMByMaCT("1");
        for (CT_PHIEUMUON ct : list) {
            System.out.println(ct);
        }
    }
}
