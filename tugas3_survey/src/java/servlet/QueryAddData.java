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
            Context ctx = (Context) new InitialContext().lookup("java:comp/env");
            utx.begin();
            EntityManager em = (EntityManager) ctx.lookup("persistence/LogicalName");
            Query q = em.createNativeQuery("INSERT INTO DATA (nama, nim, angkatan, matkul_suka, matkul_taksuka, praktikum_suka, praktikum_taksuka, konseentrasi) VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8)");
            q.setParameter(1, n1);
            q.setParameter(2, n2);
            q.setParameter(3, n3);
            q.setParameter(4, n4);
            q.setParameter(5, n5);
            q.setParameter(6, n6);
            q.setParameter(7, n7);
            q.setParameter(8, n8);
            
            //List r = q.getResultList();
            utx.commit();
            out.println("Data Tersimpan");
            } 
        catch (Exception e) {
            e.printStackTrace();
            }
        }
    }
