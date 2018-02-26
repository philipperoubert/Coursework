import java.awt.Color;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AdressKeyboard extends JFrame {
  private static String destination  = "";
  private static String click = "";
  private static String op = "?";
  private ImageIcon displayImage;

  final TextField      disp   = new TextField();
  
  //Alphabet
  final LetterButton    btnA  = new LetterButton   ( "A"  );
  final LetterButton    btnB  = new LetterButton   ( "B"  );
  final LetterButton    btnC  = new LetterButton   ( "C"  );
  final LetterButton    btnD  = new LetterButton   ( "D"  );
  final LetterButton    btnE  = new LetterButton   ( "E"  );
  final LetterButton    btnF  = new LetterButton   ( "F"  );
  final LetterButton    btnG  = new LetterButton   ( "G"  );
  final LetterButton    btnH  = new LetterButton   ( "H"  );
  final LetterButton    btnI  = new LetterButton   ( "I"  );
  final LetterButton    btnJ  = new LetterButton   ( "J"  );
  final LetterButton    btnK  = new LetterButton   ( "K"  );
  final LetterButton    btnL  = new LetterButton   ( "L"  );
  final LetterButton    btnM  = new LetterButton   ( "M"  );
  final LetterButton    btnN  = new LetterButton   ( "N"  );
  final LetterButton    btnO  = new LetterButton   ( "O"  );
  final LetterButton    btnP  = new LetterButton   ( "P"  );
  final LetterButton    btnQ  = new LetterButton   ( "Q"  );
  final LetterButton    btnR  = new LetterButton   ( "R"  );
  final LetterButton    btnS  = new LetterButton   ( "S"  );
  final LetterButton    btnT  = new LetterButton   ( "T"  );
  final LetterButton    btnU  = new LetterButton   ( "U"  );
  final LetterButton    btnV  = new LetterButton   ( "V"  );
  final LetterButton    btnX  = new LetterButton   ( "X"  );
  final LetterButton    btnY  = new LetterButton   ( "Y"  );
  final LetterButton    btnZ  = new LetterButton   ( "Z"  );
  //Alphabet End
  
  /*/Selection Buttons
  final OperatorButton btnPLUS = new OperatorButton( "+" );
  final OperatorButton btnMINUS = new OperatorButton( "-" );
  final OperatorButton btnSELECT = new OperatorButton( "SELECT" );
  //Selection Buttons End
  */
  final OperatorButton btnNUMERAL = new OperatorButton( "NUMERAL" );
  final OperatorButton btnALPHABET = new OperatorButton( "ALPHABET" );
  
 // final ClearButton   btnCE = new ClearButton  ( "CE" );

  private class LetterButton extends JButton {
    LetterButton( String s ) {
      setIcon( new ImageIcon( "keycap" + s + ".png" ) );
      setBorder( null );
     /* addMouseListener( new MouseAdapter() {
          public void mouseClicked( MouseEvent me ) {
            destination = destination + click ;
            disp.setText( "" + destination );
          } */
    	};
    }
  
  private class OperatorButton extends JButton {
    OperatorButton( String s ) {
      setIcon( new ImageIcon( "keycap" + s + ".png" ) );
      setBorder( null );
      addMouseListener( new MouseAdapter() {
          public void mouseClicked( MouseEvent me ) {
        	  displayImage = new ImageIcon( "sprites/backgroundNUMERALS.png" );
        	  setContentPane( new JLabel( displayImage ) );

        	  setLayout( null );
          }
      });
    }
  }

  /*
   * Equals.
   
  private class EqualsButton extends JButton {
    EqualsButton( String s ) {
      setIcon( new ImageIcon( "keycap" + s + ".png" ) );
      setBorder( null );
      addMouseListener( new MouseAdapter() {
          public void mouseClicked( MouseEvent me ) {
            switch ( op ) {
            case "ADD" : d = e + d;  break;
            case "MUL" : d = e * d;  break;
            case "DIV" : d = e / d;  break;
            case "SUB" : d = e - d;  break;
            case "?"   : /*nothing/ break;
            }
            disp.setText( "" + d );
            op = "?";
          }
      } );
    }
  }
  */
	   

  public AdressKeyboard() {
    setTitle( "AdressKeyboard" );
    displayImage = new ImageIcon( "images/backgroundAlphabet.png" );
    setContentPane( new JLabel( displayImage ) );
    setLayout( null );
    
    disp.setBounds  (  28,  23, 462, 50 ); add( disp );
    btnNUMERAL.setBounds  ( 388, 666,  498, 752 ); add( btnNUMERAL );

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
    frame.setSize( 185, 228 );
    frame.setResizable( false );
    frame.setVisible( true );
  }
}
