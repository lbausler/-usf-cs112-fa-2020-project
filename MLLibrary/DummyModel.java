import java.util.ArrayList;

public class DummyModel extends Model{

	@Override
	void train(ArrayList<DataPoint> data) {
		System.out.println("Inside train method");
		data.clear();
        data.add(new DataPoint("type_" + 0,"label_" + 0, 3.14, 3.14));

	}

	@Override
	String test(ArrayList<DataPoint> data) {
		System.out.println("Inside test method");
		data.clear();
		return null;
	}

	@Override
	Double getAccuracy(ArrayList<DataPoint> data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Double getPrecision(ArrayList<DataPoint> data) {
		// TODO Auto-generated method stub
		return null;
	}
  
}
