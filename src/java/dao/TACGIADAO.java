/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.TACGIA;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class TACGIADAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    
    public List<TACGIA> LayTacGia(){
        List<TACGIA> list = new ArrayList<>();
        String query = "SELECT * FROM TACGIA";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new TACGIA(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return list;
    }
    
    public void DeleteTG(int matg){
        String query = "DELETE FROM TACGIA WHERE MaTG = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, matg);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertTG(String tentg, String diachi, String email, String cccd){
        String query = "INSERT INTO TACGIA VALUES(?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tentg);
            ps.setString(2, diachi);
            ps.setString(3, email);
            ps.setString(4, cccd);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public TACGIA getTGByMaTG(String matg){
        String query = "SELECT * FROM TACGIA WHERE MaTG=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, matg);
            rs = ps.executeQuery();
            while(rs.next()){
                return new TACGIA(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void UpdateTG(String matg, String tentg, String diachi,String email, String cccd){
        String query = "UPDATE TACGIA\n" +
                       "SET TenTG=?, DiaChi=?, Email=?, CCCD=?\n" +
                       "WHERE MaTG=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tentg);
            ps.setString(2, diachi);
            ps.setString(3, email);
            ps.setString(4, cccd);
            ps.setString(5, matg);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public List<TACGIA> SearchByName(String tentg){
        List<TACGIA> list = new ArrayList<>();
        String query = "SELECT * \n" +
                       "FROM TACGIA \n" +
                       "WHERE TenTG like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + tentg + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new TACGIA(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)));                     
            }
        } catch (Exception e) {
        }
        return list;
    }
}
