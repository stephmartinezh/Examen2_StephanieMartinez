
package examen2_stephaniemartinez;

import java.util.ArrayList;


public class Nave_Tripulada extends Naves{
    String lugar;
    ArrayList<Astronautas> astronautas = new ArrayList();
    double distancia;

    public Nave_Tripulada() {
        super();
    }

    public Nave_Tripulada(String lugar, double distancia, int serie, String planeta, double velocidad) {
        super(serie, planeta, velocidad);
        this.lugar = lugar;
        this.distancia = distancia;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Astronautas> getAstronautas() {
        return astronautas;
    }

    public void setAstronautas(ArrayList<Astronautas> astronautas) {
        this.astronautas = astronautas;
    }

    @Override
    public String toString() {
        return "Nave_Tripulada{" + "lugar=" + lugar + ", astronautas=" + astronautas + '}';
    }
    
    @Override
    public double calcularTiempoIda() {
        return distancia;///(velocidad*())
    }
    
    @Override
    public double calcularTiempoVuelta() {
        return 9.8;
    }
}
