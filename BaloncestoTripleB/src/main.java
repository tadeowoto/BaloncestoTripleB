
public class main {


    public static void main(String[] args) {
        
        Equipo a = new Equipo("Lakers");
        Equipo b = new Equipo("Spurs");
        Equipo c = new Equipo("Denver Nuggets");
        Equipo d = new Equipo("Miami Heat");
        Equipo e = new Equipo("San Lorenzo");
        System.out.println("=========================================");
        System.out.println("            TorneoB en Curso!           ");
        System.out.println("=========================================");
        

        
        ArbolTernario torneo = new ArbolTernario();
        //primera ronda
        torneo.jugarPartido(a, b);
        torneo.jugarPartido(c, d);
        
        //segunda ronda
        torneo.jugarPartido(b, d);
        torneo.jugarPartido(a, c);
        //tercera ronda
        torneo.jugarPartido(b, c);
        torneo.jugarPartido(a, d);
        
        
        
        System.out.println("Derrotas de "+a.getNombre() +" " + a.getPartidosPerdidos());
        System.out.println("Derrotas de "+b.getNombre() +" " + b.getPartidosPerdidos());
        System.out.println("Derrotas de "+c.getNombre()+ " " + c.getPartidosPerdidos());
        System.out.println("Derrotas de "+d.getNombre()+ " " + d.getPartidosPerdidos());
       
        
       a.verEnfrentamientos();
        System.out.println(torneo.buscarEquipo(torneo.getRaiz(), b));
        System.out.println(torneo.buscarEquipo(torneo.getRaiz(), e));
        torneo.mostrarHistorialTorneo();
        
        
        torneo.encontrarGanador(torneo.getRaiz());
        
    }

    
    
    
}
