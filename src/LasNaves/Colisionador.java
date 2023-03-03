
package LasNaves;

import java.awt.Graphics;
import java.awt.Rectangle;


public class Colisionador
{
    
    ObjetoDeJuego objeto;
    
    
    public Colisionador(ObjetoDeJuego objeto)
    {
        
        this.objeto = objeto;
    }   
    
    
    public Rectangle CalcularRectangulo()
    {
        return new Rectangle(objeto.getX(), objeto.getY(), objeto.getAncho(), objeto.getAlto());
    }
    
    
    public boolean Colisiona(Colisionador c)
    {        
        
        Rectangle r = this.CalcularRectangulo();
        Rectangle r2 = c.CalcularRectangulo();
   
        if(r.intersects(r2))
        {    
            return true;
        }
        return false;
    }

    public void Pintar(Graphics g)
    {
        
        g.drawRect(objeto.getX(), objeto.getY(), objeto.getAncho(), objeto.getAlto());
    }
    
    
}
