package problema3;

public class TarjetaCreditoOro implements TarjetaCredito{

   @Override
   public void retirar(){
       System.out.println("Se retira desde una tarjeta de credito tipo Oro");
   }
   @Override
   public void ingresar(){
       System.out.println("Se ingresa desde una tarjeta de credito tipo Oro");
   }
   @Override
   public void pagar(){
       System.out.println("Se paga desde una tarjeta de credito tipo Oro");
   }
    
}
