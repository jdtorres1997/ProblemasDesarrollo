/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import tarjetas.*;

/**
 *
 * @author jdtorres
 */
public class AdaptadorTarjetaCredito implements Adaptador {

    TarjetaCredito adaptado;

    public AdaptadorTarjetaCredito(TarjetaCredito tarjeta) {
        adaptado = tarjeta;
    }

    @Override
    public void order(String target, float amount) {
        System.out.println("Realizando transferencia en tarjeta...");
        adaptado.transferir(amount, target);
    }

}
