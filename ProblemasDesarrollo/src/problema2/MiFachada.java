/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import cuenta.*;
import tarjetas.*;

/**
 *
 * @author krypth
 */
public class MiFachada {

    public MiFachada() {

    }

    public void llamar(float cantidad, String destino, String operacion, int flag, Cuenta cuenta, TarjetaDebito tarjetaD, TarjetaCredito tarjetaC) {
        
        System.out.println("Se usa el intermediario para: " + operacion);
        
        Intermediario intert = new Intermediario(cantidad, destino, operacion, flag, cuenta, tarjetaD, tarjetaC);
        intert.operacion();

    }
}
