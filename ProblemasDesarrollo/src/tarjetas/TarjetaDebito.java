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
public abstract class TarjetaDebito {

    String numero;

    public abstract void retirar();

    public abstract void ingresar();

    public abstract void pagar();

    public void transferir(float importe, String cuentaDestino) {
        System.out.println("Transferencia realizada en tarjeta");
    }
    public void retirar(float importe, String cuentaDestino) {
        System.out.println("Retiro realizado en tarjeta");
    }
    public void consultarSaldo(float importe, String cuentaDestino) {
        System.out.println("Consulta del saldo realizada en tarjeta");
    }
;
}
