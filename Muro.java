import java.util.*;
import java.io.*;
import java.nio.file.*;

/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{
    private ArrayList<Entrada> entradas;
    private File paginaMuro;
    
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        entradas = new ArrayList<>();
        paginaMuro = new File("Muro.html");
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
            if(entrada.getClass().getSimpleName().equals(tipoEntrada) || tipoEntrada == null)
            {
               if(entrada.getUsuario().equals(autor) || autor == null){
                    if(entrada instanceof EntradaTexto)
                    {
                        System.out.println("Usuario: " + autor);
                        ((EntradaTexto)entrada).mostrarDatosExclusivos();
                    }
                    else if(entrada instanceof EntradaFoto)
                    {
                        System.out.println("Usuario: " + autor);
                        ((EntradaFoto)entrada).mostrarDatosExclusivos();
                    }
                    else if(entrada instanceof EntradaUnionAGrupo)
                    {
                       System.out.println("Usuario: " + autor);
                       ((EntradaUnionAGrupo)entrada).mostrarDatosExclusivos();
                    }
                }
            }
        }
    }
    
    public void mostrarMuroEnNavegador()
    {
        Runtime r = Runtime.getRuntime();
        try{
            r.exec("C:/Program Files (x86)/Google/Chrome/Application" + "C:/Users/alumno/Desktop/red-social-hecho-en-clase/Muro.html");
        }
        catch(IOException excepcion){
            System.out.println(excepcion.toString());
        }
    }
    
    public File diseñoPagina()
    {
        Path ruta = Paths.get("C:/Users/alumno/Desktop/red-social-hecho-en-clase/Muro.html");
       
        try{
                BufferedWriter paginaMuro = Files.newBufferedWriter(ruta);
                paginaMuro.write(cabeceraPagina() + muroPagina() + footerPagina());
                paginaMuro.close();
        }
        catch(IOException excepcion){
                System.out.println(excepcion.toString());
        }
    
        
        return paginaMuro;
    }
    
    public String cabeceraPagina()
    {
        String cabecera = "";
        cabecera += "<!DOCTYPE html><html lang=\"es\"><head><title>Barisi</title><body><h1>Barisi</h1>";
        return cabecera;
    }
    
    public String muroPagina()
    {
        String muro = "";
        for(Entrada entrada : entradas){
             muro += "<p>" + entrada + "</p>";
        }
        return muro;
    }
    
    public String footerPagina()
    {
        String footer = "";
        footer += "</body></html>";
        return footer;
    }
}
















