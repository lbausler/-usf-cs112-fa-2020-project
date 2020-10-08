
import javax.swing.*;    // all of the Swing objects
import java.awt.*;       // more windowing components, including Container
import java.io.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class projectOne {
    
    /**
     * A static helper function to initialize and show the user interface!
     **/
    private static void initAndShowGUI() {
	// A JFrame is a window.
	JFrame myFrame = new JFrame();
	//added title
	myFrame.setTitle("Hey this is projectOne ");

	// The content pane is the meat of the window -- the window minus
	// any menubars, titlebar, close/minimize/maximize buttons, etc.
  
	Container contentPane = myFrame.getContentPane();

	// We need to set how we want our content pane to lay out the 
	// objects we add to it.  For now, we'll use a FlowLayout, which
	// places objects left-to-right in a line.  (See the javadocs.)
	contentPane.setLayout(new GridLayout(2,2));

	// Now we can add any Swing components we like:
	Point2d point2d = new Point2d(3.14,5.5);
	String str = "Luke";
	Point2dButton p2b = new Point2dButton(str, point2d);
	
	//adding the image 
	
	
	String path = "C:\\Users\\lbaus\\eclipse-workspace\\Assignment 2\\Lab 3 Using Java Swing Library\\src\\Skateboard.jpg";
	Icon icon = new ImageIcon(path);
	
	
	contentPane.add(p2b);
	contentPane.add(new JButton("A Better Button?"));
	contentPane.add(new JButton("3"));
	contentPane.add(new JButton(icon));
	
