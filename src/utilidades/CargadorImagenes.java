/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class CargadorImagenes 
{
    /**
     * carga una imagen dada una ruta
     * @param file recibe el nombre del archivo donde se encuentra el archivo de imagen
     * @return retorna la imagen en un objeto Image
     */
    public static Image CargarImagen(String file)
    {
        Image sprite = null;
        try
        {
            File archivoMapa = new File(file);
            sprite = ImageIO.read(archivoMapa);
        }catch(IOException e)
        {
            System.err.println("Error cargando la imagen: "+e.getMessage());
        }  
        
        return sprite;
    
    }
    
}
