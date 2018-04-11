package problema3;

public class TarjetaCredito10 implements TarjetaCredito{

   @Override
   public void retirar(){
       System.out.println("Se retira desde una tarjeta de credito tipo 10");
   }
   @Override
   public void ingresar(){
       System.out.println("Se ingresa desde una tarjeta de credito tipo 10");
   }
   @Override
   public void pagar(){
       System.out.println("Se paga desde una tarjeta de credito tipo 10");
   }
    
}
