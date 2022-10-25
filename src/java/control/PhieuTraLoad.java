/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.CT_PMDAO;
import dao.NVDAO;
import dao.PHIEUMUONDAO;
import dao.PHIEUTRADAO;
import dao.SACHDAO;
import entity.CT_PHIEUMUON;
import entity.NHANVIEN;
import entity.PHIEUMUON;
import entity.PHIEUTRA;
import entity.SACH;
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
@WebServlet(name = "PhieuTraLoad", urlPatterns = {"/ptload"})
public class PhieuTraLoad extends HttpServlet {

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
            out.println("<title>Servlet PhieuTraLoad</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PhieuTraLoad at " + request.getContextPath() + "</h1>");
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
        request.setCharacterEncoding("UTF-8");
        PHIEUTRADAO ptdao = new PHIEUTRADAO();
        List<PHIEUTRA> listpt = ptdao.LayPhieuTra();
        
        NVDAO nvdao = new NVDAO();
        List<NHANVIEN> listnv = nvdao.LayNHANVIEN();
        
        CT_PMDAO ctdao = new CT_PMDAO();
        List<CT_PHIEUMUON> listctpm = ctdao.LayCTPM();
        
        request.setAttribute("listCTPM", listctpm);
        request.setAttribute("listNV", listnv);
        request.setAttribute("listPT", listpt);
        request.getRequestDispatcher("phieutra.jsp").forward(request, response);
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
        processRequest(request, response);
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
