/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.PHIEUPHAT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class PHIEUPHATDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public List<PHIEUPHAT> LayPhieuPhat(){
        List<PHIEUPHAT> list = new ArrayList<>();
        String query = "SELECT MaPP,NV.MaNV,NV.hoten,S.MaSach,S.TenSach,CT.MaPM,LP.MaLP,LP.TenLP,LP.sotien,ngayphat,phiphat\n" +
                       "FROM PHIEUPHAT PP, NHANVIEN NV, SACH S, LEPHI LP,CT_PHIEUMUON CT\n" +
                       "WHERE PP.MaNV=NV.MaNV AND PP.MaSach=CT.MaSach AND CT.MaSach=S.MaSach AND PP.MaLP=LP.MaLP AND PP.MaPM=CT.MaPM";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new PHIEUPHAT(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)));
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return list;
    }
    
    public void DeleteSach(int mapp){
        String query = "DELETE FROM PHIEUPHAT WHERE MaPP = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, mapp);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertPhieuPhat(String ngayphat, String phiphat, String manv,String masach, String mapm, String malp){
        String query = "INSERT INTO PHIEUPHAT VALUES(?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, ngayphat);
            ps.setString(2, phiphat);
            ps.setString(3, manv);
            ps.setString(4, masach);
            ps.setString(5, mapm);
            ps.setString(6, malp);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public PHIEUPHAT getPPByMaPP(String mapp){
        String query = "SELECT MaPP,NV.MaNV,NV.hoten,S.MaSach,S.TenSach,CT.MaPM,LP.MaLP,LP.TenLP,LP.sotien,ngayphat,phiphat\n" +
                       "FROM PHIEUPHAT PP, NHANVIEN NV, SACH S, LEPHI LP,CT_PHIEUMUON CT\n" +
                       "WHERE MaPP=? AND PP.MaNV=NV.MaNV AND PP.MaSach=CT.MaSach AND CT.MaSach=S.MaSach AND PP.MaLP=LP.MaLP AND PP.MaPM=CT.MaPM";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, mapp);
            rs = ps.executeQuery();
            while(rs.next()){
                return new PHIEUPHAT(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void UpdatePP(String mapp, String ngayphat, String phiphat, String manv,String mapm, String masach, String malp){
        String query = "UPDATE PHIEUPHAT\n" +
                       "SET ngayphat=?, phiphat=?, MaNV=?, MaPM=?,MaSach=?, MaLP=?\n" +
                       "WHERE MaPP=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, ngayphat);
            ps.setString(2, phiphat);
            ps.setString(3, manv);
            ps.setString(4, mapm);
            ps.setString(5, masach);
            ps.setString(6, malp);
            ps.setString(7, mapp);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public List<PHIEUPHAT> SearchByMaPP(String mapp){
        List<PHIEUPHAT> list = new ArrayList<>();
        String query = "SELECT MaPP,NV.MaNV,NV.hoten,S.MaSach,S.TenSach,CT.MaPM,LP.MaLP,LP.TenLP,LP.sotien,ngayphat,phiphat\n" +
                       "FROM PHIEUPHAT PP, NHANVIEN NV, SACH S, LEPHI LP,CT_PHIEUMUON CT\n" +
                       "WHERE MaPP like ? AND PP.MaNV=NV.MaNV AND PP.MaSach=CT.MaSach AND CT.MaSach=S.MaSach AND PP.MaLP=LP.MaLP AND PP.MaPM=CT.MaPM";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + mapp + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new PHIEUPHAT(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)));                                                
            }
        } catch (Exception e) {
        }
        return list;
    }
}
