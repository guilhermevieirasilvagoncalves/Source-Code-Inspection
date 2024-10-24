package com.mycompany.app;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    

    @Test
    public void shouldAnswerWithTrue()
    {
        //assertTrue( true );
    }

    @Test
    public void getvalorCerto(){

        PapelMoeda papel = new PapelMoeda(10, 5);

        int quantidade = papel.getQuantidade();

        Assert.assertEquals(5, quantidade);

        //assertTrue(true);
    }
}
