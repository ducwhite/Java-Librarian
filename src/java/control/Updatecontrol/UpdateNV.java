/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.Updatecontrol;

import dao.CHUCVUDAO;
import dao.NVDAO;
import entity.CHUCVU;
import entity.NHANVIEN;
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
@WebServlet(name = "UpdateNV", urlPatterns = {"/updateNV"})
public class UpdateNV extends HttpServlet {

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
            out.println("<title>Servlet UpdateNV</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateNV at " + request.getContextPath() + "</h1>");
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
        String manv = request.getParameter("sid");
        NVDAO dao = new NVDAO();
        NHANVIEN nv = dao.getNVByMaNV(manv);
        String phai = nv.getPHAI();
        CHUCVUDAO cvdao = new CHUCVUDAO();
        List<CHUCVU> listcv = cvdao.LayCHUCVU();
        
        request.setAttribute("listCV",listcv);
        request.setAttribute("nv",nv);
        request.getRequestDispatcher("suanhanvien.jsp").forward(request, response);
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
        String manv = request.getParameter("manv");
        String tennv = request.getParameter("tennv");
        String chucvu = request.getParameter("chucvu");
        String ngaysinh = request.getParameter("ngaysinh");
        String gioitinh = request.getParameter("gioitinh");
        String sdt = request.getParameter("sdt");
        String cccd = request.getParameter("cccd");
        
        NVDAO dao = new NVDAO();
        dao.UpdateNV(manv, tennv, chucvu, ngaysinh, gioitinh, sdt, cccd);
        response.sendRedirect("nvload");
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
