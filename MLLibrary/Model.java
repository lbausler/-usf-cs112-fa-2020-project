import java.util.ArrayList;

public abstract class Model {

  abstract void train(ArrayList<DataPoint> sampleData);
  abstract String test(ArrayList<DataPoint> data);
  abstract Double getAccuracy(ArrayList<DataPoint> data);
  abstract Double getPrecision(ArrayList<DataPoint> data);
}
