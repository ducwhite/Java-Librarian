/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Updatecontrol;

import dao.CT_VIETDAO;
import dao.SACHDAO;
import dao.TACGIADAO;
import entity.CT_VIET;
import entity.SACH;
import entity.TACGIA;
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
@WebServlet(name = "UpdateCTV", urlPatterns = {"/updateCTV"})
public class UpdateCTV extends HttpServlet {

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
            out.println("<title>Servlet UpdateCTV</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateCTV at " + request.getContextPath() + "</h1>");
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
        String mas = request.getParameter("sid1");
        String matg = request.getParameter("sid2");
        CT_VIETDAO dao = new CT_VIETDAO();
        CT_VIET ct = dao.getCTByMaCT(mas, matg);
        
        SACHDAO sdao = new SACHDAO();
        List<SACH> lists = sdao.LaySACH();
        
        TACGIADAO tgdao = new TACGIADAO();
        List<TACGIA> listtg = tgdao.LayTacGia();
        
        request.setAttribute("listS",lists);
        request.setAttribute("listTG",listtg);
        request.setAttribute("ct",ct);
        request.getRequestDispatcher("suachitietsach.jsp").forward(request, response);
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
        String tens = request.getParameter("tens");
        String tentg = request.getParameter("tentg");
        String vaitro = request.getParameter("vaitro");
        
        CT_VIETDAO dao = new CT_VIETDAO();
        dao.UpdateCT(tens, tentg, vaitro);
        response.sendRedirect("chitietsach?sid=" + tens);
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
