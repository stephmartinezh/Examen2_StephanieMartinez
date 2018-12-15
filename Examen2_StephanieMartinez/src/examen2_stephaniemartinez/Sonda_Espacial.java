
package examen2_stephaniemartinez;


public class Sonda_Espacial extends Naves {
    String material;
    double peso;
    double distancia;
    double tiempo;

    public Sonda_Espacial() {
        super();
    }

    public Sonda_Espacial(String material, double peso, double distancia, String serie, String planeta, double velocidad) {
        super(serie, planeta, velocidad);
        this.material = material;
        this.peso = peso;
        this.distancia = distancia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Sonda_Espacial{" + "material=" + material + ", peso=" + peso + '}';
    }

    @Override
    public double calcularTiempoIda() {
        return tiempo = distancia/velocidad;
    }
    
    @Override
    public double calcularTiempoVuelta() {
        return 9.8*tiempo;
    }
}
