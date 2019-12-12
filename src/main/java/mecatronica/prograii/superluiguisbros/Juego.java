package mecatronica.prograii.superluiguisbros;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.awt.image.ImageObserver.ABORT;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Juego extends JPanel {
    menu main = new menu(this);
    fondo nivel = new fondo(this);
    goomba enemigos = new goomba(this);
    luigui personaje = new luigui(this);
    ladrillo bloques = new ladrillo(this);
    Bowser jefe = new Bowser(this);

    public Juego() {
	addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                if (main.opcion != 0) {
                    nivel.keyReleased(e);
                    bloques.keyReleased(e);
                    enemigos.keyReleased(e);
                    personaje.keyReleased(e);
                    jefe.keyReleased(e);
                }
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
                if (main.opcion != 0) {
                    nivel.keyPressed(e);
                    bloques.keyPressed(e);
                    personaje.keyPressed(e);
                    enemigos.keyPressed(e);
                    jefe.keyPressed(e);
                }else{
                    main.keyPressed(e);
                }
            }
        });
        setFocusable(true);
    }
    
    private void move() {
        if (personaje.x == (this.getWidth()-16)/2-1) {
            nivel.move();
            bloques.move();
            enemigos.move();
            jefe.move();
        }
        personaje.move();
        enemigos.move2();
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        if (main.opcion != 0) {
            nivel.paint(g2d);
            personaje.paint(g2d);
            bloques.paint(g2d);
            enemigos.paint(g2d);
            jefe.paint(g2d);
        }else{
            main.paint(g2d);
        }
    }
    
    public void gameOver() {
        JOptionPane.showMessageDialog(this, "Game Over", "Game Over", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }
    
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame(" SUPER LUIGUI BROS ULTIMATE 4K NO FAKE 100% REAL ");
        Juego game = new Juego();
        frame.add(game);
        frame.setSize(576 , 464);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while (true) {
            game.move();
            game.repaint();
            Thread.sleep(8);
        }
    }
}

