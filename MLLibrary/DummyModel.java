import java.util.ArrayList;

public class DummyModel extends Model{

  private double maxRedX = 0;
  private double maxRedY = 0;
  private double maxBlueX = 0;
  private double maxBlueY = 0;

  //train the data
 
  
  void train(ArrayList<DataPoint> sampleData) {
    double maxRedX = 0;
    double maxRedY = 0;
    double maxBlueX = 0;
    double maxBlueY = 0;

    for (int i = 0; i < sampleData.size(); i++) {
      if (sampleData.get(i).getLabel() == "red") {
        if (sampleData.get(i).getF1() > maxRedX) {
          maxRedX = sampleData.get(i).getF1();
        }
        if (sampleData.get(i).getF2() > maxRedY) {
          maxRedY = sampleData.get(i).getF2();
        }
      }

      if (sampleData.get(i).getLabel() == "blue") {
        if (sampleData.get(i).getF1() > maxBlueX) {
          maxBlueX = sampleData.get(i).getF1();
        }
        if (sampleData.get(i).getF2() > maxBlueY) {
          maxBlueY = sampleData.get(i).getF2();
        }
      }
    }
    this.maxRedX = maxRedX;
    this.maxRedY = maxRedY;
    this.maxBlueX = maxBlueX;
    this.maxBlueY = maxBlueY;
  }
  
  public String getMaximums() {
	  return this.maxRedX + " " + this.maxRedY + " " +  this.maxBlueX + " " + this.maxBlueY;
	  
	  
  }
  //Test the data
  
  String test(ArrayList<DataPoint> data) {
    DataPoint testData = data.get(0);

    if (Math.abs(testData.getF1() - this.maxRedX) > Math.abs(testData.getF1() - this.maxBlueX)) {
      return "blue";
    }
    else {
      return "red";
    }
  }
  

@Override
Double getAccuracy(ArrayList<DataPoint> data) {
	// TODO Auto-generated method stub
	return (this.maxRedX + this.maxRedY) / 2;
}

@Override
Double getPrecision(ArrayList<DataPoint> data) {
	// TODO Auto-generated method stub
	return (this.maxBlueX + this.maxBlueY) / 2;
}


  
}
