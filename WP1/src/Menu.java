import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;

public class Menu {

    private boolean deviceState = false;
    private String selectedItem;
    private JLabel background = new JLabel();
    private JButton onOffButton = new JButton();
    private JButton plusButton = new JButton();
    private JButton minusButton = new JButton();
    private JButton selectButton = new JButton();
    private JButton menuButton = new JButton();

    private JLabel whereTo = new JLabel();
    private JLabel tripComputer = new JLabel();
    private JLabel map = new JLabel();
    private JLabel speech = new JLabel();
    private JLabel satellite = new JLabel();
    private JLabel about = new JLabel();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new Menu().frame();
            } catch (Exception ex)
            {
                ex.printStackTrace();
            }
        });

    }

    private void frame() throws IOException {
        JFrame frame = new JFrame("Menu");
        frame.setSize(370, 635);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


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
                ex.printStackTrace();
            }
        });
        frame.add(onOffButton);

        //Creates the plusButton
        plusButton.setBounds(10, 60, 30, 55);
        //plusButton.setBorder(null);
        plusButton.addActionListener(e -> {
            try {
                plusButtonPressed();

            } catch (Exception ex)
            {
                ex.printStackTrace();
            }
        });
        plusButton.setOpaque(false);
        plusButton.setContentAreaFilled(false);
        frame.add(plusButton);

        //Creates the minusButton
        minusButton.setBounds(10, 115, 30, 55);
        //minusButton.setBorder(null);
        minusButton.addActionListener(e -> {
            try {
                minusButtonPressed();

            } catch (Exception ex)
            {
                ex.printStackTrace();
            }
        });
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
        selectedItem = "whereTo";

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

    private void onOffPressed() throws IOException{
        System.out.println("On Off Pressed");

        //Device is turned off (Turn device on)
        if (!deviceState) {
            deviceState = true;
            background.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\xtrek_on.png"))));
            plusButton.setEnabled(true);
            minusButton.setEnabled(true);
            selectButton.setEnabled(true);
        }
        //Device is on (Turn device off)
        else {
            deviceState = false;
            background.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\xtrek_off.png"))));
            plusButton.setEnabled(false);
            minusButton.setEnabled(false);
            selectButton.setEnabled(false);
        }

    }

    private void plusButtonPressed() throws IOException{
        System.out.println("Plus Button Pressed");
        switch (selectedItem) {
            case "whereTo":
            {
                whereTo.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\whereTo.png"))));
                tripComputer.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\tripComputer_selected.png"))));
                selectedItem = "tripComputer";
                break;
            }
            case "tripComputer":
            {
                tripComputer.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\tripComputer.png"))));
                map.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\map_selected.png"))));
                selectedItem = "map";
                break;
            }
            case "map":
            {
                map.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\map.png"))));
                speech.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\speech_selected.png"))));
                selectedItem = "speech";
                break;
            }
            case "speech":
            {
                speech.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\speech.png"))));
                satellite.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\satellite_selected.png"))));
                selectedItem = "satellite";
                break;
            }
            case "satellite":
            {
                satellite.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\satellite.png"))));
                about.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\about_selected.png"))));
                selectedItem = "about";
                break;
            }
            case "about":
            {
                about.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\about.png"))));
                whereTo.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\whereTo_selected.png"))));
                selectedItem = "whereTo";
                break;
            }
        }
    }

    private void minusButtonPressed() throws IOException{
        System.out.println("Minus Button Pressed");

        switch (selectedItem) {
            case "about": {
                about.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\about.png"))));
                satellite.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\satellite_selected.png"))));
                selectedItem = "satellite";
                break;
            }
            case "satellite": {
                satellite.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\satellite.png"))));
                speech.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\speech_selected.png"))));
                selectedItem = "speech";
                break;
            }
            case "speech": {
                speech.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\speech.png"))));
                map.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\map_selected.png"))));
                selectedItem = "map";
                break;
            }
            case "map": {
                map.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\map.png"))));
                tripComputer.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\tripComputer_selected.png"))));
                selectedItem = "tripComputer";
                break;
            }
            case "tripComputer": {
                tripComputer.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\tripComputer.png"))));
                whereTo.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\whereTo_selected.png"))));
                selectedItem = "whereTo";
                break;
            }
            case "whereTo": {
                whereTo.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\whereTo.png"))));
                about.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("\\images\\about_selected.png"))));
                selectedItem = "about";
                break;
            }

        }
    }

    private void selectButtonPressed(){
        switch (selectedItem) {
            case "whereTo": {
                System.out.println("Where To clicked");
                break;
            }
            case "tripComputer": {
                System.out.println("Trip Computer clicked");
                break;
            }
            case "map": {
                System.out.println("Map clicked");
                break;
            }
            case "speech": {
                System.out.println("Speech clicked");
                break;
            }
            case "satellite": {
                System.out.println("Satellite clicked");
                break;
            }
            case "about": {
                System.out.println("About clicked");
                break;
            }
        }
    }

    private void menuButtonPressed(){
        System.out.println("Menu Button Pressed");
    }
}
