
import java.util.ArrayList;

public class ArbolTernario {

    
    private Nodo raiz;
    private ArrayList<Enfrentamiento> historial = new ArrayList<Enfrentamiento>();

    public ArbolTernario() {
        Equipo demo = new Equipo("Torneo");
        this.raiz = new Nodo(demo);
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public Nodo insertarNodo(Nodo raiz, Equipo e) { 

        if (e.ganador()) {
            if (raiz.getGanadores() == null) {

                raiz.setGanadores(new Nodo(e));
            } else {
                insertarNodo(raiz.getGanadores(), e);
            }

        } else if (e.tieneSegundaOp()) {
            if (raiz.getSegundasOp() == null) {
                raiz.setSegundasOp(new Nodo(e));
            } else {
                insertarNodo(raiz.getSegundasOp(), e);
            }
        } else if (e.eliminado()) {
            if (raiz.getEliminados() == null) {
                raiz.setEliminados(new Nodo(e));
                System.out.println("Equipo " + e.getNombre() + " eliminado");
            } else {
                insertarNodo(raiz.getEliminados(), e);
            }
        }

        return raiz;
    }

    public void jugarPartido(Equipo e1, Equipo e2) {

        Enfrentamiento partido = new Enfrentamiento(e1, e2);
        partido.disputarPartido(e1, e2);
        insertarNodo(raiz, e1);
        insertarNodo(raiz, e2);

        e1.agregarUnEnfrentamiento(partido);
        e2.agregarUnEnfrentamiento(partido);
        historial.add(partido);


    }

    public Equipo buscarEquipo(Nodo raiz, Equipo e) {
        if (raiz == null) {
            return null;
        }

        if (e.equals(raiz.getEquipo())) {
            return raiz.getEquipo();
        }

        Equipo encontrado = buscarEquipo(raiz.getGanadores(), e);
        if (encontrado == null) {
            encontrado = buscarEquipo(raiz.getSegundasOp(), e);
        }
        if (encontrado == null) {
            encontrado = buscarEquipo(raiz.getEliminados(), e);
        }

        return encontrado;
    }

    public void mostrarHistorialTorneo() {

        System.out.println("=========================================");
        System.out.println("       Historial del Torneo              ");
        System.out.println("=========================================");

        if (historial.isEmpty()) {
            System.out.println("No hay enfrentamientos registrados.");
        } else {
            for (Enfrentamiento enfrentamiento : historial) {
                System.out.println("-----------------------------------------");
                System.out.println("Enfrentamiento:");
                System.out.println("  Equipo 1: " + enfrentamiento.getEquipo1().getNombre());
                System.out.println("  Equipo 2: " + enfrentamiento.getEquipo2().getNombre());

                if (enfrentamiento.getGanador() != null) {
                    System.out.println("  ***Ganador: " + enfrentamiento.getGanador().getNombre() + "***");
                    System.out.println("  Perdedor: " + enfrentamiento.getPerdedor().getNombre());
                } else {
                    System.out.println("  Este enfrentamiento no tiene un ganador registrado.");
                }
            }
        }

        System.out.println("=========================================");
    }

    
    public void encontrarGanador(Nodo nodo) {
    if (nodo == null) {
        return;
    }
    
    if (nodo.getGanadores() == null) {
        System.out.println("EL CAMPEON ES *SONIDO DE REDOBLANTES* TRTRTRTRTRTRTRTRTRTRT " + nodo.getEquipo().getNombre());
    } else {
        encontrarGanador(nodo.getGanadores());
    }
}

}
