/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.SACH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class SACHDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public List<SACH> LaySACH(){
        List<SACH> list = new ArrayList<>();
        String query = "SELECT MaSach,TenSach,NamXB,SL,TL.MaTL,TenTL,XB.MAXB,NXB FROM SACH S, THELOAI TL, NhaXB XB WHERE S.MaTL=TL.MaTL AND S.MAXB=XB.MAXB";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new SACH(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
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
    
    public void DeleteSach(int masach){
        String query = "DELETE FROM SACH WHERE MaSach = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, masach);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertSach(String tensach, int namxb, int sl, String matl, String maxb){
        String query = "INSERT INTO SACH VALUES(?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tensach);
            ps.setInt(2, namxb);
            ps.setInt(3, sl);
            ps.setString(4, matl);
            ps.setString(5, maxb);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public SACH getSachByMaSach(String masach){
        String query = "SELECT MaSach,TenSach,NamXB,SL,TL.MaTL,TenTL,XB.MAXB,NXB FROM SACH S, THELOAI TL, NhaXB XB WHERE MaSach=? AND S.MaTL=TL.MaTL AND S.MAXB=XB.MAXB";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, masach);
            rs = ps.executeQuery();
            while(rs.next()){
                return new SACH(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void UpdateSach(String masach, String tensach, int namxb, int sl,String matl,String maxb){
        String query = "UPDATE SACH\n" +
                       "SET TenSach=?, NamXB=?, SL=?, MaTL=?, MAXB=?\n" +
                       "WHERE MaSach=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tensach);
            ps.setInt(2, namxb);
            ps.setInt(3, sl);
            ps.setString(4, matl);
            ps.setString(5, maxb);
            ps.setString(6, masach);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public List<SACH> SearchByName(String tensach){
        List<SACH> list = new ArrayList<>();
        String query = "SELECT MaSach,TenSach,NamXB,SL,TL.MaTL,TenTL,XB.MAXB,NXB \n" +
                       "FROM SACH S, THELOAI TL, NhaXB XB \n" +
                       "WHERE TenSach like ? AND S.MaTL=TL.MaTL AND S.MAXB=XB.MAXB";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + tensach + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new SACH(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
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
        SACHDAO dao = new SACHDAO();
        dao.UpdateSach("2", "Vợ nhặt", 1998, 3, "2", "3");
//        for (SACH sach : s) {
//            System.out.println(sach);
//        }
        //System.out.println(s);
    }
    
}
