/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.NHANVIEN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class NVDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public List<NHANVIEN> LayNHANVIEN(){
        List<NHANVIEN> list = new ArrayList<>();
        String query = "SELECT MaNV,CV.MaCV,TenCV,hoten,ngaysinh,phai,sdt,CCCD \n" +
                       "FROM NHANVIEN NV, CHUCVU CV \n" +
                       "WHERE NV.MaCV=CV.MaCV";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new NHANVIEN(rs.getString(1),
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
    
    public void DeleteNV(int manv){
        String query = "DELETE FROM NHANVIEN WHERE MaNV = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, manv);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertNV(String tennv, String ngaysinh, String gioitinh, String chucvu, String sdt, String cccd){
        String query = "INSERT INTO NHANVIEN VALUES(?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, chucvu);
            ps.setString(2, tennv);
            ps.setString(3, ngaysinh);
            ps.setString(4, gioitinh);
            ps.setString(5, sdt);
            ps.setString(6, cccd);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public NHANVIEN getNVByMaNV(String manv){
        String query = "SELECT MaNV,CV.MaCV,TenCV,hoten,ngaysinh,phai,sdt,CCCD \n" +
                       "FROM NHANVIEN NV, CHUCVU CV \n" +
                       "WHERE MaNV = ? AND nv.MaCV=CV.MaCV";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, manv);
            rs = ps.executeQuery();
            while(rs.next()){
                return new NHANVIEN(rs.getString(1),
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
    
    public void UpdateNV(String manv, String tennv, String chucvu, String ngaysinh,String gioitinh,String sdt, String cccd){
        String query = "UPDATE NHANVIEN\n" +
                       "SET MaCV=?, hoten=?, ngaysinh=?, phai=?, sdt=?, cccd=?\n" +
                       "WHERE MaNV=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, chucvu);
            ps.setString(2, tennv);
            ps.setString(3, ngaysinh);
            ps.setString(4, gioitinh);
            ps.setString(5, sdt);
            ps.setString(6, cccd);
            ps.setString(7, manv);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public List<NHANVIEN> SearchByName(String hoten){
        List<NHANVIEN> list = new ArrayList<>();
        String query = "SELECT MaNV,CV.MaCV,TenCV,hoten,ngaysinh,phai,sdt,CCCD \n" +
                       "FROM NHANVIEN NV, CHUCVU CV \n" +
                       "WHERE hoten like ? AND nv.MaCV=CV.MaCV";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + hoten + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new NHANVIEN(rs.getString(1),
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
        NVDAO dao = new NVDAO();
        List<NHANVIEN> list = dao.LayNHANVIEN();
        for (NHANVIEN nv : list) {
            System.out.println(nv);
        }

    }
    
}
