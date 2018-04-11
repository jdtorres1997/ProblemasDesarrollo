package problema4;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(); // creamos el suejto observable
        
        // Creamos objetos que observen a cuenta
        new TarjetaCredito(cuenta);
        new TarjetaDebito(cuenta);
        new Regalo(cuenta);
        
        cuenta.setState(false); // desactivamos la cuenta
        cuenta.setState(true); // activamos la cuenta
        
    }
}
