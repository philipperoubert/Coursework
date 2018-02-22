import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class WhereKeyboard extends Screen {
	private ImageIcon displayImage;
	final TextField      disp   = new TextField();
	
	void plus() {
    	//Next key will be highlighted
    }
    void minus() {
    	//Previous key will be highlighted
    }
    void menu() {
    	
    }
    void select() {
    	//Selects current highlighted key and adds to the address/deletes/changes keyboard type (Alphabet/Numerical)
    }
    void changeCurrentScreen(Screen screen) {
    	//No clue: remeber to ask Dennis about it
    }
    public WhereKeyboard() {
        displayImage = new ImageIcon( "sprites/backgroundAlphabet.png" );
        setLayout( null );
        
        disp.setBounds  (  28,  23, 462, 50 ); add( disp );

        /*
        btn7.setBounds  (  48, 149,  53, 30 ); add( btn7   );
        btn8.setBounds  ( 115, 149,  53, 30 ); add( btn8   );
        btn9.setBounds  ( 183, 149,  53, 30 ); add( btn9   );
        btnCE.setBounds( 252, 149,  53, 30 ); add( btnCE );

        btn4.setBounds  (  48, 188,  53, 30 ); add( btn4   );
        btn5.setBounds  ( 115, 188,  53, 30 ); add( btn5   );
        btn6.setBounds  ( 183, 188,  53, 30 ); add( btn6   );
        btnDIV.setBounds( 252, 188,  53, 30 ); add( btnDIV );

        btn1.setBounds  (  48, 227,  53, 30 ); add( btn1   );
        btn2.setBounds  ( 115, 227,  53, 30 ); add( btn2   );
        btn3.setBounds  ( 183, 227,  53, 30 ); add( btn3   );
        btnMUL.setBounds( 252, 227,  53, 30 ); add( btnMUL );

        btn0.setBounds  (  48, 265,  53, 30 ); add( btn0   );
        btnADD.setBounds( 115, 265,  53, 30 ); add( btnADD );
        btnSUB.setBounds( 185, 265,  53, 30 ); add( btnSUB );
        btnEQL.setBounds( 252, 265,  53, 30 ); add( btnEQL );
      	*/
      }
    public static void main( String[] argv ) {
        JFrame frame = new AdressKeyboard();
        frame.setLocationRelativeTo( null );
        frame.setSize( 530, 820 );
        frame.setResizable( false );
        frame.setVisible( true );
      }
}
