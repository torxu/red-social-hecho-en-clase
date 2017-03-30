import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;


public class EntradaFoto extends EntradaConComentarios
{
    private String urlImagen;
    private String titulo; 

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
    }
    
    
    public String getUrlImagen()
    {
        return urlImagen;
    }
    
    public String getTituloImagen()
    {
        return titulo;
    }    
   
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();
        cadenaADevolver +=  titulo + "\n" + "</br>";
        cadenaADevolver += urlImagen + "\n" + "</br>";

        return cadenaADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }

    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 6;
    }
    
    public void mostrarDatosExclusivos()
    {        
        System.out.println("URL: " + urlImagen + "\n" + "</br>" + "Titulo: " + titulo + "\n" + "</br>");      
    }
}