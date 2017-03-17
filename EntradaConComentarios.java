import java.util.ArrayList;
/**
 * Write a description of class EntradaConComentarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaConComentarios extends Entrada
{
    private ArrayList<String> comentarios;
    

    /**
     * Constructor for objects of class EntradaConComentarios
     */
    public EntradaConComentarios(String autor)
    {
        super(autor);
        comentarios = new ArrayList<>();   
    }
    

    public void addComentario(String texto)
    {
        comentarios.add(texto);        
    } 
    
    
    public ArrayList<String> getComentarios() 
    {
        return comentarios;
    }    

}
