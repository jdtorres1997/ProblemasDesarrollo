
package problema4;


public class Regalo extends Observador{
    private boolean estado;

    public Regalo(Cuenta cuenta){
      this.cuenta = cuenta;
      this.cuenta.attach(this);
   }

   @Override
   public void actualizar(Boolean nuevoEstado) {
      estado = nuevoEstado;
      if(nuevoEstado.equals(true)){
          System.out.println("Nuevo estado del regalo es activo");
      }else{
          System.out.println("Nuevo estado del regalo es inactivo");
      }
   }
}