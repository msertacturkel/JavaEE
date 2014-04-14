/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.csystem.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.csystem.ejb.NewsEntity;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "MesajOlustur", urlPatterns = {"/MesajOlustur"})
public class MesajOlustur extends HttpServlet {

    @Resource(mappedName = "jms/msg")
    private Queue msg;
    @Resource(mappedName = "jms/msgFactory")
    private ConnectionFactory msgFactory;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            NewsEntity e = new NewsEntity();
            String title = "deneme";
            String body = "deneme deneme";
            e.setTitle(title);
            e.setBody(body);
            sendJMSMessageToMsg(e);
            response.sendRedirect("MesajOku");
        } catch (JMSException ex) {
            Logger.getLogger(MesajOlustur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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

    private Message createJMSMessageForjmsMsg(Session session, Object messageData) throws JMSException {
        ObjectMessage message = session.createObjectMessage();
        message.setObject((Serializable) messageData);
        return message;

    }

    private void sendJMSMessageToMsg(Object messageData) throws JMSException {
        Connection connection = null;
        Session session = null;
        try {
            connection = msgFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(msg);
            messageProducer.send(createJMSMessageForjmsMsg(session, messageData));
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (JMSException e) {
                    Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Cannot close session", e);
                }
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
