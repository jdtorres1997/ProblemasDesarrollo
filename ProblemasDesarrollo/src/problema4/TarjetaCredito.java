
package problema4;

public class TarjetaCredito extends Observador{
    private boolean estado;

   public TarjetaCredito(Cuenta cuenta){
      this.cuenta = cuenta;
      this.cuenta.attach(this);
   }

   @Override
    public void actualizar(Boolean nuevoEstado) {
      estado = nuevoEstado;
      if(nuevoEstado.equals(true)){
          System.out.println("Nuevo estado de la tarjeta de credito es activo");
      }else{
          System.out.println("Nuevo estado de la tarjeta de credito es inactivo");
      }
    }
}