/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Updatecontrol;

import dao.LOAITKDAO;
import dao.NVDAO;
import dao.TAIKHOANDAO;
import entity.LOAITK;
import entity.NHANVIEN;
import entity.TAIKHOAN;
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
@WebServlet(name = "UpdateTK", urlPatterns = {"/updateTK"})
public class UpdateTK extends HttpServlet {

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
            out.println("<title>Servlet UpdateTK</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateTK at " + request.getContextPath() + "</h1>");
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
        String matk = request.getParameter("sid");
        TAIKHOANDAO dao = new TAIKHOANDAO();
        TAIKHOAN tk = dao.getTKByMaTK(matk);
        
        NVDAO nvdao = new NVDAO();
        List<NHANVIEN> listnv = nvdao.LayNHANVIEN();
        
        LOAITKDAO ltkdao = new LOAITKDAO();
        List<LOAITK> listltk = ltkdao.LayLOAITK();
        
        request.setAttribute("listLTK", listltk);
        request.setAttribute("listNV", listnv);
        request.setAttribute("tk",tk);
        request.getRequestDispatcher("suataikhoan.jsp").forward(request, response);
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
        TAIKHOANDAO dao = new TAIKHOANDAO();
        String tentk = request.getParameter("tentk");
        TAIKHOAN tk = dao.KiemTraTrung(tentk);
        if(tk==null){
            String matk = request.getParameter("matk");
        String ltk = request.getParameter("ltk");
        String nhanvien = request.getParameter("nhanvien");
        String matkhau = request.getParameter("matkhau");
        
        dao.UpdateTK(matk, ltk, nhanvien, tentk, matkhau);
        response.sendRedirect("tkload");
        }
        else{
            response.sendRedirect("tkload");
        }
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
