import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.io.IOException;

public class Menu {

    private boolean deviceState = false;;
    JLabel background = new JLabel();
    JButton onOffButton = new JButton();
    JButton plusButton = new JButton();
    JButton minusButton = new JButton();
    JButton selectButton = new JButton();
    JButton menuButton = new JButton();

    JLabel whereTo = new JLabel();
    JLabel tripComputer = new JLabel();
    JLabel map = new JLabel();
    JLabel speech = new JLabel();
    JLabel satellite = new JLabel();
    JLabel about = new JLabel();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new Menu().frame();
            } catch (Exception ex)
            {
                System.out.println(ex);
            }
        });

    }

    public void frame() throws IOException {
        JFrame frame = new JFrame("Menu");
        frame.setSize(370, 635);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        background.setName("background");
        background.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\xtrek_off.png"))));
        background.setBounds(0, 0, 360, 600);
        frame.add(background);



        //Creates the onOffButton
        onOffButton.setIcon(new ImageIcon(this.getClass().getResource("\\images\\onoff.png")));
        onOffButton.setBounds(234, 106, 45, 45);
        //onOffButton.setBorder(null);
        onOffButton.addActionListener(e -> {
            try {
                onOffPressed();

            } catch (Exception ex)
            {
                System.out.println(ex);}
        });
        frame.add(onOffButton);

        //Creates the plusButton
        plusButton.setBounds(10, 60, 30, 55);
        //plusButton.setBorder(null);
        plusButton.addActionListener(e -> plusButtonPressed());
        plusButton.setOpaque(false);
        plusButton.setContentAreaFilled(false);
        frame.add(plusButton);

        //Creates the minusButton
        minusButton.setBounds(10, 115, 30, 55);
        //minusButton.setBorder(null);
        minusButton.addActionListener(e -> minusButtonPressed());
        minusButton.setOpaque(false);
        minusButton.setContentAreaFilled(false);
        frame.add(minusButton);

        //Creates the selectButton
        selectButton.setBounds(10, 190, 30, 65);
        //selectButton.setBorder(null);
        selectButton.addActionListener(e -> selectButtonPressed());
        selectButton.setOpaque(false);
        selectButton.setContentAreaFilled(false);
        frame.add(selectButton);

        //Creates the menuButton
        menuButton.setBounds(320, 70, 30, 65);
        //menuButton.setBorder(null);
        menuButton.addActionListener(e -> menuButtonPressed());
        menuButton.setOpaque(false);
        menuButton.setContentAreaFilled(false);
        frame.add(menuButton);


        //Creates the whereTo image (Default Selected)
        whereTo.setIcon(new ImageIcon(this.getClass().getResource("\\images\\whereTo_selected.png")));
        whereTo.setBounds(87, 224, 90, 72);
        frame.add(whereTo);

        //Creates the tripComputer image
        tripComputer.setIcon(new ImageIcon(this.getClass().getResource("\\images\\tripComputer.png")));
        tripComputer.setBounds(182, 224, 90, 72);
        frame.add(tripComputer);

        //Creates the map image
        map.setIcon(new ImageIcon(this.getClass().getResource("\\images\\map.png")));
        map.setBounds(87, 301, 90, 72);
        frame.add(map);

        //Creates the speech image
        speech.setIcon(new ImageIcon(this.getClass().getResource("\\images\\speech.png")));
        speech.setBounds(182, 301, 90, 72);
        frame.add(speech);

        //Creates the satellite image
        satellite.setIcon(new ImageIcon(this.getClass().getResource("\\images\\satellite.png")));
        satellite.setBounds(87, 378, 90, 72);
        frame.add(satellite);

        //Creates the about image
        about.setIcon(new ImageIcon(this.getClass().getResource("\\images\\about.png")));
        about.setBounds(182, 378, 90, 72);
        frame.add(about);


        plusButton.setEnabled(false);
        minusButton.setEnabled(false);
        selectButton.setEnabled(false);
        menuButton.setEnabled(false);
        frame.setVisible(true);
    }

    public void onOffPressed() throws IOException{
        System.out.println("On Off Pressed");

        //Device is turned off (Turn device on)
        if (deviceState == false) {
            deviceState = true;
            background.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\xtrek_on.png"))));
            plusButton.setEnabled(true);
            minusButton.setEnabled(true);
            selectButton.setEnabled(true);
            menuButton.setEnabled(true);
        }
        //Device is on (Turn device off)
        else {
            deviceState = false;
            background.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\xtrek_off.png"))));
            plusButton.setEnabled(false);
            minusButton.setEnabled(false);
            selectButton.setEnabled(false);
            menuButton.setEnabled(false);
        }

    }

    public void plusButtonPressed(){
        System.out.println("Plus Button Pressed");
    }

    public void minusButtonPressed(){
        System.out.println("Minus Button Pressed");
    }

    public void selectButtonPressed(){
        System.out.println("Select Button Pressed");
    }

    public void menuButtonPressed(){
        System.out.println("Menu Button Pressed");
    }
}
