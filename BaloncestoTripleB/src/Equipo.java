
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



public class Equipo {
    //esta clase representa un equipo con los enfrentamientos que tiene
    private String nombre;
    private int partidosPerdidos;
    private List <Enfrentamiento> enfrentamientos;
    
    
    
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
    System.out.println("=========================================");
    System.out.println("          Historial de Enfrentamientos   ");
    System.out.println("=========================================");
    
    for (Enfrentamiento e : enfrentamientos) {
        System.out.println("-----------------------------------------");
        System.out.println("  Equipo 1: " + e.getEquipo1().getNombre());
        System.out.println("  Equipo 2: " + e.getEquipo2().getNombre());
        if (e.getGanador() != null) {
            System.out.println("  Ganador : " + e.getGanador().getNombre());
        } else {
            System.out.println("  Resultado: Enfrentamiento sin ganador registrado");
        }
        System.out.println("-----------------------------------------");
    }
    
    System.out.println("=========================================");
}


    

    @Override
   public String toString() {
    return "Equipo: " + nombre;
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
