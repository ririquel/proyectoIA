package juegoia1;

import java.awt.Graphics;
import javafx.util.Pair;
import javax.swing.JComponent;

public class Escenario extends JComponent implements Constantes {
    
    public Celda[][] celdas;
    public Jugador jugador;
    public Lienzo dondeSeDibuja;
    
    public Escenario(Lienzo lienzo) {
        dondeSeDibuja=lienzo;
        celdas=new Celda[NUMERO_CELDAS_ANCHO][NUMERO_CELDAS_LARGO];
        //inicializar el array de celdas
        for(int i=0; i < NUMERO_CELDAS_ANCHO; i++)
            for ( int j=0 ; j <  NUMERO_CELDAS_LARGO ; j++) 
            celdas[i][j]=new Celda(i+(i*PIXEL_CELDA),j+(j*PIXEL_CELDA),'V');
       
            celdas[5][5].esPared();
            celdas[4][4].esPared();
            celdas[3][3].esPared();
            celdas[3][4].esPared();
            celdas[3][5].esPared();
            celdas[3][6].esPared();
            celdas[3][7].esPared();
            celdas[3][8].esPared();
            //celdas[3][9].esPared();
            //DESTINO
            celdas[9][9].esFinal();
            
            jugador=new Jugador(this); 
            celdas[0][0].tipo='J';
        }
    
    @Override
    public void paintComponent(Graphics g){
        for(int i=0; i < NUMERO_CELDAS_ANCHO ; i++) 
            for ( int j=0 ; j < NUMERO_CELDAS_LARGO; j++) 
                celdas[i][j].paintComponent(g);
        }
    
     public Pair<Integer,Integer> darCeldaTipo(char tipoC) {
         Pair<Integer,Integer> celda=null;
        for(int i=0; i < NUMERO_CELDAS_ANCHO ; i++) 
            for ( int j=0 ; j < NUMERO_CELDAS_LARGO; j++) 
              if ( celdas[i][j].tipo==tipoC ) {
                   celda=new Pair(i,j);
                   break;
               }
        return celda;
    }
}
