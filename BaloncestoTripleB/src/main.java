/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author tDev
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Equipo a = new Equipo("a");
        Equipo b = new Equipo("b");
        Equipo c = new Equipo("c");
        Equipo d = new Equipo("d");
        Equipo e = new Equipo("e");
        
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
        
        
        
        System.out.println("Derrotas de a " + a.getPartidosPerdidos());
        System.out.println("Derrotas de b " + b.getPartidosPerdidos());
        System.out.println("Derrotas de c " + c.getPartidosPerdidos());
        System.out.println("Derrotas de d " + d.getPartidosPerdidos());
       
        
       a.verEnfrentamientos();
        System.out.println(torneo.buscarEquipo(torneo.getRaiz(), b));
        System.out.println(torneo.buscarEquipo(torneo.getRaiz(), e));
        torneo.mostrarHistorialTorneo();
        
    }

    
    
    
}
