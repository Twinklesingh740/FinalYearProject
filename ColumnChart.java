/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChartServlets;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Images.ColumnImage;
/**
 *
 * @author Administrator
 */
public class ColumnChart extends HttpServlet {

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
        response.setContentType("image/jpeg");
OutputStream os=response.getOutputStream();
       
        BufferedImage bi=new BufferedImage(500, 500,BufferedImage.TYPE_INT_RGB);
      
       String heads[]=request.getParameterValues("headtitle");
       String values[]=request.getParameterValues("headvalue");
       ColumnImage.Generate(bi, heads, values);
//        Graphics g=bi.getGraphics();
//      Random rm=new Random();
//      int re,gr,bl;
//    
//    
//    Font f = new Font("Arial",Font.BOLD,20);
//       for(int i=0;i<heads.length;i++)
//       {
//          
//             re=rm.nextInt(255);
//      gr=rm.nextInt(255);
//      bl=rm.nextInt(255);
//       Color c=Color.getHSBColor(re, gr, bl);
//       g.setColor(c);
//           g.fillRect(40+40*i, 300-Integer.valueOf(values[i])*3, 30, Integer.valueOf(values[i])*3);
//          g.setColor(Color.WHITE);
//           g.drawString(values[i],50+40*i,300-Integer.valueOf(values[i])*3-15);
//           g.drawString(heads[i],50+40*i,315);
//
//       }
        boolean write = ImageIO.write(bi, "jpg", os);
       
       
       

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
