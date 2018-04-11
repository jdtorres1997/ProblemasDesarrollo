package problema3;

public class Main {
    public static void main(String[] args) {
        //instanciamos una fabrica de tarjetas de credito
        TarjetaCreditoFabrica fabrica = new TarjetaCreditoFabrica();
        
        // Instanciamos una tarjeta de credito oro, usando la fabrica
        TarjetaCredito uno = fabrica.obtenerTarjetaCredito("oro");
        uno.ingresar();
        uno.pagar();
        uno.retirar();
        
        // Instanciamos una tarjeta de credito 10, usando la fabrica
        TarjetaCredito dos = fabrica.obtenerTarjetaCredito("10");
        dos.ingresar();
        dos.pagar();
        dos.retirar();
    
    }
}
