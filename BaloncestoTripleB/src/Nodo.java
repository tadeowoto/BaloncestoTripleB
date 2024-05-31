

public class Nodo {
    
    
    private Equipo equipo; //valor del nodo, asi el arbol es de equipos
    private Nodo ganadores; //puntero del lado izq, ganadores
    private Nodo segundasOp; //puntero del medio
    private Nodo eliminados; //puntero del lado derecho
    
    
    public Nodo(){
        
    }
    public Nodo(Equipo equipo) {
        this.equipo = equipo;
        this.ganadores = null;
        this.segundasOp = null;
        this.eliminados = null; //las direcciones arrancan en null
    }
    
    
    public Equipo getEquipo() {
        return equipo;
    }
    
    
    public Nodo getGanadores() {
        return ganadores;
    }

    public void setGanadores(Nodo ganadores) {
        this.ganadores = ganadores;
    }

    public Nodo getSegundasOp() {
        return segundasOp;
    }

    public void setSegundasOp(Nodo segundasOp) {
        this.segundasOp = segundasOp;
    }

    public Nodo getEliminados() {
        return eliminados;
    }

    public void setEliminados(Nodo eliminados) {
        this.eliminados = eliminados;
    }

    
    
    
}
