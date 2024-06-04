
import java.util.ArrayList;



public class ArbolTernario {
    //se podría guardar los enfrentamientos del torneo en un arraylist aquí
    //Después imprimir final de torneo con campeón
    private Nodo raiz;
    private ArrayList<Enfrentamiento> historial = new ArrayList<Enfrentamiento>();

    public ArbolTernario() {
        Equipo demo = new Equipo("Torneo");
        this.raiz = new Nodo(demo);
    }

    public Nodo getRaiz() {
        return raiz;
    }
    
    
    
    public Nodo insertarNodo(Nodo raiz, Equipo e){ //este metodo va a ser el encargado de mandar los equipos a las ramas
    
        
        if(e.ganador()){
            if(raiz.getGanadores() == null){
                
                raiz.setGanadores(new Nodo(e));
            } else {
                insertarNodo(raiz.getGanadores(), e);    
            }
        
        } else if (e.tieneSegundaOp()){
            if(raiz.getSegundasOp()== null){
                raiz.setSegundasOp(new Nodo(e));
            } else {
                insertarNodo(raiz.getSegundasOp(), e);
            }
        }else if (e.eliminado()){
            if(raiz.getEliminados()== null){
                raiz.setEliminados(new Nodo(e));
                System.out.println("Equipo " + e.getNombre() + " eliminado");
            } else {
                insertarNodo(raiz.getEliminados(), e);
            }
        }
        
        return raiz;    
    }
    
    
    public void jugarPartido(Equipo e1, Equipo e2){
    
        Enfrentamiento partido = new Enfrentamiento(e1,e2);
        partido.disputarPartido(e1, e2);
        insertarNodo(raiz, e1);
        insertarNodo(raiz, e2);
        //jugar el partido de enfrentamiento con el metodo disputar partido y dependiendo de eso 
        //llamar a insertarNodo y en insertarNodo verificar las derrotas y mandarlo a la rama correspondiente    
        e1.agregarUnEnfrentamiento(partido);
        e2.agregarUnEnfrentamiento(partido);
        historial.add(partido);
        if(partido.getGanador() != null){
            System.out.println("Ganador: " + partido.getGanador().getNombre());
            System.out.println("Perdedor: " + partido.getPerdedor().getNombre());
        }
      
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
    
    public void mostrarHistorialTorneo(){
        for (Enfrentamiento enfrentamiento : historial) {
            System.out.println(enfrentamiento.getEquipo1().getNombre() + " vs " + enfrentamiento.getEquipo2().getNombre());
            if(enfrentamiento.getGanador() != null){
                System.out.println("***Ganador***" + enfrentamiento.getGanador().getNombre());
            }
            
        }
    }
    
}
