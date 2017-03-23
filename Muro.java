import java.util.ArrayList;

/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{
    private ArrayList<Entrada> entradas;
    
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        entradas = new ArrayList<>();
    }

 
    public void addEntrada(Entrada entrada) 
    {
        entradas.add(entrada);
    } 
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        for (Entrada entrada : entradas)
        {
            cadenaADevolver += entrada + "\n";
        }        
        return cadenaADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    public void verCantidadDatosPorEntrada()
    {
        for(Entrada entrada : entradas)
        {
            System.out.println(entrada.getCantidadDeDatosAsociadosALaEntrada());  
        }
    }
    
    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntrada, String autor)
    {
        for(Entrada entrada : entradas)
        {
            if(entrada.getClass().getSimpleName() == tipoEntrada && autor == entrada.getUsuario())
            {
               if(entrada instanceof EntradaTexto)
               {
                   System.out.println("Usuario: " + autor);
                   ((EntradaTexto)entrada).mostrarDatosExclusivos();
               }
               if(entrada instanceof EntradaFoto)
               {
                   System.out.println("Usuario: " + autor);
                   ((EntradaFoto)entrada).mostrarDatosExclusivos();
               }
               if(entrada instanceof EntradaUnionAGrupo)
               {
                   System.out.println("Usuario: " + autor);
                   ((EntradaUnionAGrupo)entrada).mostrarDatosExclusivos();
               }
            }
        }
    }
}
















