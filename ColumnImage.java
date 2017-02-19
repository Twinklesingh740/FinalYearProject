/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Images;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Administrator
 */
public class ColumnImage {
    public static  void Generate(BufferedImage bi,String heads[],String values[])
    {
       
       
        Graphics g=bi.getGraphics();
      Random rm=new Random();
      int re,gr,bl;
          g.setColor(Color.WHITE);
          Font f=new Font("Arial",Font.BOLD,30);
       
          
   g.drawString("IT-EDU:Auto Generated Image Generation",250,30);
    g.drawLine(50,50,50,400);
    g.drawLine(50,400,350,400);
   
    for(int i=1;i<=10;i++)
               {
    g.drawLine(45,400-(i*30),50,400-(i*30));
    if(i<=9)
           g.drawString(String.valueOf(i*10),30,375-((i-1)*30));
    else       
    g.drawString(String.valueOf(i*10),23,375-((i-1)*30));
               
       }
   
       for(int i=0;i<heads.length;i++)
       {
          
             re=rm.nextInt(255);
      gr=rm.nextInt(255);
      bl=rm.nextInt(255);
       Color c=Color.getHSBColor(re, gr, bl);
       g.setColor(c);
           g.fillRect(60+40*i, 400-Integer.valueOf(values[i])*3, 30, Integer.valueOf(values[i])*3);
      
          g.setColor(Color.WHITE);
           g.drawString(values[i],70+40*i,400-Integer.valueOf(values[i])*3-15);
          
     
           g.drawString(heads[i],105+(40*(i-1)),415);

       }
    }
}
