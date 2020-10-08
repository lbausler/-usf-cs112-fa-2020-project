import java.util.Random;
import javax.swing.*;    // all of the Swing objects
import java.awt.*;       // more windowing components, including Container
import java.io.*;
import javax.swing.JFrame;

public class Driver{
  public static void main(String[] args){
  
    Random rand = new Random(); // creating Random object
    
    DataPoint[] train = new DataPoint[5];
      for (int i =0; i<train.length; i++){
        train[i]=new DataPoint("type_" + i,"label_" + i, rand.nextDouble(), rand.nextDouble());
      }
    
    DataPoint[] test = new DataPoint[5];
      for (int i =0; i<test.length; i++){
        test[i]=new DataPoint("type_" + i,"label_" + i, rand.nextDouble(i*.05), rand.nextDouble(i*1.0));
      }

    
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

	    contentPane.add(new JButton("Test Data" + test));
	    contentPane.add(new JButton("Train Data" + train));
     }
 
  public class DummyModel {
    
  }
}
