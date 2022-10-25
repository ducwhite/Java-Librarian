/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.LEPHI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class LEPHIDAO {
    Connection conn = null; //ket noi SQL server
    PreparedStatement ps = null; //cau lenh query
    ResultSet rs = null; //ket qua
    public List<LEPHI> LayLePhi(){
        List<LEPHI> list = new ArrayList<>();
        String query = "SELECT * FROM LEPHI";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new LEPHI(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)));
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
        return list;
    }
    
    public void DeleteLePhi(int malp){
        String query = "DELETE FROM LEPHI WHERE MaLP = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, malp);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void InsertLePhi(String tenlp, String sotien){
        String query = "INSERT INTO LEPHI VALUES(?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tenlp);
            ps.setString(2, sotien);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public LEPHI getLPByMaLP(String malp){
        String query = "SELECT * FROM LEPHI WHERE MaLP=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, malp);
            rs = ps.executeQuery();
            while(rs.next()){
                return new LEPHI(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void UpdateLP(String malp, String tenlp, String sotien){
        String query = "UPDATE LEPHI\n" +
                       "SET TenLP=?, sotien=?\n" +
                       "WHERE MaLP=?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, tenlp);
            ps.setString(2, sotien);
            ps.setString(3, malp);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    }
    
    public List<LEPHI> SearchByName(String tenlp){
        List<LEPHI> list = new ArrayList<>();
        String query = "SELECT * \n" +
                       "FROM LEPHI \n" +
                       "WHERE TenLP like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,"%" + tenlp + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new LEPHI(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)));                                
            }
        } catch (Exception e) {
        }
        return list;
    }
}
