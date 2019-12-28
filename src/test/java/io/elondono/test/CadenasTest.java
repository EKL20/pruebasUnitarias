package io.elondono.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CadenasTest {
    private Cadenas op;
    @Before
    public void setUp(){
        op= new Cadenas();
    }

    @Test
    public void cadena() {
        String esperado= "Hola Mundo";
        Assert.assertEquals("Error en la cadena de texto", esperado,op.cadena("Hola ","Mundo"));
    }
}