import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;

public class WP4 {

    private boolean deviceState = false;;
    JLabel background = new JLabel();
    JButton onOffButton = new JButton();
    
    JLabel  off = new JLabel();
    JLabel  english = new JLabel();
    JLabel  french = new JLabel();
    JLabel  german = new JLabel();
    JLabel  italian = new JLabel();
    JLabel  spanish = new JLabel();
    
    JLabel  offO = new JLabel();
    JLabel  englishO = new JLabel();
    JLabel  frenchO = new JLabel();
    JLabel  germanO = new JLabel();
    JLabel  italianO = new JLabel();
    JLabel  spanishO = new JLabel();
    
    JButton plusButton = new JButton();
    JButton minusButton = new JButton();
    JButton selectButton = new JButton();
    JButton menuButton = new JButton();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new WP4().frame();
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

        background.setIcon(new ImageIcon(ImageIO.read(this.getClass().getResource("images/xtrek_on_template.png"))));
        background.setBounds(0, 0, 360, 600);
        frame.add(background);



        //Creates the onOffButton
        onOffButton.setIcon(new ImageIcon(this.getClass().getResource("images/onoff.png")));
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
        
        
        int x = 87;
        int y = 224;
        
        int selection = 1;
        
        //Creates the onOffButton
        off.setIcon(new ImageIcon(this.getClass().getResource("images/off.png")));
        off.setBounds(x, y, 185, 38);
        frame.add(off);
 
        english.setIcon(new ImageIcon(this.getClass().getResource("images/english.png")));
        english.setBounds(x, y+(1*38), 185, 38);
        frame.add(english);

        french.setIcon(new ImageIcon(this.getClass().getResource("images/french.png")));
        french.setBounds(x, y+(2*38), 185, 38);
        frame.add(french);

        german.setIcon(new ImageIcon(this.getClass().getResource("images/german.png")));
        german.setBounds(x, y+(3*38), 185, 38);
        frame.add(german);
        
        italian.setIcon(new ImageIcon(this.getClass().getResource("images/italian.png")));
        italian.setBounds(x, y+(4*38), 185, 38);
        frame.add(italian);
        
        spanish.setIcon(new ImageIcon(this.getClass().getResource("images/spanish.png")));
        spanish.setBounds(x, y+(5*38), 185, 38);
        frame.add(spanish);
        
        offO.setIcon(new ImageIcon(this.getClass().getResource("images/offO.png")));
        offO.setBounds(x, y, 185, 38);
        frame.add(offO);
 
        englishO.setIcon(new ImageIcon(this.getClass().getResource("images/englishO.png")));
        englishO.setBounds(x, y+(1*38), 185, 38);
        frame.add(englishO);

        frenchO.setIcon(new ImageIcon(this.getClass().getResource("images/frenchO.png")));
        frenchO.setBounds(x, y+(2*38), 185, 38);
        frame.add(frenchO);

        germanO.setIcon(new ImageIcon(this.getClass().getResource("images/germanO.png")));
        germanO.setBounds(x, y+(3*38), 185, 38);
        frame.add(germanO);
        
        italianO.setIcon(new ImageIcon(this.getClass().getResource("images/italianO.png")));
        italianO.setBounds(x, y+(4*38), 185, 38);
        frame.add(italianO);
        
        spanishO.setIcon(new ImageIcon(this.getClass().getResource("images/spanishO.png")));
        spanishO.setBounds(x, y+(5*38), 185, 38);
        frame.add(spanishO);
   
        
        //Creates the plusButton
        plusButton.setBounds(10, 60, 30, 55);
        //plusButton.setBorder(null);
        plusButton.addActionListener(e -> plusButtonPressed(selection));
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
        
        off.setVisible(false);
        //plusButton.setEnabled(false);
        //minusButton.setEnabled(false);
        //selectButton.setEnabled(false);
        //menuButton.setEnabled(false);
        frame.setVisible(true);
    }

    public void onOffPressed(){
        System.out.println("On Off Pressed");

    }

    public void plusButtonPressed(int selection){
        System.out.println("Plus Button Pressed");
        

        
        if (off.isVisible() == false) {
        	off.setVisible(true);
        	spanish.setVisible(false);
        }
        else if (spanish.isVisible() == false) {
        	spanish.setVisible(true);
        	italian.setVisible(false);
        }
        else if(italian.isVisible() == false) {
        	italian.setVisible(true);
        	german.setVisible(false);
        }
        else if(german.isVisible() == false) {
        	german.setVisible(true);
        	french.setVisible(false);
        }
        else if(french.isVisible() == false) {
        	french.setVisible(true);
        	english.setVisible(false);
        }
        else {
        	english.setVisible(true);
        	off.setVisible(false);
        }

    }

    public void minusButtonPressed(){
        System.out.println("Minus Button Pressed");
        
        if (off.isVisible() == false) {
        	off.setVisible(true);
        	english.setVisible(false);
        }
        else if (english.isVisible() == false) {
        	english.setVisible(true);
        	french.setVisible(false);
        }
        else if(french.isVisible() == false) {
        	french.setVisible(true);
        	german.setVisible(false);
        }
        else if(german.isVisible() == false) {
        	german.setVisible(true);
        	italian.setVisible(false);
        }
        else if(italian.isVisible() == false) {
        	italian.setVisible(true);
        	spanish.setVisible(false);
        }
        else {
        	off.setVisible(false);
        	spanish.setVisible(true);
        }

        
    }

    public void selectButtonPressed(){
        System.out.println("Select Button Pressed");
    }

    public void menuButtonPressed(){
        System.out.println("Menu Button Pressed");
    }
}
