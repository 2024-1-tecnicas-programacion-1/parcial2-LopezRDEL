package parcial2;

public class Motocicleta extends Vehiculo {
    
   private TipoMotocicleta TipoMotocicleta;

    public Motocicleta() {
    }

    public Motocicleta(TipoMotocicleta TipoMotocicleta) {
        this.TipoMotocicleta = TipoMotocicleta;
    }

    public Motocicleta(String marca, String modelo, int anno, TipoMotocicleta TipoMotocicleta) {
        super(marca, modelo, anno);
        this.TipoMotocicleta = TipoMotocicleta;
    }

    public TipoMotocicleta getTipoMotocicleta() {
        return TipoMotocicleta;
    }

    public void setTipoMotocicleta(TipoMotocicleta TipoMotocicleta) {
        this.TipoMotocicleta = TipoMotocicleta;
    }
    
    
    public void mostrarInfomotocicleta(){
    super.imprimirInformacion();
        System.out.println("El tipo de motocicleta es " + TipoMotocicleta);
    }
   
   
   
}
