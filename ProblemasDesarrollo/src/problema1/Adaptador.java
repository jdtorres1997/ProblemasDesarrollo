/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author jdtorres
 */
interface Adaptador {

    public void transferencias(String target, float amount);

    public void retiros(String target, float amount);

    public void consultarSaldo(String target, float amount);

}
