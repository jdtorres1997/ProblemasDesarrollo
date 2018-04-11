package problema4;

public abstract class Observador {
   protected Cuenta cuenta;
   public abstract void actualizar(Boolean nuevoEstado);
}