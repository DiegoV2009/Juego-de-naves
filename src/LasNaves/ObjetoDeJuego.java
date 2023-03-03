package LasNaves;

import java.awt.Graphics;
import java.awt.Image;
import utilidades.CargadorImagenes;

public class ObjetoDeJuego 
{
   
    protected int x;
    protected int y;
    protected int ancho;
    protected int alto;
    
    public boolean pintarColisionador = false;
    
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    Image sprite;
    Colisionador col;
    public Colisionador getColisionador() 
    {
      
        return col;
    }
    
     boolean ChocaCon(ObjetoDeJuego otro) 
    {
        if(col != null)
        {
            return col.Colisiona(otro.getColisionador());
        }
        return false;
    }
    
   
    /**
     * Constructor del Objeto de juego
     * @param archivo La ruta del archivo donde se encuentra la imagen a cargar
     * @param x La posición en x 
     * @param y La posición en y
     * @param ancho El ancho del objeto
     * @param alto El alto del objeto
     */
    public ObjetoDeJuego(String archivo, int x, int y, int ancho, int alto)
    {        
        
        this(x,y,ancho,alto);
        
        sprite = CargadorImagenes.CargarImagen(archivo);
    }
     /**
     * Constructor del Objeto de juego. No pinta imagen     
     * @param x La posición en x 
     * @param y La posición en y
     * @param ancho El ancho del objeto
     * @param alto El alto del objeto
     */
    public ObjetoDeJuego(int x, int y, int ancho, int alto) 
    {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }
  
    public ObjetoDeJuego()
    {
        this.x = 0;
        this.y = 0;
        this.ancho = 0;
        this.alto = 0; 
    }
    
    
    public void Actualizar()
    {
        
    }
    /**
     * Pinta el objeto de juego
     * @param g el parámetro g es el objeto que sirve para pintar en la pantalla
     */
    public void Pintar(Graphics g)
    {
         g.drawImage(sprite, x, y,ancho, alto, null);
         if(col != null && pintarColisionador)
         {
            col.Pintar(g);
         }
         
    }
    
   
    public void ActivarColisionador()
    {
        col = new Colisionador(this);
    }
    
    public void DesactivarColisonador()
    {
        col = null;
    }
    
     
    
    void MoverA(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    
      
    
    
}
