

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MuroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MuroTest
{
    private Muro muro1;
    private EntradaTexto entradaT1;
    private EntradaFoto entradaF1;
    private EntradaUnionAGrupo entradaU1;

    

    /**
     * Default constructor for test class MuroTest
     */
    public MuroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        muro1 = new Muro();
        entradaT1 = new EntradaTexto("Aitor", "da");
        entradaF1 = new EntradaFoto("Aitor", "http:/7bdjahbD", "vacaciones");
        entradaU1 = new EntradaUnionAGrupo("Aitor", "DAM");
        muro1.addEntrada(entradaT1);
        muro1.addEntrada(entradaF1);
        muro1.addEntrada(entradaU1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testCommit2()
    {
        Muro muro2 = new Muro();
        EntradaUnionAGrupo entradaU3 = new EntradaUnionAGrupo("Aitor", "DAM");
        EntradaUnionAGrupo entradaU4 = new EntradaUnionAGrupo("Carlos", "DAM");
        EntradaTexto entradaT3 = new EntradaTexto("Aitor", "Hola");
        EntradaTexto entradaT4 = new EntradaTexto("Carlos", "Adios");
        EntradaFoto entradaF3 = new EntradaFoto("Aitor", "http://jhabsd", "vacaciones");
        EntradaFoto entradaF4 = new EntradaFoto("Carlos", "http://jhabsd", "vacaciones");
        muro2.addEntrada(entradaU3);
        muro2.addEntrada(entradaU4);
        muro2.addEntrada(entradaT3);
        muro2.addEntrada(entradaT4);
        muro2.addEntrada(entradaF3);
        muro2.addEntrada(entradaF4);
        muro2.mostrarDatosExclusivosEntradasFiltradas("EntradaTexto", "Carlos");
        muro2.mostrarDatosExclusivosEntradasFiltradas("EntradaFoto", "Aitor");
        muro2.mostrarDatosExclusivosEntradasFiltradas("EntradaUnionAGrupo", "Carlos");
    }
}

