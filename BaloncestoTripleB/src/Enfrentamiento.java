

public class Enfrentamiento {
    
    // la idea es en esta clase registrar un enfrentamiento, es decir, los 2 equipos que se enfrentaron y el ganador y perdedor
    
    private Equipo equipo1;
    private Equipo equipo2;

    public Enfrentamiento(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;

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
    
    
    public Equipo disputarPartido(Equipo e1, Equipo e2){
        int num = (int) ((Math.random()*10) +1); //numero aleatorio entre 1 y 10
        
        //basicamente devuelve aleatoriamente el encuentro entre 2 equipos
        
        if (num % 2 == 0) {
            System.out.println("GANO EL EQUIPO 1");
            e2.registrarDerrota();
            return e1;
        }else{
            System.out.println("GANO EL EQUIPO 2");
            e1.registrarDerrota();
            return e2;
        }
        
        
    }
   
}
    
    
    

