import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.*;    // all of the Swing objects
import java.awt.*;       // more windowing components, including Container
import java.io.*;
import javax.swing.JFrame;





public class Driver{
  public static void main(String[] args){
  
    Random rand = new Random(); // creating Random object
    
   /* 
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
      */
    ArrayList<DataPoint> data = new ArrayList<>();
      try (Scanner scanner = new Scanner(new File("C:\\Users\\lbaus\\OneDrive\\Desktop\\CS112\\usf-cs112-fa-2020-project\\MLLibrary\\titanic.csv"));) {
    	  while (scanner.hasNextLine()) {
	    	  List<String> records = getRecordFromLine(scanner.nextLine());
	    	  // TODO: Select the columns from the records and create a DataPoint object
	    	  // TODO: Store the DataPoint object in a collection
	    	  /*if(records.size() == 6) {
	    		  records = getRecordFromLine(scanner.nextLine());
	    	  }
	    	  */
	    	  
	    	  try {
		    	  String label = records.get(1);
		    	  double age = Double.valueOf(records.get(records.size()-2));
		    	  double fare = Double.valueOf(records.get(records.size()-1));
		    	  
		    	  double randNum = rand.nextDouble();
		    	  
		    	  DataPoint dp;
		    	  if (randNum < 0.9) {
		    		// Set the type of DataPoint as “train” and put into the Collection
		    		  dp = new DataPoint(age,fare,label,"train");
	    		  } else {
	    			// Set the type of DataPoint as “test” and put into the Collection
	    			  dp = new DataPoint(age,fare,label,"test");
		    	  }
		    	  data.add(dp);
	    	  }
	    	  catch(NumberFormatException e) {
	    		  System.out.println("empty string error");
	    	  }
    	  }
	  } catch (FileNotFoundException e) {
		  System.out.println("File not found exception reached");
		  return;
	}
    System.out.println(data);
    System.out.println(data.size());

      
    //creating an object called DummyModel inside the main driver class 
      KNNModel kModel = new KNNModel(5);
      kModel.train(data);
      kModel.test(data);
      double accuracy = kModel.getAccuracy(data);
      double precision = kModel.getPrecision(data);
      System.out.println(accuracy + " " + precision);
    // calling method and passing the Array List to the method train which is stored in dModel 
    // clearing data 
     // dModel.train(trainList);
      //System.out.println(trainList.toString());
     // dModel.test(testList);
      //System.out.println(testList.toString());
    
    //  System.out.println(kModel.getMaximums());
      
	// A JFrame is a window.
	    JFrame myFrame = new JFrame();
	//added title
	    myFrame.setTitle("Hey this is Project ");

	// The content pane is the meat of the window -- the window minus
	// any menubars, titlebar, close/minimize/maximize buttons, etc.
  
	    Container contentPane = myFrame.getContentPane();

	// We need to set how we want our content pane to lay out the 
	// objects we add to it.  For now, we'll use a FlowLayout, which
	// places objects left-to-right in a line.  (See the javadocs.)
	    contentPane.setLayout(new GridLayout(5,5));

	    //contentPane.add(new JButton("Test Data" ));
	    //contentPane.add(new JButton("Train Data" + trainList));
	    
	   // contentPane.add(new JButton("train maximum " + dModel.getMaximums()));
	   // contentPane.add(new JButton("Accuracy " + dModel.getAccuracy(trainList)));
	   // contentPane.add(new JButton("Precision "+ dModel.getPrecision(testList)));


	    myFrame.pack();
		myFrame.setVisible(true);
     }
  
  
  	//Helper function to split the line by commas and
	// return the values as a List of String
	private static List<String> getRecordFromLine(String line) {
		
		List<String> values = new ArrayList<String>();
		
		try (Scanner rowScanner = new Scanner(line)) {
			rowScanner.useDelimiter(",");
			//iterator
			while (rowScanner.hasNext()) {
				values.add(rowScanner.next());
			}
		}
		return values;
	
		
	}
	
 
}
