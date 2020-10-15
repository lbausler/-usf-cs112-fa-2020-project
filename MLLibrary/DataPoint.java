public class DataPoint {
  private double f1;
  private double f2;
  private String label;
  private String type;
  
  public DataPoint(){
    this.f1 = 0.0;
    this.f2 = 0.0;
  }
  
  public DataPoint(double f1, double f2,String label,String type){
	  
    this.label = label;
	this.type = type;
    this.f1 = f1;
    this.f2 = f2;
  }
  
  
  public void setType(String newType){
    this.type = newType;
  }
  public String getType(){
    return this.type;
  }
  
  
  public void setLabel(String newLabel){
    this.label = newLabel;
  }
  public String getLabel(){
    return this.label;
  }
  
  
  public void setf1(double newF1){
    this.f1 = newF1;
  } 
  public double getF1(){
    return this.f1;
  }
  
  
  public void setf2(double newF2){
    this.f2 = newF2;
  }
  public double getF2(){
    return this.f2;
  }
  
  
  public String toString() {
	  return this.type + " " + this.label + " " + this.f1 + " " + this.f2;
	  
  }
  
  
  
  
  
}
