

public class Enfrentamiento {
    
    // la idea es en esta clase registrar un enfrentamiento, es decir, los 2 equipos que se enfrentaron y el ganador y perdedor
    
    private Equipo equipo1;
    private Equipo equipo2;
    private Equipo equipoGanador;
    private Equipo equipoPerdedor;

    public Enfrentamiento(Equipo equipo1, Equipo equipo2, Equipo equipoGanador, Equipo equipoPerdedor) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.equipoGanador = equipoGanador;
        this.equipoPerdedor = equipoPerdedor;
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

    public Equipo getEquipoGanador() {
        return equipoGanador;
    }

    public void setEquipoGanador(Equipo equipoGanador) {
        this.equipoGanador = equipoGanador;
    }

    public Equipo getEquipoPerdedor() {
        return equipoPerdedor;
    }

    public void setEquipoPerdedor(Equipo equipoPerdedor) {
        this.equipoPerdedor = equipoPerdedor;
    }
    
    
    
    
    
    
}
