/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luz;

/**
 *
 * @author crist
 */
public class Acciones {
    
    String enciende;
    int valor = 1;
    
    public Acciones(){
        this.enciende = enciende;
        this.valor = valor;
    }
    
    public void enciendeLuz(){
        System.out.println("Se encientde la luz = " + valor +".");        
    }
    
}
