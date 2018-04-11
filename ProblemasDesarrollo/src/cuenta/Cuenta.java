package cuenta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdtorres
 */
abstract class Cuenta {
    
    String entidad, sucursal, numeroCuenta;
    
    public abstract void abrir();
    
    public abstract void llegaRecibo();
    
    public abstract void ingresar();
    
    public abstract void retirar();
}
