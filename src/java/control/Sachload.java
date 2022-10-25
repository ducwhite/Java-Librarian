/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.NXBDAO;
import dao.SACHDAO;
import dao.THELOAIDAO;
import entity.NXB;
import entity.SACH;
import entity.THELOAI;
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
 * @author Admin
 */
@WebServlet(name = "Sachload", urlPatterns = {"/sachload"})
public class Sachload extends HttpServlet {

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
            out.println("<title>Servlet Sachcontrol</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Sachcontrol at " + request.getContextPath() + "</h1>");
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
//        processRequest(request, response);
        request.setCharacterEncoding("UTF-8");
        SACHDAO dao = new SACHDAO();
        List<SACH> list = dao.LaySACH();
        
        THELOAIDAO tldao = new THELOAIDAO();
        List<THELOAI> listtl = tldao.LayTheLoai();
        
        NXBDAO nxbdao = new NXBDAO();
        List<NXB> listnxb = nxbdao.LayNXB();
        
        
        
        request.setAttribute("listNXB", listnxb);
        request.setAttribute("listTL", listtl);
        request.setAttribute("listS", list);
        request.getRequestDispatcher("sach.jsp").forward(request, response);
        
        
//        THELOAI tl = new THELOAI();
//        THELOAIDAO daotl = new THELOAIDAO();
//        String action = request.getParameter("action");
//        action = "Add";
//        switch(action){
//            case "Add":
//                request.setAttribute("listTL", daotl.LayTheLoai());
//                request.getRequestDispatcher("sach.jsp").forward(request, response);
//        }
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
