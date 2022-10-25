/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.PHIEUTRA;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class PHIEUTRADAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public List<PHIEUTRA> LayPhieuTra(){
        List<PHIEUTRA> list = new ArrayList<>();
        String query = "SELECT MAPT,NV.MaNV,hoten,CT.MaSach,S.TenSach,CT.MaPM,ngaytra,PT.ghichu\n" +
                       "FROM PHIEUTRA PT, NHANVIEN NV, CT_PHIEUMUON CT, SACH S\n" +
                       "WHERE PT.MaNV=NV.MaNV AND PT.MaPM=CT.MaPM AND PT.MaSach=CT.MaSach AND CT.MaSach=S.MaSach";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new PHIEUTRA(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)));
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return list;
    }
    
    public void DeletePhieuTra(int mapt){
        String query = "DELETE FROM PHIEUTRA WHERE MaPT = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, mapt);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertPhieuTra(String manv, String masach,String mapm, String ngaytra, String ghichu){
        String query = "INSERT INTO PHIEUTRA VALUES(?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, manv);
            ps.setString(2, masach);
            ps.setString(3, mapm);
            ps.setString(4, ngaytra);
            ps.setString(5, ghichu);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public PHIEUTRA getPTByMaPT(String mapt){
        String query = "SELECT MAPT,NV.MaNV,hoten,CT.MaSach,S.TenSach,CT.MaPM,ngaytra,PT.ghichu\n" +
                       "FROM PHIEUTRA PT, NHANVIEN NV, CT_PHIEUMUON CT, SACH S\n" +
                       "WHERE MaPT=? AND PT.MaNV=NV.MaNV AND PT.MaPM=CT.MaPM AND PT.MaSach=CT.MaSach AND CT.MaSach=S.MaSach";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, mapt);
            rs = ps.executeQuery();
            while(rs.next()){
                return new PHIEUTRA(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void UpdatePT(String mapt, String manv, String masach, String mapm, String ngaytra, String ghichu){
        String query = "UPDATE PHIEUTRA\n" +
                       "SET MaNV=?, MaSach=?, MaPM=?, ngaytra=?,ghichu=?\n" +
                       "WHERE MaPT=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, manv);
            ps.setString(2, masach);
            ps.setString(3, mapm);
            ps.setString(4, ngaytra);
            ps.setString(5, ghichu);
            ps.setString(6, mapt);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public List<PHIEUTRA> SearchByMaPT(String mapt){
        List<PHIEUTRA> list = new ArrayList<>();
        String query = "SELECT MAPT,NV.MaNV,hoten,CT.MaSach,S.TenSach,CT.MaPM,ngaytra,PT.ghichu\n" +
                       "FROM PHIEUTRA PT, NHANVIEN NV, CT_PHIEUMUON CT, SACH S\n" +
                       "WHERE MaPT like ? AND PT.MaNV=NV.MaNV AND PT.MaPM=CT.MaPM AND PT.MaSach=CT.MaSach AND CT.MaSach=S.MaSach";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + mapt + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new PHIEUTRA(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)));                                                
            }
        } catch (Exception e) {
        }
        return list;
    }
}
