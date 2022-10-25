/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Updatecontrol;

import dao.NVDAO;
import dao.PHIEUMUONDAO;
import dao.THEDGDAO;
import entity.NHANVIEN;
import entity.PHIEUMUON;
import entity.THEDG;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "UpdatePM", urlPatterns = {"/updatePM"})
public class UpdatePM extends HttpServlet {

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
            out.println("<title>Servlet UpdatePM</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdatePM at " + request.getContextPath() + "</h1>");
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
        String mapm = request.getParameter("sid");
        PHIEUMUONDAO dao = new PHIEUMUONDAO();
        PHIEUMUON pm = dao.getPMByMaPM(mapm);
        
        NVDAO nvdao = new NVDAO();
        List<NHANVIEN> listnv = nvdao.LayNHANVIEN();
        
        THEDGDAO tdgdao = new THEDGDAO();
        List<THEDG> listtdg = tdgdao.LayTDG();
        
        request.setAttribute("listTDG",listtdg);
        request.setAttribute("listNV",listnv);
        request.setAttribute("pm",pm);
        request.getRequestDispatcher("suaphieumuon.jsp").forward(request, response);
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
        String mapm = request.getParameter("mapm");
        String ngaymuon = request.getParameter("ngaymuon");
        String ngaytra = request.getParameter("ngaytra");
        String nhanvien = request.getParameter("nhanvien");
        String thedg = request.getParameter("thedg");
        
        PHIEUMUONDAO dao = new PHIEUMUONDAO();
        dao.UpdatePM(mapm, ngaymuon, ngaytra, nhanvien, thedg);
        response.sendRedirect("pmload");
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
