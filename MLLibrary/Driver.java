import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.*;    // all of the Swing objects
import java.awt.*;       // more windowing components, including Container
import java.io.*;
import javax.swing.JFrame;

public class Driver{
  public static void main(String[] args){
  
    Random rand = new Random(); // creating Random object
    
    ArrayList<DataPoint> trainList = new ArrayList<>();
    
      for (int i =0; i<5; i++){
    	double f1 = rand.nextDouble();
    	double f2 = rand.nextDouble();
        trainList.add(new DataPoint("type_" + i,"label_" + i, f1, f2));
      }
    
      ArrayList<DataPoint> testList = new ArrayList<>();
      
      for (int i =0; i<5; i++){
    	double f1 = rand.nextDouble();
    	double f2 = rand.nextDouble();
        testList.add(new DataPoint("type_" + i,"label_" + i, f1, f2));
      }
      
      System.out.println(trainList.toString());
      System.out.println(testList.toString());
    
      
    //creating an object called DummyModel inside the main driver class 
      DummyModel dModel = new DummyModel();
    // calling method and passing the Array List to the method train which is stored in dModel 
    // clearing data 
      dModel.train(trainList);
      System.out.println(trainList.toString());
      dModel.test(testList);
      System.out.println(testList.toString());
    
      
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
	    contentPane.setLayout(new GridLayout(5,5));

	    contentPane.add(new JButton("Test Data" + testList));
	    contentPane.add(new JButton("Train Data" + trainList));
     }
 
}
