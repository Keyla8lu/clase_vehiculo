public class Vehiculo {
    public String marca;
    public String modelo;
    
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void detalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

 

