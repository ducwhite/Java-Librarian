/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Dau
 */
public class LoginDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public Account checkLogin(String user, String pass) {
        try {
            String query = "SELECT MaTK,TK.MaLTK,LTK.TenLTK,NV.MaNV,NV.hoten,TenTK,MatKhau\n" +
                           "FROM TAIKHOAN TK, LOAITK LTK, NHANVIEN NV\n" +
                           "WHERE TenTK=? AND MatKhau=? AND TK.MaNV=NV.MaNV AND TK.MaLTK=LTK.MaLTK";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Account(rs.getString(1),
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
    
}
