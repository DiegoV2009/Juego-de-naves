/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LasNaves;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import utilidades.CargadorImagenes;

/**
 *
 * @author Diego Valencia
 */
public class Bala extends ObjetoDeJuego
{
    
    public static Image laBala = null;
    public Bala(int x, int y)
    {
       super(x, y, 20,20);
      
       if(laBala==null)
           laBala = sprite = CargadorImagenes.CargarImagen("src/imagenes/bala1.png");
       else
           sprite = laBala;
       
          
    }    
    
    public Rectangle CalcularRectangulo()
    {
        return new Rectangle(x, y, ancho, alto);
    }
    
    public void Mover()
    {
        y=y-10;
    }        
    
    public void MoverAbajo()
    {
        y=y+10;
    }       
    
   public void Pintar(Graphics g)
   {
       
       super.Pintar(g);
       g.drawRect(x,y,ancho,alto);
       
   }
   
       
}