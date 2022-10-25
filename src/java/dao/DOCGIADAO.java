/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.DOCGIA;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class DOCGIADAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public List<DOCGIA> LayDocGIa(){
        List<DOCGIA> list = new ArrayList<>();
        String query = "SELECT * FROM DOCGIA";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new DOCGIA(rs.getString(1),
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
    
    public void DeleteDG(int madg){
        String query = "DELETE FROM DOCGIA WHERE MaDG = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, madg);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertDG(String tendg, String diachi, String email, String sdt, String ngaysinh, String gioitinh, String cccd){
        String query = "INSERT INTO DOCGIA VALUES(?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tendg);
            ps.setString(2, diachi);
            ps.setString(3, email);
            ps.setString(4, sdt);
            ps.setString(5, ngaysinh);
            ps.setString(6, gioitinh);
            ps.setString(7, cccd);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public DOCGIA getDGByMaDG(String madg){
        String query = "SELECT * FROM DOCGIA WHERE MaDG = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, madg);
            rs = ps.executeQuery();
            while(rs.next()){
                return new DOCGIA(rs.getString(1),
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
    
    public void UpdateDG(String madg, String tendg, String diachi, String email,String sdt,String ngaysinh, String gioitinh,String cccd){
        String query = "UPDATE DOCGIA\n" +
                       "SET hoten=?, diachi=?, email=?, sdt=?, ngaysinh=?, gioitinh=?, cccd=?\n" +
                       "WHERE MaDG=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tendg);
            ps.setString(2, diachi);
            ps.setString(3, email);
            ps.setString(4, sdt);
            ps.setString(5, ngaysinh);
            ps.setString(6, gioitinh);
            ps.setString(7, cccd);
            ps.setString(8, madg);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public List<DOCGIA> SearchByName(String hoten){
        List<DOCGIA> list = new ArrayList<>();
        String query = "SELECT * \n" +
                       "FROM DOCGIA \n" +
                       "WHERE hoten like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + hoten + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new DOCGIA(rs.getString(1),
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
        DOCGIADAO dao = new DOCGIADAO();
        List<DOCGIA> list = dao.LayDocGIa();
        for (DOCGIA dg : list) {
            System.out.println(dg);
        }
    }
    
}
