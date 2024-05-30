
import java.util.List;



public class Equipo {
    //esta clase representa un equipo con los enfrentamientos que tiene
    private String nombre;
    private List <Enfrentamiento> enfrentamientos;
    //los enfrentamientos deberian ser solo 3
    //ver si agregar boolean de la instancia de cada equipo (no creo)
    
    
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.enfrentamientos = enfrentamientos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Enfrentamiento> getEnfrentamientos() {
        return enfrentamientos;
    }
    
    public void agregarUnEnfrentamiento(Enfrentamiento e){
        enfrentamientos.add(e);
    }
    
}
