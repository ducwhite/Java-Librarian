/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Updatecontrol;

import dao.HOADONDAO;
import dao.NVDAO;
import dao.THEDGDAO;
import entity.HOADON;
import entity.NHANVIEN;
import entity.THEDG;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.in;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "UpdateHD", urlPatterns = {"/updateHD"})
public class UpdateHD extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateHD</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateHD at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String mahd = request.getParameter("sid");
        HOADONDAO dao = new HOADONDAO();
        HOADON hd = dao.getHDByMaHD(mahd);
        
        NVDAO nvdao = new NVDAO();
        List<NHANVIEN> listnv = nvdao.LayNHANVIEN();
        
        THEDGDAO tdgdao = new THEDGDAO();
        List<THEDG> listtdg = tdgdao.LayTDG();
        
        request.setAttribute("listTDG", listtdg);
        request.setAttribute("listNV", listnv);
        request.setAttribute("hd",hd);
        request.getRequestDispatcher("suahoadon.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        request.setCharacterEncoding("UTF-8");
        String mahd = request.getParameter("mahd");
        String nhanvien = request.getParameter("nhanvien");
        String tendg = request.getParameter("tendg");
        String ngaylap = request.getParameter("ngaylap");
        String tongtien = request.getParameter("tongtien");
        String ghichu = request.getParameter("ghichu");
        
        HOADONDAO dao = new HOADONDAO();
        dao.UpdateHD(mahd, nhanvien, tendg, ngaylap, tongtien, ghichu);
        response.sendRedirect("hdload");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
