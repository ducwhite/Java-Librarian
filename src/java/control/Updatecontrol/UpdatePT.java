/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Updatecontrol;

import dao.CT_PMDAO;
import dao.NVDAO;
import dao.PHIEUTRADAO;
import entity.CT_PHIEUMUON;
import entity.NHANVIEN;
import entity.PHIEUTRA;
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
@WebServlet(name = "UpdatePT", urlPatterns = {"/updatePT"})
public class UpdatePT extends HttpServlet {

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
            out.println("<title>Servlet UpdatePT</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdatePT at " + request.getContextPath() + "</h1>");
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
        String mapt = request.getParameter("sid");
        PHIEUTRADAO ptdao = new PHIEUTRADAO();
        PHIEUTRA pt = ptdao.getPTByMaPT(mapt);
        
        NVDAO nvdao = new NVDAO();
        List<NHANVIEN> listnv = nvdao.LayNHANVIEN();
        
        CT_PMDAO ctdao = new CT_PMDAO();
        List<CT_PHIEUMUON> listctpm = ctdao.LayCTPM();
        
        request.setAttribute("listCTPM", listctpm);
        request.setAttribute("listNV", listnv);
        request.setAttribute("pt", pt);
        request.getRequestDispatcher("suaphieutra.jsp").forward(request, response);
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
        String mapt = request.getParameter("mapt");
        String manv = request.getParameter("manv");
        String ngaytra = request.getParameter("ngaytra");
        String ghichu = request.getParameter("ghichu");
        String[] mapmmasach = request.getParameter("mapm").split(":");
        String mapm = mapmmasach[0];
        String masach = mapmmasach[1];
        
        PHIEUTRADAO dao = new PHIEUTRADAO();
        dao.UpdatePT(mapt, manv, masach, mapm, ngaytra, ghichu);
        response.sendRedirect("ptload");
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
