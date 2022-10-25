/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.CT_HOADON;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class CT_HDDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public void DeleteCT_HD(String mahd, String malp){
        String query = "DELETE FROM CT_HOADON WHERE MaHD=? AND MaLP=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, mahd);
            ps.setString(2, malp);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertCTHD(String mahd, String malp){
        String query = "INSERT INTO CT_HOADON VALUES(?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, mahd);
            ps.setString(2, malp);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public List<CT_HOADON> getCTHDByMaCT(String mahd){
        String query = "SELECT MAHD,LP.MaLP,TenLP,sotien \n" +
                       "FROM CT_HOADON CT, LEPHI LP \n" +
                       "WHERE MAHD=? AND LP.MaLP=CT.MaLP";
        List<CT_HOADON> list = new ArrayList<>();
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, mahd);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new CT_HOADON(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public void TinhTien(String mahd){
        String query = "UPDATE HOADON SET tongtien = (SELECT SUM(LP.sotien) \n" +
                       "FROM HOADON HD, CT_HOADON CT, LEPHI LP\n" +
                       "WHERE HD.MAHD = ?  AND HD.MAHD=CT.MAHD AND CT.MaLP=LP.MaLP ) \n" +
                       "WHERE MAHD = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, mahd);
            ps.setString(2, mahd);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
//    
//    public void UpdateSach(String masach, String tensach, int namxb, int sl,String matl,String maxb){
//        String query = "UPDATE SACH\n" +
//                       "SET TenSach=?, NamXB=?, SL=?, MaTL=?, MAXB=?\n" +
//                       "WHERE MaSach=?";
//        try {
//            conn = new DBContext().getConnection();
//            ps = conn.prepareStatement(query);
//            ps.setString(1, tensach);
//            ps.setInt(2, namxb);
//            ps.setInt(3, sl);
//            ps.setString(4, matl);
//            ps.setString(5, maxb);
//            ps.setString(6, masach);
//            ps.executeUpdate();
//        } catch (Exception e) {
//        }
//        
//    }
}
