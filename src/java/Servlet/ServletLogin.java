/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Mapping.DetailEtudiant;
import function.FunctionMahefa;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Mapping.Matiere;
import Mapping.Niveau;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author storm
 */
public class ServletLogin extends HttpServlet {

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
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        String nom = request.getParameter("nom");
        String pass = request.getParameter("password");
        String role = request.getParameter("role");
        
        
        if(role == null) {
            String erreur = "Veuillez compléter toutes les informations";
            request.setAttribute("error", erreur);
            RequestDispatcher dispat = request.getRequestDispatcher("index.jsp");
            dispat.forward(request, response);
        }
        else {
            FunctionMahefa fonction = new FunctionMahefa();
            try {
                Vector<Matiere> liste = fonction.getListeMatiere();
                Vector<Niveau> niveau = fonction.getListeNiveau();
                Vector<DetailEtudiant> etudiant = fonction.getListeEtudiant1();
                request.setAttribute("liste", liste);
                request.setAttribute("niveaux", niveau);
                request.setAttribute("etudiants", etudiant);
            
                String page = fonction.getPageAcceuil(nom, pass, role)+".jsp";
                
                RequestDispatcher dispat = request.getRequestDispatcher(page);
                
                dispat.forward(request, response);
                

            } catch (SQLException ex) {
                String erreur = "Mot de passe ou email invalide";
                request.setAttribute("error", erreur);
                RequestDispatcher dispat = request.getRequestDispatcher("index.jsp");
                dispat.forward(request, response);
            }
                 
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ServletLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ServletLogin.class.getName()).log(Level.SEVERE, null, ex);
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
