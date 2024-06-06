
import parcial2.Vehiculo;
import parcial2.Automovil;
import parcial2.Motocicleta;
import parcial2.TipoCombustible;
import parcial2.TipoMotocicleta;
        
        
public class Principal {
    public static void main(String[] args) {
       
        
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Coroya", 2020);
        
       
        Vehiculo vehiculo2 = new Vehiculo();
        Automovil automovil1 = new Automovil();
        
        vehiculo2 = automovil1;
        
        
         
        
     
    }
}
