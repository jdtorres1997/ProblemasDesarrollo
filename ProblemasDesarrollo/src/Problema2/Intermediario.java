/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2;

import cuenta.*;
import tarjetas.*;
import problema1.*;

/**
 *
 * @author krypth
 */
public class Intermediario {

    AdaptadorCuenta adaptadorCuenta;
    AdaptadorTarjetaDebito adaptadorTarjetaD;
    AdaptadorTarjetaCredito adaptadorTarjetaC;
    float cantidad;
    String destino;
    String operacion;
    int flag;
    Cuenta cuenta;
    TarjetaDebito tarjetaD;
    TarjetaCredito tarjetaC;

    public Intermediario(float cantidad, String destino, String operacion, int flag, Cuenta cuenta, TarjetaDebito tarjetaD, TarjetaCredito tarjetaC) {
        this.cantidad = cantidad;
        this.destino = destino;
        this.operacion = operacion;
        this.flag = flag;
        this.cuenta = cuenta;
        this.tarjetaD = tarjetaD;
        this.tarjetaC = tarjetaC;
    }

    public void operacion() {
        adaptadorCuenta = new AdaptadorCuenta(cuenta); //Se inicializa el adaptador, pasandole a quien va a adaptar

        switch (operacion) {

            case "transferencia":
                adaptadorCuenta.transferencias(destino, cantidad);//Mandar orden al adaptadot
                if (flag == 1) {
                    adaptadorTarjetaD = new AdaptadorTarjetaDebito(tarjetaD);
                    adaptadorTarjetaD.transferencias(destino, cantidad);
                } else {
                    adaptadorTarjetaC = new AdaptadorTarjetaCredito(tarjetaC);
                    adaptadorTarjetaD.transferencias(destino, cantidad);
                }
                break;
            case "retiro":
                adaptadorCuenta.retiros(destino, cantidad);//Mandar orden al adaptadot
                if (flag == 1) {
                    adaptadorTarjetaD = new AdaptadorTarjetaDebito(tarjetaD);
                    adaptadorTarjetaD.retiros(destino, cantidad);
                } else {
                    adaptadorTarjetaC = new AdaptadorTarjetaCredito(tarjetaC);
                    adaptadorTarjetaD.retiros(destino, cantidad);
                }
                break;
            case "consultarsaldo":
                adaptadorCuenta.consultarSaldo(destino, cantidad);//Mandar orden al adaptadot
                if (flag == 1) {
                    adaptadorTarjetaD = new AdaptadorTarjetaDebito(tarjetaD);
                    adaptadorTarjetaD.consultarSaldo(destino, cantidad);
                } else {
                    adaptadorTarjetaC = new AdaptadorTarjetaCredito(tarjetaC);
                    adaptadorTarjetaD.consultarSaldo(destino, cantidad);
                }
                break;

        }
    }
}
