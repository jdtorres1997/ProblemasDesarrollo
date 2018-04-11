package problema3;

public class TarjetaCreditoFabrica {
    public TarjetaCredito obtenerTarjetaCredito(String tipo){
        if(tipo.equals("oro")){
            TarjetaCredito aux = new TarjetaCreditoOro();
            return aux;
        }else if(tipo.equals("10")){
            TarjetaCredito aux = new TarjetaCredito10();
            return aux;
        }else{
            return null; 
        }
    }
}
