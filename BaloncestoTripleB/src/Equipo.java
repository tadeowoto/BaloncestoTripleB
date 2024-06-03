
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



public class Equipo {
    //esta clase representa un equipo con los enfrentamientos que tiene
    private String nombre;
    private int partidosPerdidos; //agregue esto para verificar cuantas derrotas tiene un equipo, asi mas tarde podemos verificar a que rama mandarlos
    private List <Enfrentamiento> enfrentamientos;
    //los enfrentamientos deberian ser solo 3
    //ver si agregar boolean de la instancia de cada equipo (no creo)
    
    
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.enfrentamientos = new ArrayList<Enfrentamiento>();
        this.partidosPerdidos= 0;
    }
    
    public void registrarDerrota(){
        partidosPerdidos++; 
    }
    
    public boolean ganador(){
        return partidosPerdidos==0;
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

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }
    
    
    public void agregarUnEnfrentamiento(Enfrentamiento e){
        enfrentamientos.add(e);
    }
    
    public void verEnfrentamientos() {
    for (Enfrentamiento e : enfrentamientos) {
        System.out.print("El equipo " + e.getEquipo1().getNombre() + " se enfrentó al equipo " + e.getEquipo2().getNombre());
        if (e.getGanador() != null) {
            System.out.println(" y el ganador fue " + e.getGanador().getNombre());
        } else {
            System.out.println(" y el enfrentamiento no tiene un ganador registrado");
        }
    }
}

    

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", partidosPerdidos=" + partidosPerdidos + ", enfrentamientos=" + enfrentamientos + '}';
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipo other = (Equipo) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }


    
    
    
    
    
    
}
