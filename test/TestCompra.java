/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import aplicação2.Calculo;
import aplicação2.CompraModel;
import org.junit.Test;
import junit.framework.TestCase;
import org.junit.Assert;



/**
 *
 * @author ana paula
 */
public class TestCompra extends TestCase  {
    
       Calculo calc;
    CompraModel compraDesc10;
    CompraModel compraDesc1;
    
    @Test
    
    public void teste(){
        
      compraDesc10 = new CompraModel();
      compraDesc1 = new CompraModel();
      calc = new Calculo ();
        
        //CT Idade >65
        
        compraDesc10.setValor(2000);
        compraDesc10.setIdade(70);
        compraDesc10.setDesconto(calc.calcularDesconto(compraDesc10.getValor(),compraDesc10.getIdade()));
        compraDesc10.setTotal(calc.calculartotal(compraDesc10.getValor(),(compraDesc10.getDesconto())));
        
        //CT Idade<65
        
        compraDesc1.setValor(3000);
        compraDesc1.setIdade(20);
        compraDesc1.setDesconto(calc.calcularDesconto(compraDesc1.getValor(), compraDesc1.getIdade()));
        compraDesc1.setTotal(calc.calculartotal(compraDesc1.getValor(), (compraDesc1.getDesconto())));
        
        Assert.assertEquals(1800, compraDesc10.getTotal());
        Assert.assertEquals(2970, compraDesc1.getTotal());
        
        
    
    
    
    
    
    
    }

    
}
