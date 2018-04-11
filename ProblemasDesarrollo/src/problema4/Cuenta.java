
package problema4;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	
   private List<Observador> observadores = new ArrayList<Observador>();
   private Boolean estado;

   public Boolean getState() {
      return estado;
   }

   public void setState(Boolean nuevoEstado) {
      this.estado = nuevoEstado;
      notifyAllObservers();
   }

   public void attach(Observador observador){
      observadores.add(observador);		
   }

   public void notifyAllObservers(){
      for (Observador observer : observadores) {
         observer.actualizar(estado);
      }
   } 	
}