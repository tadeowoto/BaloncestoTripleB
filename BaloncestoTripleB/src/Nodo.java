

public class Nodo {
    
    
    private Equipo equipo;
    private Nodo ganadores; 
    private Nodo segundasOp; 
    private Nodo eliminados; 
    
    
    public Nodo(){
        
    }
    public Nodo(Equipo equipo) {
        this.equipo = equipo;
        this.ganadores = null;
        this.segundasOp = null;
        this.eliminados = null; 
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
