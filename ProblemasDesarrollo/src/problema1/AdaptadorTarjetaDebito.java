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
public class AdaptadorTarjetaDebito implements Adaptador {

    TarjetaDebito adaptado;

    public AdaptadorTarjetaDebito(TarjetaDebito tarjeta) {
        adaptado = tarjeta;
    }


    @Override
    public void transferencias(String target, float amount) {
        System.out.println("Realizando transferencia en la tarjeta...");
        adaptado.transferir(amount, target);
    }

    @Override
    public void retiros(String target, float amount) {
        System.out.println("Realizando retiro en la tarjeta...");
        adaptado.retirar(amount, target);
    }

    @Override
    public void consultarSaldo(String target, float amount) {
        System.out.println("Realizando consulta de saldo en la tarjeta...");
        adaptado.consultarSaldo(amount, target);
    }

}
