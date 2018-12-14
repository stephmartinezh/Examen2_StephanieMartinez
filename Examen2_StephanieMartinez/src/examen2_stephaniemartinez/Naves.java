
package examen2_stephaniemartinez;


public abstract class Naves {
    int serie;
    String planeta;
    double velocidad;

    public Naves() {
    }

    public Naves(int serie, String planeta, double velocidad) {
        this.serie = serie;
        this.planeta = planeta;
        this.velocidad = velocidad;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Naves{" + "serie=" + serie + ", planeta=" + planeta + ", velocidad=" + velocidad + '}';
    }
    
    public abstract double calcularTiempoIda();
    
    public abstract double calcularTiempoVuelta();
}
