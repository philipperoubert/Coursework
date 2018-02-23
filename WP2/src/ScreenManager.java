import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class ScreenManager extends JFrame {

    private boolean deviceState = false;

    JLabel background = new JLabel();
    JLabel screen = new JLabel();
    JButton onOffButton = new JButton();
    JButton plusButton = new JButton();
    JButton minusButton = new JButton();
    JButton selectButton = new JButton();
    JButton menuButton = new JButton();
    JLabel keyboardA = new JLabel();
    char selected = 'A';
    Screen currentScreen;

    WhereKeyboard mp = new WhereKeyboard();

    public static void main(String[] args) {
        try {
            new ScreenManager().frame();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void frame() throws IOException {
        setSize(370, 635);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        background.setIcon(new ImageIcon(ImageIO.read(new File("images/xtrek_on_template.png"))));
        background.setBounds(0, 0, 360, 600);
        add(background);
        
        screen.setIcon(new ImageIcon(ImageIO.read(new File("images/backgroundAlphabetA.png"))));
        screen.setBounds(86, 114, 269, 452);
        add(screen);

        //Creates the onOffButton
        onOffButton.setIcon(new ImageIcon(ImageIO.read(new File("images/onoff.png"))));
        onOffButton.setBounds(234, 106, 45, 45);
        //onOffButton.setBorder(null);
        onOffButton.addActionListener(e -> {
            try {
                onOffPressed();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        });
        add(onOffButton);

        //Creates the plusButton
        plusButton.setBounds(10, 60, 30, 55);
        //plusButton.setBorder(null);
        plusButton.addActionListener(e -> plusButtonPressed());
        plusButton.setOpaque(false);
        plusButton.setContentAreaFilled(false);
        add(plusButton);

        //Creates the minusButton
        minusButton.setBounds(10, 115, 30, 55);
        //minusButton.setBorder(null);
        minusButton.addActionListener(e -> minusButtonPressed());
        minusButton.setOpaque(false);
        minusButton.setContentAreaFilled(false);
        add(minusButton);

        //Creates the selectButton
        selectButton.setBounds(10, 190, 30, 65);
        //selectButton.setBorder(null);
        selectButton.addActionListener(e -> selectButtonPressed());
        selectButton.setOpaque(false);
        selectButton.setContentAreaFilled(false);
        add(selectButton);

        //Creates the menuButton
        menuButton.setBounds(320, 70, 30, 65);
        //menuButton.setBorder(null);
        menuButton.addActionListener(e -> menuButtonPressed());
        menuButton.setOpaque(false);
        menuButton.setContentAreaFilled(false);
        add(menuButton);

        changeCurrentScreen(mp);

        setVisible(true);
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                repaint();
            }
        });
    }


    public void changeCurrentScreen(Screen next) {
        if (currentScreen != null)
            remove(currentScreen);
        add(next);
        next.setVisible(true);
        currentScreen = next;
    }


    public void onOffPressed() {
        System.out.println("On Off Pressed");
        changeCurrentScreen(mp);
    }

    public void plusButtonPressed() {
    	selected++;
    	if (selected=='\\') selected = ']';
    	if (selected==':') selected = '#';
    	ImageIcon icon = new ImageIcon("images/backgroundAlphabet" + selected + ".png");
    	icon.getImage().flush();
    	screen.setIcon( icon );
    	System.out.println("Plus Button Pressed");
        currentScreen.plus();
    }

    public void minusButtonPressed() {
    	if (selected==']') selected = '\\';
    	if (selected=='#') selected = ':';
    	selected--;
    	ImageIcon icon = new ImageIcon("images/backgroundAlphabet" + selected + ".png");
    	icon.getImage().flush();
    	screen.setIcon( icon );
    	System.out.println("Minus Button Pressed");
        currentScreen.menu();
    }

    public void selectButtonPressed() {
    	System.out.print("Select Button Pressed on Button: ");
    	if (selected=='[') {
    		System.out.println("Space Bar");
    	}else if(selected==']') {
    		selected = 49; //ASCI for 1
        	ImageIcon icon = new ImageIcon("images/backgroundAlphabet" + selected + ".png");
        	icon.getImage().flush();
        	screen.setIcon( icon );;
    	}
    	System.out.println(selected);
        currentScreen.select();
    }

    public void menuButtonPressed() {
        System.out.println("Menu Button Pressed");
        currentScreen.menu();
    }
}