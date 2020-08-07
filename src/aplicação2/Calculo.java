/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicação2;

/**
 *
 * @author ana paula
 */
public class Calculo {
    
    private int ValorDesconto;
    private int ValorTotal;

  public int calcularDesconto  (int valor, int idade){
    if (idade > 65){
        ValorDesconto = valor*10/100;
    }
    else{
        ValorDesconto =  valor*1/100;
    }
     return ValorDesconto;
    }  
  public int calculartotal (int valor, int desconto){
    ValorTotal = valor-desconto;
    return ValorTotal;
}
}

    

