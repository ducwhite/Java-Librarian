/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.THEDG;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class THEDGDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public List<THEDG> LayTDG(){
        List<THEDG> list = new ArrayList<>();
        String query = "SELECT MaThe,DG.MaDG,DG.hoten,NV.MaNV,NV.hoten,ngaycap,hansd,tinhtrang\n" +
                       "FROM THEDG TDG, DOCGIA DG, NHANVIEN NV\n" +
                       "WHERE TDG.MaDG=DG.MaDG AND TDG.MaNV=NV.MaNV";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new THEDG(rs.getString(1),
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
    
    public void DeleteTDG(int matdg){
        String query = "DELETE FROM THEDG WHERE MaThe = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, matdg);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertTDG(String madg, String manv, String ngaycap, String hansd, String tinhtrang){
        String query = "INSERT INTO THEDG VALUES(?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, madg);
            ps.setString(2, manv);
            ps.setString(3, ngaycap);
            ps.setString(4, hansd);
            ps.setString(5, tinhtrang);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public THEDG getTDGByMaTDG(String matdg){
        String query = "SELECT MaThe,DG.MaDG,DG.hoten,NV.MaNV,NV.hoten,ngaycap,hansd,tinhtrang\n" +
                       "FROM THEDG TDG, DOCGIA DG, NHANVIEN NV\n" +
                       "WHERE MaThe=? AND TDG.MaDG=DG.MaDG AND TDG.MaNV=NV.MaNV";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, matdg);
            rs = ps.executeQuery();
            while(rs.next()){
                return new THEDG(rs.getString(1),
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
    
    public void UpdateTDG(String matdg, String tendg, String manv, String ngaycap, String tinhtrang){
        String query = "UPDATE THEDG\n" +
                       "SET MaDG=?, MaNV=?, ngaycap=?, tinhtrang=?\n" +
                       "WHERE MaThe=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tendg);
            ps.setString(2, manv);
            ps.setString(3, ngaycap);
            ps.setString(4, tinhtrang);
            ps.setString(5, matdg);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public List<THEDG> SearchByName(String hoten){
        List<THEDG> list = new ArrayList<>();
        String query = "SELECT MaThe,DG.MaDG,DG.hoten,NV.MaNV,NV.hoten,ngaycap,hansd,tinhtrang\n" +
                       "FROM THEDG TDG, DOCGIA DG, NHANVIEN NV\n" +
                       "WHERE DG.hoten like ? AND TDG.MaDG=DG.MaDG AND TDG.MaNV=NV.MaNV";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + hoten + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new THEDG(rs.getString(1),
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
