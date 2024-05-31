

public class ArbolTernario {
    //se podría guardar los enfrentamientos del torneo en un arraylist aquí
    //Después imprimir final de torneo con campeón
    private Nodo raiz;

    public ArbolTernario() {
        this.raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }
    
    
    
    public Nodo insertarNodo(Nodo raiz, Equipo e){ //este metodo va a ser el encargado de mandar los equipos a las ramas
    
        if (raiz == null) {
            raiz = new Nodo(e); // aca estariamos creando la raiz
            return raiz;
        }
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
        if(partido.getGanador() != null){
            System.out.println("Ganador: " + partido.getGanador().getNombre());
            System.out.println("Perdedor: " + partido.getPerdedor().getNombre());
        }
      
    }
    
    public void buscarEquipo(Nodo raiz, Equipo e) {
    

    System.out.println("Nodo actual: " + raiz.getEquipo().getNombre());

    if (e.equals(raiz.getEquipo())) {
        System.out.println("El equipo " + e.getNombre() + " ha sido encontrado");
        return;
    }

    if (e.getPartidosPerdidos() == 0) {
        System.out.println("Buscando en la rama de ganadores");
        buscarEquipo(raiz.getGanadores(), e);
    } else if (e.getPartidosPerdidos() == 1) {
        System.out.println("Buscando en la rama de segundas oportunidades");
        buscarEquipo(raiz.getSegundasOp(), e);
    } else {
        System.out.println("Buscando en la rama de eliminados");
        buscarEquipo(raiz.getEliminados(), e);
    }
    
    if (raiz == null) {
        System.out.println("No se encontró");
        return;
    }
}
    
}
