
package problema4;

public class TarjetaDebito extends Observador{
    private Boolean estado;

   public TarjetaDebito(Cuenta cuenta){
      this.cuenta = cuenta;
      this.cuenta.attach(this);
   }

   @Override
    public void actualizar(Boolean nuevoEstado) {
       estado = nuevoEstado;
      if(nuevoEstado.equals(true)){
          System.out.println("Nuevo estado de la tarjeta de debido es activo");
      }else{
          System.out.println("Nuevo estado de la tarjeta de debido es inactivo");
      }
   }
}