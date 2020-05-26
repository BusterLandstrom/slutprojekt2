import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import static java.awt.Toolkit.getDefaultToolkit;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

    /**/ //Main function to initiate all other functions and set base values
    public static void main(String[] args) throws IOException, FontFormatException {
        GameFrame gf = new GameFrame();

        /**/ //Declaring Timer object as gameTimer
        Timer gameTimer;
        /**/

        gameTimer = new Timer();
        gameTimer.schedule(new TimerTask() {

            @Override
            public void run() {
                gf.setSize(1680, 1050);
            }
        }, 0, 17);

        Dimension screenSize = getDefaultToolkit().getScreenSize();
        gf.setLocation((screenSize.width/6 - gf.getSize().width/6), (screenSize.height/6 - gf.getSize().height/6));
        gf.setResizable(false);
        gf.setUndecorated(true);
        gf.setVisible(true);
        gf.setTitle("A Key Quest");
        gf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gf.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    /**/
}
