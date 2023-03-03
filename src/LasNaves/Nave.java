
package LasNaves;

import java.awt.Graphics;
import java.util.ArrayList;



enum Direccion{ninguna,izquierda, derecha};
enum Disparo{ninguno, arriba, abajo};

public class Nave extends ObjetoDeJuego
{
    
    
    ArrayList<Bala> balas = new ArrayList<Bala>();
    ArrayList<Bala> balas2 = new ArrayList<Bala>();
    
     /**
     * Constructor que crea un heroe
     * @param archivo
     * @param x
     * @param y
     * @param ancho
     * @param alto 
     */
    boolean moverDerecha = false;
    Direccion   dir;
    Disparo    disp;
    
    public Nave(String archivo, int x, int y, int ancho, int alto)
    {        
        //Con la palabra super invoca al constructor del padre
        super(archivo, x, y, ancho, alto);
        
       
        
        
    }
    /**
     * Constructor que crea un Heroe
     * @param x
     * @param y
     * @param ancho
     * @param alto 
     */
     public Nave(int x, int y, int ancho, int alto) 
    {
        
        this(null,x,y,ancho, alto);
    }
  
    public void MoverDerecha(int pasos)
    {
        x=x+pasos;
    }
              
    public void MoverIzquierda(int pasos)
    {
        x=x-pasos;
    }
     
    public void MoverAbajo(int pasos)
    {
        y=y+pasos;
    }       
            
      public void MoverArriba(int pasos)
    {
        y=y-pasos;
    }       
            

    
   

   
   
    
    public void Disparar()
    {
        Bala ba = new Bala(x+ancho/2 -12 , y);
        ba.ActivarColisionador();
       balas.add(ba);
      
    }     
    public void DispararAbajo()
    {
        Bala ba2 = new Bala(x+ancho/2 -12 , y+50);
        ba2.ActivarColisionador();
       balas2.add(ba2);
      
    }     
    
    public void Pintar(Graphics g)
    {
        
        super.Pintar(g);
        //Para cada
        //foreach 
        //for  <Tipo a recorrer> <id temporal para cada objeto recorrido>: <ARREGLO>
        for(Bala b: balas)
        {
            b.Pintar(g);
        }
         
        for(Bala b: balas2)
        {
            b.Pintar(g);
        }
        
    }        
    
    public void Actualizar()
    {
        if(dir == Direccion.derecha)
        {
            MoverDerecha(7);
        }    
        if(dir == Direccion.izquierda)
        {
            MoverIzquierda(7);
        }
        if(dir == Direccion.derecha)
        {
            MoverDerecha(7);
        }    
        if(dir == Direccion.izquierda)
        {
            MoverIzquierda(7);
        }
        
        for(Bala b: balas)
        {
            b.Mover();
        }
        
        for(Bala b: balas2)
        {
            b.MoverAbajo();
        }
        
        
    }        

    public boolean ChequearExplosiones(Nave n) 
    {
        //Para cada bala
        //  chequear si choca con enemigo
            //Si choca con enemigo
            //eliminr enemigo
        for(Bala b: balas)
        {
            if(n.ChocaCon(b))
            {
                return true;
            }     
        }
        return false;
    }
  public boolean ChequearExplosiones2(Nave n) 
    {
        //Para cada bala
        //  chequear si choca con enemigo
            //Si choca con enemigo
            //eliminr enemigo
        for(Bala b: balas2)
        {
            if(n.ChocaCon(b))
            {
                return true;
            }     
        }
        return false;
    }
}
