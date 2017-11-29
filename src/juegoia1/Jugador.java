package juegoia1;

public class Jugador implements Constantes{
    
    public int posicionX;
    public int posicionY;
    public Escenario escenario;
    public BusquedaAnchura inteligencia;
    
    public Jugador(Escenario escenario) {
        posicionX=0;
        posicionY=0;
        this.escenario=escenario;
        inteligencia=new BusquedaAnchura(escenario);
        
    }
    
    public void moverArriba(){
        if (posicionY > 0 ) {
            if ( escenario.celdas[posicionX][posicionY-1].tipo != 'O' ) {  
                escenario.celdas[posicionX][posicionY].tipo='V';
                posicionY=posicionY-1;
                escenario.celdas[posicionX][posicionY].tipo='J';
            }
        }
    }
    
    public void moverAbajo(){
        if (posicionY+1 < NUMERO_CELDAS_LARGO ) {
            if ( escenario.celdas[posicionX][posicionY+1].tipo != 'O' ) {
                escenario.celdas[posicionX][posicionY].tipo='V';
                posicionY=posicionY+1;
                escenario.celdas[posicionX][posicionY].tipo='J'; 
            }
        }
    }
    
    public void moverIzquierda(){
        if (posicionX > 0 ) {
            if ( escenario.celdas[posicionX-1][posicionY].tipo != 'O' ) {  
                escenario.celdas[posicionX][posicionY].tipo='V';
                posicionX=posicionX-1;
                escenario.celdas[posicionX][posicionY].tipo='J'; 
            }
        }
    }
    
    public void moverDerecha(){
        if (posicionX+1 < NUMERO_CELDAS_ANCHO  ) {
            if ( escenario.celdas[posicionX+1][posicionY].tipo != 'O' ) {   
                escenario.celdas[posicionX][posicionY].tipo='V';
                posicionX=posicionX+1;
                escenario.celdas[posicionX][posicionY].tipo='J'; 
            }
        }
    }          
}
//Prueva github