/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import cuenta.*;
/**
 *
 * @author jdtorres
 */
public class AdaptadorCuenta implements Adaptador{
    private Cuenta adaptado;
    
    public AdaptadorCuenta(Cuenta cuenta){
        adaptado = cuenta;
    }
    
    @Override
    public void order(String target, float amount) {
       System.out.println("Realizando transferencia en cuenta...");
       adaptado.transferir(amount, target);
    }
    
}
