package mecatronica.prograii.superluiguisbros;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;    
import javax.imageio.ImageIO;

public class Bowser {
    int xa = 0;
    int x = 0;
    int y = 409-4*16-18;
    private Juego game;
    public Bowser(Juego game){
        this.game = game;
    }
    public void paint(Graphics2D g){
        switch(game.nivel.nivel){
            case 4:{
                try {
                    g.drawImage(ImageIO.read(new File("enemigos/5.1.png")), 75*16+x, 409-4*16-18, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public void move (){
        x = x+xa;
    }
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            xa = 0;
        }
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            xa = -1;
        }
    }
     public int colision(luigui personaje){
        int colision = 0;
            if (personaje.x+16 == 75*16+x && personaje.Y+32>this.y && personaje.Y<(this.y+16)) {
                colision = 1;
            }
            if (personaje.Y+32==this.y && personaje.x+16>75*16+x && personaje.x<75*16+x+16){
                colision = 1;
            }
            if (personaje.x==75*16+x+16 && personaje.Y+32>409-this.y && personaje.Y<409-this.y+16){
                colision = 1;
            }
            if (personaje.Y==409-this.y+16 && personaje.x+16>75*16+x && personaje.x<75*16+x+16){
                colision = 1;
            }
        return colision;
    }
}
