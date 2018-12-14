
package examen2_stephaniemartinez;


public class Planetas {
    String nombre;
    double temperatura;
    String anillos;
    String superficie;
    double distancia;

    public Planetas() {
    }

    public Planetas(String nombre, double temperatura, String anillos, String superficie, double distancia) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.anillos = anillos;
        this.superficie = superficie;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getAnillos() {
        return anillos;
    }

    public void setAnillos(String anillos) {
        this.anillos = anillos;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Planetas{" + "nombre=" + nombre + ", temperatura=" + temperatura + ", anillos=" + anillos + ", superficie=" + superficie + ", distancia=" + distancia + '}';
    }
    
    
}
