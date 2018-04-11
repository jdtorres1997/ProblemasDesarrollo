/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema2;

import cuenta.*;
import tarjetas.*;
import problema1.AdaptadorCuenta;
import problema1.AdaptadorTarjetaCredito;
import problema1.AdaptadorTarjetaDebito;

/**
 *
 * @author krypth
 */
public class MiFachada {
    AdaptadorCuenta adaptadorCuenta;
    AdaptadorTarjetaDebito adaptadorTarjetaD;
    AdaptadorTarjetaCredito adaptadorTarjetaC;
    public MiFachada () {
		
	}
	
	public void llamar (float cantidad, String destino, String operacion, int flag, Cuenta cuenta,TarjetaDebito tarjetaD, TarjetaCredito tarjetaC) {	
	    adaptadorCuenta = new AdaptadorCuenta(cuenta); //Se inicializa el adaptador, pasandole a quien va a adaptar
        adaptadorCuenta.order(destino, cantidad);//Mandar orden al adaptadot
        
        if(flag == 1){
            adaptadorTarjetaD = new AdaptadorTarjetaDebito(tarjetaD);
            adaptadorTarjetaD.order(destino, cantidad);
        }else{
            adaptadorTarjetaC = new AdaptadorTarjetaCredito(tarjetaC);
            adaptadorTarjetaD.order(destino, cantidad);
        }
	}
}
