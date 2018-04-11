/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetas;

/**
 *
 * @author jdtorres
 */
public abstract class TarjetaCredito {

    public abstract void retirar();

    public abstract void ingresar();

    public abstract void pagar();

    public void transferir(float importe, String cuentaDestino) {
        System.out.println("Transferencia realizada en tarjeta");
    }
;
}
