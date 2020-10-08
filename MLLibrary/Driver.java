import java.util.Random;

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
 
  }
 
  public class DummyModel {
    
  }
}
