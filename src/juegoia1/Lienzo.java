package juegoia1;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Timer;

public class Lienzo extends Component implements Constantes{
    
    public Escenario escenario;
    public Timer lanzadorTareas;
   
    public Lienzo() {
        
        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                for(int i=0; i < 10; i++) escenario.celdas[9][i].tipo='V';
                escenario.celdas[9][numeroAleatorio(0,9)].esFinal();
            }
        });
         
        escenario=new Escenario(this);
        lanzadorTareas=new Timer();
        lanzadorTareas.scheduleAtFixedRate(escenario.jugador.inteligencia,0,1000);
    }
    
    @Override
    public void paint(Graphics g) {
        escenario.paintComponent(g); 
    }
  
}
