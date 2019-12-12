package mecatronica.prograii.superluiguisbros;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;    
import javax.imageio.ImageIO;

public class luigui {
    int Y = 378;
    int YO = 378;
    int YT = 378;
    private static final int WIDTH = 16;
    int x = 0;
    int xa = 0;
    int xb = 0;
    int paso = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    boolean saltando=false;
    private Juego game;

    public luigui(Juego game) {
	this.game = game;
    }

    public void move() {
        c = game.bloques.colision(game.personaje);
        d = game.enemigos.colision(game.personaje);
        e = game.enemigos.colision(game.personaje);
        if (d == 2 || e == 1) {
            game.gameOver();
        }
        if (c!=1 && x + xa < (game.getWidth() - WIDTH)/2) {
            x = x + xa;
        }
        if (c!=3 && xb != 0 && x + xb >0) {
            x = x + xb;
        }
        if (saltando == true) {
            if (Y>YT-90) {
                Y = Y - 1;
            }else{
                saltando = false;
            }
        }
        if (c == 4) {
            saltando = false;
        }
        if (c==2 && saltando == false) {
            YO = game.personaje.Y;
        }else{
            YO=378;
        }
        if (Y!=YO && saltando == false) {
                Y = Y + 1;
        }
    }

    public void paint(Graphics2D g) {
        if (paso != 0 && saltando == false && Y==YO) {
            if (xa!=0 && xb==0) {
                switch (paso) {
                    case 1,2,3,4 -> {
                        try {
                            g.drawImage(ImageIO.read(new File("luigi/2.png")), x, Y, game);
                        } catch (IOException ex) {
                            Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            paso++;
                    }
                    case 5,6,7,8 -> {
                        try {
                            g.drawImage(ImageIO.read(new File("luigi/3.png")), x, Y, game);
                        } catch (IOException ex) {
                            Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        paso++;
                    }
                    case 9,10,11,12 -> {
                        try {
                            g.drawImage(ImageIO.read(new File("luigi/4.png")), x, Y, game);
                        } catch (IOException ex) {
                            Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        paso++;
                        if (paso == 13) {
                            paso = 1;
                        }
                    }
                }
            }
            if(xa == 0 && xb != 0){
                switch (paso) {
                    case 1,2,3,4 -> {
                        try {
                            g.drawImage(ImageIO.read(new File("luigi/2.1.png")), x, Y, game);
                        } catch (IOException ex) {
                            Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            paso++;
                    }
                    case 5,6,7,8 -> {
                        try {
                            g.drawImage(ImageIO.read(new File("luigi/3.1.png")), x, Y, game);
                        } catch (IOException ex) {
                            Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        paso++;
                    }
                    case 9,10,11,12 -> {
                        try {
                            g.drawImage(ImageIO.read(new File("luigi/4.1.png")), x, Y, game);
                        } catch (IOException ex) {
                            Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        paso++;
                        if (paso == 13) {
                            paso = 1;
                        }
                    }
                }
            }
            if (xa != 0 && xb != 0) {
                try {
                    g.drawImage(ImageIO.read(new File("luigi/1.png")), x, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            if (saltando == false && Y==YO) {
                try {
                    g.drawImage(ImageIO.read(new File("luigi/1.png")), x, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try {
                    g.drawImage(ImageIO.read(new File("luigi/spr_mario_big_jump.png")), x, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            xb = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            xa = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP){
            saltando = false;
        }
        if (xa == 0 && xb == 0) {
            paso = 0;
        }
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            xb = -1;
            if (paso == 0) {
                 paso = 1;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            xa = 1;
            if (paso == 0) {
                 paso = 1;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (Y==YO) {
                saltando = true;
                YT=Y;
            }
        }
    }
}
