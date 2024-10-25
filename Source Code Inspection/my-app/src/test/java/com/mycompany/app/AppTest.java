package com.mycompany.app;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void testCriarPapelMoedaValido() {
        PapelMoeda nota = new PapelMoeda(50, 2); 
        
        Assert.assertEquals(50, nota.getValor()); 
        Assert.assertEquals(2, nota.getQuantidade());
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void testeImprimirSaldoInsuficiente() throws SaldoInsuficienteException, PapelMoedaInvalidaException {
        TicketMachine machine = new TicketMachine(20);
        machine.inserir(10);
        machine.imprimir();
    }


}
