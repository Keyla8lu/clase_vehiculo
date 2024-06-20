public class Coche extends Vehiculo {
    private int numPuertas;
    
    public Coche(String marca, String modelo, int numPuertas) {
        super(marca, modelo);  // Llamada al constructor de la clase base Vehiculo
        this.numPuertas = numPuertas;
    }
    
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Número de puertas: " + numPuertas);
    }
}
