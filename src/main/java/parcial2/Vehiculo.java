package parcial2;

public class Vehiculo {
  
    
    private String marca; 
    private String modelo;
    private int anno;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anno) {
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
    }
    
    
    public void mostrarInfovehiculo(){
    
        System.out.println("La marca del vehiculo es " + marca);
        System.out.println("El modelo del vehiculo es " + modelo);
        System.out.println("La año del vehiculo es " + anno);
    }
}
