package io.elondono.test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class OperacionesTest {
    private Operaciones op;
    @Before
    public void setup(){
        op= new Operaciones();

    }
    @Test
    public void sumatest(){

        Assert.assertEquals("¡Error en la operación!",11,op.sumar(5,6));
    }
    @Test
    public void podriaHacerRestaTest(){

        Assert.assertEquals("La operación no conluyó de manera satisfactoria.. Valide su código",10,op.restar(30,20),20);
    }
    @Test
    public void podriaHacerMultiplicacionTes(){

        Assert.assertEquals("Error inexperado",6,op.multiplicar(3,2));
    }
    @Test
    public void podriaHacerDivisionTest(){

        Assert.assertEquals("Erroe en la división",8,op.dividir(8,1));
    }
}
