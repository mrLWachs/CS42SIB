
/** required package class namespace */
package year2018to2019semster2.computerscience30s;

/** required imports */
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 * Graphics1.java - the beginning of making a container (the frame) and 
 * various controls inside of it. This class uses inheritance to inherit
 * the properties and methods from the JFrame class. This means this
 * class is the child (sub-class) of the parent class (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs 
 * @since May 24, 2019 
 */
public class Graphics1 extends JFrame
{
    
    // properties (controls in my container), "global variables"
        
    private JLabel     text;        // labels can be for text, images, or both
    private JLabel     picture;
    private JTextField textbox;     // a text box area
    private JButton    button;      // a command button

    /**
     * Default class constructor, sets class properties
     */
    public Graphics1() {
        setContainer();
        setControls(); 
        setActions();
        // reveal design to user (this should be done last in constructor)
        this.setVisible(true);                          // makes frame visible
    }

    /**
     * Setup the frame's (form) properties:
     */
    private void setContainer() {
        this.setSize(370, 447);                         // set width and height
        this.setTitle("Graphics One");                  // title at the top
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    /**
     * Setup all the controls to go in the container
     */
    private void setControls() {
        // create objects (instantiate the objects)
        text    = new JLabel();
        picture = new JLabel();
        textbox = new JTextField(20);
        button  = new JButton("Exit");
        
        // change any properties we need to
        text.setText("Hello World");
        // with images, I'm will do it in a few steps (could be done in one)        
        String filename = "/computerscience30s/giphy.gif";
        URL url = this.getClass().getResource(filename);
        Icon icon = new ImageIcon(url);
        picture.setIcon(icon);
                
        // set container's layout manager (which how it positions the controls)
        Container container = this.getContentPane();
        container.setLayout(null);          // null means you position yourself
        
        // add the controls to the container        
        container.add(text);
        container.add(picture);
        container.add(textbox);
        container.add(button);
        
        // position all the controls with (x, y, width, height)
        text.setBounds(10, 10, 320, 50);
        picture.setBounds(10, 70, 320, 180);
        textbox.setBounds(10, 290, 320, 50);
        button.setBounds(10, 350, 320, 50);
        
    }

    /**
     * Adds the actions to the various controls
     */
    private void setActions() {
        
        // Action "listener" means it "listens" for specific actions to occur
        
        // create action listener for the click action of the button
        ActionListener buttonClick = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        
        // then add that "listener" to the control
        button.addActionListener(buttonClick);
        
        // create and add the listener in one step for the textbox        
        textbox.addKeyListener( new KeyListener() {
            public void keyTyped(KeyEvent e) {  }
            public void keyPressed(KeyEvent e) {
                text.setText("Code = " + e.getKeyCode());
            }
            public void keyReleased(KeyEvent e) { }
        }  );
                
        // finally create and add the action listener for the picture        
        picture.addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {     }
            public void mouseMoved(MouseEvent e) {
                text.setText("Mouse: " + e.getX() + "," + e.getY());
            }
        });
        
    }
   
}
