/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Updatecontrol;

import dao.CT_PMDAO;
import dao.LEPHIDAO;
import dao.NVDAO;
import dao.PHIEUPHATDAO;
import entity.CT_PHIEUMUON;
import entity.LEPHI;
import entity.NHANVIEN;
import entity.PHIEUPHAT;
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
@WebServlet(name = "UpdatePP", urlPatterns = {"/updatePP"})
public class UpdatePP extends HttpServlet {

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
            out.println("<title>Servlet UpdatePP</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdatePP at " + request.getContextPath() + "</h1>");
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
        String mapp = request.getParameter("sid");
        PHIEUPHATDAO dao = new PHIEUPHATDAO();
        PHIEUPHAT pp = dao.getPPByMaPP(mapp);
        
        NVDAO nvdao = new NVDAO();
        List<NHANVIEN> listnv = nvdao.LayNHANVIEN();
        
        CT_PMDAO ctpmdao = new CT_PMDAO();
        List<CT_PHIEUMUON> listctpm = ctpmdao.LayCTPM();
        
        LEPHIDAO lpdao = new LEPHIDAO();
        List<LEPHI> listlp = lpdao.LayLePhi();
        
        request.setAttribute("listCTPM", listctpm);
        request.setAttribute("listLP", listlp);
        request.setAttribute("listNV",listnv);
        request.setAttribute("pp",pp);
        request.getRequestDispatcher("suaphieuphat.jsp").forward(request, response);
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
        String mapp = request.getParameter("mapp");
        String ngayphat = request.getParameter("ngayphat");
        String manv = request.getParameter("manv");
        String[] mapmmasach = request.getParameter("mapm").split(":");
        String mapm = mapmmasach[0];
        String masach = mapmmasach[1];
        String[] malpsotien = request.getParameter("malp").split(",");
        String malp = malpsotien[0];
        String phiphat = malpsotien[1];
        
        PHIEUPHATDAO dao = new PHIEUPHATDAO();
        dao.UpdatePP(mapp, ngayphat, phiphat, manv, mapm, masach, malp);
        response.sendRedirect("ppload");
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
