
import javax.swing.*;    // all of the Swing objects
import java.awt.*;       // more windowing components, including Container
import java.io.*;
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
	contentPane.setLayout(new GridLayout(1,1));

	// Now we can add any Swing components we like:
	Point2d point2d = new Point2d(3.14,5.5);
	String str = "Luke";
	Point2dButton p2b = new Point2dButton(str, point2d);
	
	
	contentPane.add(p2b);
	contentPane.add(new JButton("Test Data"));
	contentPane.add(new JButton("Train Data"));
	
	
