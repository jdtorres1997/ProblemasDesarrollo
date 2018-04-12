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
    public void transferencias(String target, float amount) {
        System.out.println("Realizando transferencia en cuenta...");
        adaptado.transferir(amount, target);
    }

    @Override
    public void retiros(String target, float amount) {
        System.out.println("Realizando retiro en cuenta...");
        adaptado.retirar(amount, target);
    }

    @Override
    public void consultarSaldo(String target, float amount) {
        System.out.println("Realizando consulta de saldo en cuenta...");
        adaptado.consultarSaldo(amount, target);
    }
    
}
