
public class Enfrentamiento {

    
    private Equipo equipo1;
    private Equipo equipo2;
    private Equipo ganador;
    private Equipo perdedor;

    public Enfrentamiento(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        ganador = null;
        perdedor = null;

    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public Equipo getGanador() {
        return ganador;
    }

    public void setGanador(Equipo ganador) {
        this.ganador = ganador;
    }

    public Equipo getPerdedor() {
        return perdedor;
    }

    public void setPerdedor(Equipo perdedor) {
        this.perdedor = perdedor;
    }

    @Override
    public String toString() {
        String resultado = "Equipo " + equipo1.getNombre() + " vs equipo " + equipo2.getNombre();
        if (ganador != null) {
            resultado += ", ganador= " + ganador.getNombre();
        } else {
            resultado += ", ganador no registrado";
        }
        return resultado;
    }

    public Equipo disputarPartido(Equipo e1, Equipo e2) {
        System.out.println("=========================================");
        System.out.println("            Partido en Curso!           ");
        System.out.println("=========================================");
        System.out.println("  Equipo 1: " + e1.getNombre());
        System.out.println("  Equipo 2: " + e2.getNombre());
        System.out.println("-----------------------------------------");

        int num = (int) ((Math.random() * 10) + 1); // número aleatorio entre 1 y 10

        if (e1.eliminado()) {
            System.out.println("  [ELIMINADO] El equipo " + e1.getNombre() + " está eliminado, no puede jugar.");
            System.out.println("=========================================");
            return null;
        } else if (e2.eliminado()) {
            System.out.println("  [ELIMINADO] El equipo " + e2.getNombre() + " está eliminado, no puede jugar.");
            System.out.println("=========================================");
            return null;
        } else {
            if (num % 2 == 0) {
                System.out.println("  Resultado: GANO EL EQUIPO 1!");
                e2.registrarDerrota();
                ganador = e1;
                perdedor = e2;
            } else {
                System.out.println("  Resultado: GANO EL EQUIPO 2!");
                e1.registrarDerrota();
                ganador = e2;
                perdedor = e1;
            }
        }
        System.out.println("-----------------------------------------");
        System.out.println("  Ganador: " + ganador.getNombre());
        System.out.println("  Perdedor: " + perdedor.getNombre());
        System.out.println("=========================================");

        return ganador;
    }

}
    
    
    

