/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.HOADON;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class HOADONDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public List<HOADON> LayHOADON(){
        List<HOADON> list = new ArrayList<>();
        String query = "SELECT MAHD,HD.MaNV,NV.hoten,TDG.MaThe,DG.hoten,ngaylap,tongtien,ghichu\n" +
                       "FROM HOADON HD, NHANVIEN NV, THEDG TDG, DOCGIA DG\n" +
                       "WHERE HD.MaNV=NV.MaNV AND HD.MaThe=TDG.MaThe AND DG.MaDG=TDG.MaDG";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new HOADON(rs.getString(1),
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
    
    public void DeleteHOADON(int mahd){
        String query = "DELETE FROM HOADON WHERE MAHD = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, mahd);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertHoaDon(String nhanvien,String tdg, String ngaylap, String tongtien, String ghichu){
        String query = "INSERT INTO HOADON VALUES(?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, nhanvien);
            ps.setString(2, tdg);
            ps.setString(3, ngaylap);
            ps.setString(4, tongtien);
            ps.setString(5, ghichu);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public HOADON getHDByMaHD(String mahd){
        String query = "SELECT MAHD,HD.MaNV,NV.hoten,TDG.MaThe,DG.hoten,ngaylap,tongtien,ghichu\n" +
                       "FROM HOADON HD, NHANVIEN NV, THEDG TDG, DOCGIA DG\n" +
                       "WHERE MAHD=? AND HD.MaNV=NV.MaNV AND HD.MaThe=TDG.MaThe AND DG.MaDG=TDG.MaDG";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, mahd);
            rs = ps.executeQuery();
            while(rs.next()){
                return new HOADON(rs.getString(1),
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
    
    public void UpdateHD(String mahd, String manv,String mathe, String ngaylap, String tongtien,String ghichu){
        String query = "UPDATE HOADON\n" +
                       "SET MaNV=?, MaThe=?, ngaylap=?, tongtien=?, ghichu=?\n" +
                       "WHERE MAHD=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, manv);
            ps.setString(2, mathe);
            ps.setString(3, ngaylap);
            ps.setString(4, tongtien);
            ps.setString(5, ghichu);
            ps.setString(6, mahd);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public List<HOADON> SearchByName(String mahd){
        List<HOADON> list = new ArrayList<>();
        String query = "SELECT MAHD,HD.MaNV,NV.hoten,TDG.MaThe,DG.hoten,ngaylap,tongtien,ghichu\n" +
                       "FROM HOADON HD, NHANVIEN NV, THEDG TDG, DOCGIA DG\n" +
                       "WHERE MAHD like ? AND HD.MaNV=NV.MaNV AND HD.MaThe=TDG.MaThe AND DG.MaDG=TDG.MaDG";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + mahd + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new HOADON(rs.getString(1),
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
    
    public static void main(String[] args) {
        HOADONDAO dao = new HOADONDAO();
        HOADON hd = dao.getHDByMaHD("2");
//        for (SACH sach : s) {
//            System.out.println(sach);
//        }
        System.out.println(hd);
    }
}
