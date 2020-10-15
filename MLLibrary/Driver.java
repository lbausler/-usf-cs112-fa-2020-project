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
    
      for (int i =0; i<3; i++){
    	double f1 = rand.nextDouble();
    	double f2 = rand.nextDouble();
        trainList.add(new DataPoint(f1, f2, "blue", "label"));
      }
      for (int i =0; i<3; i++){
      	double f1 = rand.nextDouble();
      	double f2 = rand.nextDouble();
          trainList.add(new DataPoint(f1, f2, "red", "label"));
        }
    
      ArrayList<DataPoint> testList = new ArrayList<>();
      
      for (int i =0; i<3; i++){
    	double f1 = rand.nextDouble();
    	double f2 = rand.nextDouble();
    	testList.add(new DataPoint(f1, f2, "blue", "label"));
      }
      for (int i =0; i<3; i++){
      	double f1 = rand.nextDouble() ;
      	double f2 = rand.nextDouble() ;
      	testList.add(new DataPoint(f1, f2, "red", "label"));
      }
      
      System.out.println(trainList.toString());
      System.out.println(testList.toString());
    
      
    //creating an object called DummyModel inside the main driver class 
      DummyModel dModel = new DummyModel();
    // calling method and passing the Array List to the method train which is stored in dModel 
    // clearing data 
      dModel.train(trainList);
      //System.out.println(trainList.toString());
      dModel.test(testList);
      //System.out.println(testList.toString());
    
      System.out.println(dModel.getMaximums());
      
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

	    //contentPane.add(new JButton("Test Data" ));
	    //contentPane.add(new JButton("Train Data" + trainList));
	    
	    contentPane.add(new JButton("train maximum " + dModel.getMaximums()));
	    contentPane.add(new JButton("Accuracy " + dModel.getAccuracy(trainList)));
	    contentPane.add(new JButton("Precision "+ dModel.getPrecision(testList)));


	    myFrame.pack();
		myFrame.setVisible(true);
     }
 
}
