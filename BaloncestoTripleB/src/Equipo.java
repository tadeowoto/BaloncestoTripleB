
import java.util.List;



public class Equipo {
    //esta clase representa un equipo con los enfrentamientos que tiene
    private String nombre;
    private int partidosPerdidos; //agregue esto para verificar cuantas derrotas tiene un equipo, asi mas tarde podemos verificar a que rama mandarlos
    private List <Enfrentamiento> enfrentamientos;
    //los enfrentamientos deberian ser solo 3
    //ver si agregar boolean de la instancia de cada equipo (no creo)
    
    
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.enfrentamientos = enfrentamientos;
        this.partidosPerdidos= 0;
    }
    
    public void registrarDerrota(){
        partidosPerdidos++; 
    }
    
    public boolean eliminado(){
        return partidosPerdidos>=2;
    }
    public boolean tieneSegundaOp(){
        return partidosPerdidos==1;
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
