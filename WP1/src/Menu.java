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
        frame.setSize(260, 450);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        background.setName("background");
        background.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\xtrek_off.png"))));
        background.setBounds(0, 0, 245, 414);
        frame.add(background);



        //Creates the onOffButton
        onOffButton.setIcon(new ImageIcon(this.getClass().getResource("\\images\\onoff.png")));
        onOffButton.setBounds(157, 72, 35, 35);
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
        plusButton.setBounds(0, 42, 25, 35);
        //plusButton.setBorder(null);
        plusButton.addActionListener(e -> plusButtonPressed());
        plusButton.setOpaque(false);
        plusButton.setContentAreaFilled(false);
        frame.add(plusButton);

        //Creates the minusButton
        minusButton.setBounds(0, 78, 25, 40);
        //minusButton.setBorder(null);
        minusButton.addActionListener(e -> minusButtonPressed());
        minusButton.setOpaque(false);
        minusButton.setContentAreaFilled(false);
        frame.add(minusButton);

        //Creates the selectButton
        selectButton.setBounds(0, 130, 25, 45);
        //selectButton.setBorder(null);
        selectButton.addActionListener(e -> selectButtonPressed());
        selectButton.setOpaque(false);
        selectButton.setContentAreaFilled(false);
        frame.add(selectButton);

        //Creates the menuButton
        menuButton.setBounds(220, 48, 24, 45);
        //menuButton.setBorder(null);
        menuButton.addActionListener(e -> menuButtonPressed());
        menuButton.setOpaque(false);
        menuButton.setContentAreaFilled(false);
        frame.add(menuButton);


        //Creates the whereTo image (Default Selected)
        whereTo.setIcon(new ImageIcon(this.getClass().getResource("\\images\\whereTo_selected.png")));
        whereTo.setBounds(60, 155, 90, 72);
        frame.add(whereTo);

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
