/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.TAIKHOAN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class TAIKHOANDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public List<TAIKHOAN> LayTAIKHOAN(){
        List<TAIKHOAN> list = new ArrayList<>();
        String query = "SELECT MaTK,LTK.MaLTK,TenLTK,NV.MaNV,hoten,TenTK,MatKhau\n" +
                       "FROM TAIKHOAN TK, NHANVIEN NV, LOAITK LTK\n" +
                       "WHERE TK.MaNV=NV.MaNV AND TK.MaLTK=LTK.MaLTK";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new TAIKHOAN(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return list;
    }
    
    public void DeleteTAIKHOAN(int matk){
        String query = "DELETE FROM TAIKHOAN WHERE MaTK = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, matk);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertTAIKHOAN(String ltk, String nhanvien, String tentk, String matkhau){
        String query = "INSERT INTO TAIKHOAN VALUES(?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, ltk);
            ps.setString(2, nhanvien);
            ps.setString(3, tentk);
            ps.setString(4, matkhau);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public TAIKHOAN getTKByMaTK(String matk){
        String query = "SELECT MaTK,LTK.MaLTK,TenLTK,NV.MaNV,hoten,TenTK,MatKhau\n" +
                       "FROM TAIKHOAN TK, NHANVIEN NV, LOAITK LTK\n" +
                       "WHERE MaTK=? AND TK.MaNV=NV.MaNV AND TK.MaLTK=LTK.MaLTK";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, matk);
            rs = ps.executeQuery();
            while(rs.next()){
                return new TAIKHOAN(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void UpdateTK(String matk, String ltk, String nhanvien, String tentk,String matkhau){
        String query = "UPDATE TAIKHOAN\n" +
                       "SET MaLTK=?, MaNV=?, TenTK=?, MatKhau=?\n" +
                       "WHERE MaTK=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, ltk);
            ps.setString(2, nhanvien);
            ps.setString(3, tentk);
            ps.setString(4, matkhau);
            ps.setString(5, matk);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public TAIKHOAN KiemTraTrung(String tentk){
        String query = "SELECT MaTK,LTK.MaLTK,TenLTK,NV.MaNV,hoten,TenTK,MatKhau\n" +
                       "FROM TAIKHOAN TK, NHANVIEN NV, LOAITK LTK\n" +
                       "WHERE TenTK=? AND TK.MaNV=NV.MaNV AND TK.MaLTK=LTK.MaLTK";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tentk);
            rs = ps.executeQuery();
            while(rs.next()){
                return new TAIKHOAN(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));
            }
        } catch (Exception e) {
        }
        return null;
    } 
    
    public List<TAIKHOAN> SearchByName(String tentk){
        List<TAIKHOAN> list = new ArrayList<>();
        String query = "SELECT MaTK,LTK.MaLTK,TenLTK,NV.MaNV,hoten,TenTK,MatKhau\n" +
                       "FROM TAIKHOAN TK, NHANVIEN NV, LOAITK LTK\n" +
                       "WHERE TenTK like ?  AND TK.MaNV=NV.MaNV AND TK.MaLTK=LTK.MaLTK";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + tentk + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new TAIKHOAN(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)));             
            }
        } catch (Exception e) {
        }
        return list;
    }
}
