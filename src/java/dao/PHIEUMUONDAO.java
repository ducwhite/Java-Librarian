/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.PHIEUMUON;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class PHIEUMUONDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public List<PHIEUMUON> LayPhieuMuon(){
        List<PHIEUMUON> list = new ArrayList<>();
        String query = "SELECT MaPM,ngaymuon,ngaytra,NV.MaNV,NV.hoten,PM.MaThe,DG.hoten \n" +
                       "FROM PHIEUMUON PM,NHANVIEN NV,THEDG TDG,DOCGIA DG \n" +
                       "WHERE PM.MaNV=NV.MaNV AND PM.MaThe=TDG.MaThe AND TDG.MaDG=DG.MaDG ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new PHIEUMUON(rs.getString(1),
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
    
    public void DeletePM(int mapm){
        String query = "DELETE FROM PHIEUMUON WHERE MaPM = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, mapm);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void InsertPM(String ngaymuon, String ngaytra, String nhanvien, String docgia){
        String query = "INSERT INTO PHIEUMUON VALUES(?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, ngaymuon);
            ps.setString(2, ngaytra);
            ps.setString(3, nhanvien);
            ps.setString(4, docgia);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public PHIEUMUON getPMByMaPM(String mapm){
        String query = "SELECT MaPM,ngaymuon,ngaytra,NV.MaNV,NV.hoten,PM.MaThe,DG.hoten \n" +
                       "FROM PHIEUMUON PM,NHANVIEN NV,THEDG TDG,DOCGIA DG \n" +
                       "WHERE MaPM=? AND PM.MaNV=NV.MaNV AND PM.MaThe=TDG.MaThe AND TDG.MaDG=DG.MaDG ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, mapm);
            rs = ps.executeQuery();
            while(rs.next()){
                return new PHIEUMUON(rs.getString(1),
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
    
    public void UpdatePM(String mapm, String ngaymuon, String ngaytra, String nhanvien,String thedg){
        String query = "UPDATE PHIEUMUON\n" +
                       "SET ngaymuon=?, ngaytra=?, MaNV=?, MaThe=?\n" +
                       "WHERE MaPM=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, ngaymuon);
            ps.setString(2, ngaytra);
            ps.setString(3, nhanvien);
            ps.setString(4, thedg);
            ps.setString(5, mapm);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public List<PHIEUMUON> SearchByMaPM(String mapm){
        List<PHIEUMUON> list = new ArrayList<>();
        String query = "SELECT MaPM,ngaymuon,ngaytra,NV.MaNV,NV.hoten,PM.MaThe,DG.hoten \n" +
                       "FROM PHIEUMUON PM,NHANVIEN NV,THEDG TDG,DOCGIA DG \n" +
                       "WHERE MaPM like ? AND PM.MaNV=NV.MaNV AND PM.MaThe=TDG.MaThe AND TDG.MaDG=DG.MaDG ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + mapm + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new PHIEUMUON(rs.getString(1),
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
