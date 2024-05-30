

public class ArbolTernario {
    
    private Nodo raiz;

    public ArbolTernario(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public Nodo insertarNodo(Nodo raiz, Equipo e){ //este metodo va a ser el encargado de mandar los equipos a las ramas
    
        if (raiz == null) {
            raiz = new Nodo(e); // aca estariamos creando la raiz
            return raiz;
        }
        
        
        //aca deberia tener la logica para poder insertar a la rama dependiendo si es ganador segOp o perdedor
        
        
        
        
        return null;
    
        
    }
    
    
    public void jugarPartido(Equipo e1, Equipo e2){
    
        Enfrentamiento partido = new Enfrentamiento(e1,e2);
        
        //jugar el partido de enfrentamiento con el metodo disputar partido y dependiendo de eso 
        //llamar a insertarNodo y en insertarNodo verificar las derrotas y mandarlo a la rama correspondiente
    
        
    }
    
    
}
