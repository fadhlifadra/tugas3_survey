/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fadhli Hisyam
 */
@WebServlet(name = "QueryAddData", urlPatterns = {"/QueryAddData"})
public class QueryAddData extends HttpServlet {

    @Resource
    private javax.transaction.UserTransaction utx;
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
        PrintWriter out = response.getWriter();
        try {
            String n1 = "";
            String n2 = "";
            String n3 = "";
            String n4 = "";
            String n5 = "";
            String n6 = "";
            String n7 = "";
            String n8 = "";
            if (request.getParameter("n1") != null) {
                n1 = request.getParameter("n1");
            }
            if (request.getParameter("n2") != null) {
                n2 = request.getParameter("n2");
            }
            if (request.getParameter("n3") != null) {
                n3 = request.getParameter("n3");
            }
            if (request.getParameter("n4") != null) {
                n4 = request.getParameter("n4");
            }
            if (request.getParameter("n5") != null) {
                n5 = request.getParameter("n5");
            }
            if (request.getParameter("n6") != null) {
                n6 = request.getParameter("n6");
            }
            if (request.getParameter("n7") != null) {
                n7 = request.getParameter("n7");
            }
            if (request.getParameter("n8") != null) {
                n8 = request.getParameter("n8");
            }
            
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">");
            out.println("<link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">");
            out.println("<link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">");
            out.println("</head>");
            out.println("<body id=\"page-top\">");
            out.println("<div id=\"wrapper\">");
            out.println("<ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">");
            out.println("<a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.html\">");
            out.println("<div class=\"sidebar-brand-icon rotate-n-15\">");
            out.println("<i class=\"fas fa-laugh-wink\"></i>");
            out.println("</div>");
            out.println("<div class=\"sidebar-brand-text mx-3\">JPA Survey</div>");
            out.println("</a>");
            out.println("<hr class=\"sidebar-divider my-0\">");
            out.println("<li class=\"nav-item\">");
            out.println("<a class=\"nav-link\" href=\"index.html\">");
            out.println("<i class=\"fas fa-fw fa-tachometer-alt\"></i>");
            out.println("<span>Home</span></a>");
            out.println("</li>");
            out.println("<hr class=\"sidebar-divider d-none d-md-block\">");
            out.println("<div class=\"text-center d-none d-md-inline\">");
            out.println("<button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>");
            out.println("</div>");
            out.println("</ul>");
            out.println("<div id=\"content-wrapper\" class=\"d-flex flex-column\">");
            out.println("<div id=\"content\">");
            out.println("<nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">");
            out.println("<h2>Survey Mata Kuliah Mahasiswa Teknik Komputer Universitas Diponegoro</h2>");
            out.println("</nav>");
            out.println("<div class=\"container-fluid\">");
            out.println("<form class=\"user\" method=\"post\" action=\"QueryAddData\" method=\"get\">");
            out.println("<div class=\"form-group\">");
            out.println("<div class=\"col-sm-6 mb-3 mb-sm-0\">");
            out.println("Nama Lengkap :");
            out.println("<input type=\"text\" name=\"n1\" class=\"form-control bg-light border-0 small\" aria-label=\"Search\" aria-describedby=\"basic-addon2\" value=\""+n1+"\" disabled>");
            out.println("</div><br>");
            out.println("<div class=\"col-sm-6 mb-3 mb-sm-0\">");
            out.println("NIM :");
            out.println("<input type=\"text\" name=\"n2\" class=\"form-control bg-light border-0 small\" aria-label=\"Search\" aria-describedby=\"basic-addon2\" value=\""+n2+"\" disabled>");
            out.println("</div><br>");
            out.println("<div class=\"col-sm-6 mb-3 mb-sm-0\">");
            out.println("Angkatan :");
            out.println("<input type=\"text\" name=\"n3\" class=\"form-control bg-light border-0 small\" aria-label=\"Search\" aria-describedby=\"basic-addon2\" value=\""+n3+"\" disabled>");
            out.println("</div><br><br>");
            out.println("<div class=\"col-sm-6 mb-3 mb-sm-0\">");
            out.println("Selama kuliah, mata kuliah apa yang paling Anda senangi?");
            out.println("<input type=\"text\" name=\"n4\" class=\"form-control bg-light border-0 small\" aria-label=\"Search\" aria-describedby=\"basic-addon2\" value=\""+n4+"\" disabled>");
            out.println("</div><br>");
            out.println("<div class=\"col-sm-6 mb-3 mb-sm-0\">");
            out.println("Selama kuliah, mata kuliah apa yang paling Anda tidak senangi?");
            out.println("<input type=\"text\" name=\"n5\" class=\"form-control bg-light border-0 small\" aria-label=\"Search\" aria-describedby=\"basic-addon2\" value=\""+n5+"\" disabled>");
            out.println("</div><br>");
            out.println("<div class=\"col-sm-6 mb-3 mb-sm-0\">");
            out.println("Selama kuliah, praktikum apa yang paling Anda senangi?");
            out.println("<input type=\"text\" name=\"n6\" class=\"form-control bg-light border-0 small\" aria-label=\"Search\" aria-describedby=\"basic-addon2\" value=\""+n6+"\" disabled>");
            out.println("</div><br>");
            out.println("<div class=\"col-sm-6 mb-3 mb-sm-0\">");
            out.println("Selama kuliah, praktikum apa yang paling Anda tidak senangi?");
            out.println("<input type=\"text\" name=\"n7\" class=\"form-control bg-light border-0 small\" aria-label=\"Search\" aria-describedby=\"basic-addon2\" value=\""+n7+"\" disabled>");
            out.println("</div><br>");
            out.println("<div class=\"col-sm-6 mb-3 mb-sm-0\">");
            out.println("Apa konsentrasi atau Peminatan yang anda inginkan? (Software, Networking, Embedded, Multimedia)");
            out.println("<input type=\"text\" name=\"n8\" class=\"form-control bg-light border-0 small\" aria-label=\"Search\" aria-describedby=\"basic-addon2\" value=\""+n8+"\" disabled>");
            out.println("</div><br>");
            out.println("</div>");
            out.println("</form>");
            out.println("</div>");
            out.println("</div>");
            out.println("<footer class=\"sticky-footer bg-white\">");
            out.println("<div class=\"container my-auto\">");
            out.println("<div class=\"copyright text-center my-auto\">");
            out.println("<span>Tugas JPA 2020</span>");
            out.println("</div>");
            out.println("</div>");
            out.println("</footer>");
            out.println("</div>");
            out.println("</div>");
            out.println("<a class=\"scroll-to-top rounded\" href=\"#page-top\">");
            out.println("<i class=\"fas fa-angle-up\"></i>");
            out.println("</a>");
            out.println("<script src=\"vendor/jquery/jquery.min.js\"></script>");
            out.println("<script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>");
            out.println("<script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>");
            out.println("<script src=\"js/sb-admin-2.min.js\"></script>");
            out.println("</body>");
            out.println("</html>");
            
            Context ctx = (Context) new InitialContext().lookup("java:comp/env");
            utx.begin();
            EntityManager em = (EntityManager) ctx.lookup("persistence/LogicalName");
            Query q = em.createNativeQuery("INSERT INTO data (nama, nim, angkatan, matkul_suka, matkul_taksuka, praktikum_suka, praktikum_taksuka, konseentrasi) VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8)");
            q.setParameter(1, n1);
            q.setParameter(2, n2);
            q.setParameter(3, n3);
            q.setParameter(4, n4);
            q.setParameter(5, n5);
            q.setParameter(6, n6);
            q.setParameter(7, n7);
            q.setParameter(8, n8);
            
            List r = q.getResultList();
            utx.commit();
            out.println("Data Tersimpan");
            } 
        catch (Exception e) {
            e.printStackTrace();
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
        processRequest(request, response);
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
