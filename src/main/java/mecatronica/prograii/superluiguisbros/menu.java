package mecatronica.prograii.superluiguisbros;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class menu {
    int opcion = 0;
    private Juego game;
    public menu(Juego game){
        this.game = game;
    }
    public void paint(Graphics2D g){
        try {
            g.drawImage(ImageIO.read(new File("fondos/PANEL.png")), 50, 100, game);
        } catch (IOException ex) {
            Logger.getLogger(fondo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            opcion = 4;
            game.bloques.m = 4;
            game.enemigos.opcion = 4;
            nivelElegido();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            opcion = 2;
            game.bloques.m = 2;
            game.enemigos.opcion = 2;
            nivelElegido();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            opcion = 1;
            game.bloques.m = 1;
            game.enemigos.opcion = 1;
            nivelElegido();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            opcion = 3;
            game.bloques.m = 3;
            game.enemigos.opcion = 3;
            nivelElegido();
        }
    }
    public void nivelElegido(){
        this.game.nivel.nivel = opcion;
    }
}
