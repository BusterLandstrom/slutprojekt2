
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Player {

    GamePanel gp;
    int isset = 0;

    String name;
    int fullStatBaseVal = 40;
    int hp;
    int ac;
    int baseAc;
    int level;
    float xp;

    int strength;
    int endurance;
    int dexterity;
    int stamina;
    int luck;
    int intelligence;

    int pickPocket;
    int bow;
    int shortSW;
    int longSW;
    int smallWP;
    int club;

    JButton b;
    JTextField nameText;

    int carryWeight;
    int carryMaxWeight;

    /**/ //Instantiating the player through constructor
    public Player(GamePanel gp) throws IOException {
        /**/ //Setting all variables same as parent variable
        this.gp = gp;
        /**/
    }
    /**/


    void set(){
        if(isset == 0) {
            gp.add(new JLabel("Name:"));
            b = new JButton("Submit");
            nameText = new JTextField(20);
            gp.add(nameText);
            gp.add(b);
            isset = 1;
        }

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                name = nameText.getText();            }
        });
    }

    void draw(Graphics2D g2d){

    }
}
