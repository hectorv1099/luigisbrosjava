package mecatronica.prograii.superluiguisbros;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class goomba {
    int opcion = 0;
    int c = 0;
    int xa = 0;
    int d = 0;
    int n = 0;
    int p = 0;
    private Juego game;
    int[] x;
    int[] muerto;
    public goomba(Juego game){
        this.game = game;
    }
    public void move() {
        for (int i = 0; i < n; i++) {
            x[i]=x[i]+xa;  
        }
    }
    public void move2(){
        if (p!=10) {
            p++;
        }else{
            p = 0;
            for (int i = 0; i < n; i++) {
                x[i]=x[i]-1;  
            }
        } 
    }
    public void paint(Graphics2D g){
        if (c == 0) {
            switch (opcion){
                case 1 -> {
                    this.n = 4;
                    x = new int[4];
                    muerto = new int[4];
                    for (int i = 0; i < n; i++) {
                        muerto[i] = 0;
                    }
                    x[0]=34*16;x[1]=38*16;x[2]=42*16;x[3]=64*16;
                    c=1;
                    break;
                }
                case 2 -> {
                    this.n = 4;
                    x = new int[4];
                    muerto = new int[4];
                    x[0]=39*16; x[1]=50*16; x[2]=66*16; x[3]=80*16;
                    c=1;
                    break;
                }
                case 3 -> {
                    this.n = 4;
                    x = new int[4];
                    muerto = new int[4];
                    x[0]=26*16;x[1]=40*16;x[2]=63*16;x[3]=92*16;
                    c=1;
                    break;
                }
                case 4 -> {
                    this.n = 3;
                    x = new int[3];
                    muerto = new int[3];
                    x[0]=26*16;x[1]=40*16;x[2]=63*16;
                    c=1;
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (muerto[i] == 0) {
                try {
                    g.drawImage(ImageIO.read(new File("enemigos/6.png")), x[i], 394, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else if (muerto[i] == 1){
                try {
                    g.drawImage(ImageIO.read(new File("enemigos/spr_goomba_sq.png")), x[i], 394, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
                muerto[i] = 2;
            }   
        }
    }
    public int colision(luigui personaje){
        int colision = 0;
        for (int i = 0; i < n; i++) {
            if (personaje.x+16 == this.x[i] && personaje.Y+32>409-16 && personaje.Y<(409) && muerto[i]==0) {
                colision = 2;
            }
            if (personaje.Y+32==409-16 && personaje.x+16>this.x[i] && personaje.x<this.x[i]+16 && muerto[i]==0){
                colision = 1;
                muerto[i]= 1;
            }
            if (personaje.x==this.x[i]+16 && personaje.Y+32>409-16 && personaje.Y<409 && muerto[i]==0){
                colision = 2;
            }
        }
        return colision;
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
}
