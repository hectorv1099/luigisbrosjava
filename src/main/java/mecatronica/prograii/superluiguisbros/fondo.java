package mecatronica.prograii.superluiguisbros;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class fondo {
    private static final int Y = 0;
    int x = 0;
    int xa = 0;
    int nivel = 1;
    private Juego game;

    public fondo(Juego game) {
        this.game = game;
    }
    public void move() {
        x = x + xa;
    }

    public void paint(Graphics2D g) {
        if (x<-512) {
            x=0;
        }
        switch (nivel){
            case 1:
                try {
                    g.drawImage(ImageIO.read(new File("fondos/bg_hills5.jpg")), x, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    g.drawImage(ImageIO.read(new File("fondos/bg_hills5.jpg")), x+512, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    g.drawImage(ImageIO.read(new File("fondos/bg_hills5.jpg")), x+1024, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (int i = 0; i < 17; i++) {
                    try {
                        g.drawImage(ImageIO.read(new File("fondos/spr_brick_strip4.png")), x+i*64, 410, game);
                    } catch (IOException ex) {
                        Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case 2:
                try {
                    g.drawImage(ImageIO.read(new File("fondos/bg_desert.jpg")), x, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    g.drawImage(ImageIO.read(new File("fondos/bg_desert.jpg")), x+512, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    g.drawImage(ImageIO.read(new File("fondos/bg_desert.jpg")), x+1024, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (int i = 0; i < 17; i++) {
                    try {
                        g.drawImage(ImageIO.read(new File("fondos/spr_brick_strip4.png")), x+i*64, 410, game);
                    } catch (IOException ex) {
                        Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case 3:
                try {
                    g.drawImage(ImageIO.read(new File("fondos/bg_volcan.jpg")), x, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    g.drawImage(ImageIO.read(new File("fondos/bg_volcan.jpg")), x+512, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    g.drawImage(ImageIO.read(new File("fondos/bg_volcan.jpg")), x+1024, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (int i = 0; i < 17; i++) {
                    try {
                        g.drawImage(ImageIO.read(new File("fondos/spr_brick_strip4.png")), x+i*64, 410, game);
                    } catch (IOException ex) {
                        Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case 4:
                try {
                    g.drawImage(ImageIO.read(new File("fondos/fondo ultimo nivel.jpeg")), x, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    g.drawImage(ImageIO.read(new File("fondos/fondo ultimo nivel.jpeg")), x+512, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    g.drawImage(ImageIO.read(new File("fondos/fondo ultimo nivel.jpeg")), x+1024, Y, game);
                } catch (IOException ex) {
                    Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (int i = 0; i < 17; i++) {
                    try {
                        g.drawImage(ImageIO.read(new File("fondos/spr_brick_strip4.png")), x+i*64, 410, game);
                    } catch (IOException ex) {
                        Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
        }
        
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