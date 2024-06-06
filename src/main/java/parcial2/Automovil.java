package parcial2;

public class Automovil extends Vehiculo {
   
    private int numeroPuertas;
    private TipoCombustible tipoCombustible;

    public Automovil() {
    }

    public Automovil(int numeroPuertas, TipoCombustible tipoCombustible) {
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public Automovil(String marca, String modelo, int anno, int numeroPuertas, TipoCombustible tipoCombustible) {
        super(marca, modelo, anno);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    
    public void mostrarInformacionautomovil(){
    super.imprimirInformacion();
        System.out.println("El numero de puertas es" + numeroPuertas);
        System.out.println("Tipo de combustible" + tipoCombustible);
    
    }
}
