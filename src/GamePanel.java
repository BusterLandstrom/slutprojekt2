import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class GamePanel extends javax.swing.JPanel implements ActionListener {

    /**/ //Declaring Timer object as gameTimer
    Timer gameTimer;
    /**/

    Player player;

    /**/ //GamePanel constructor
    public GamePanel() throws IOException {
        player = new Player(this);


        createGround();

        gameTimer = new Timer();
        gameTimer.schedule(new TimerTask() {

            @Override
            public void run() {
                player.set();
                repaint();
            }
        }, 0, 17);

    }

    public void createGround() throws IOException {

    }
    /**/

    /**/ // Function to paint the panel window
    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        player.draw(g2d);


    }
    /**/

    /**/ //Action event handler
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == 27){
            System.exit(1);
        }

    }

    public void keyReleased(KeyEvent e) {

    }
    /**/
}
