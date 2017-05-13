package A5;

public class Variable implements Comparable<Variable>{
	
	private String name;
	private double value;
	private double infoGain;
	private boolean isCont;
	
	public Variable(){
		this.name = "";
		this.value = 0;
		this.infoGain = 0;
	}
	
	public Variable(String name){
		this.name = name;
		this.value = 0;
		this.infoGain = 0;
	}
	
	public Variable(String name, double value){
		this.name = name;
		this.value = value;
		this.infoGain = 0;
	}
	
	public String getName(){return this.name;}
	public double getValue(){ return this.value;}
	public double getInfoGain(){ return this.infoGain;}
	
	public void setName(String name){
		this.name = name;
	}
	public void setValue(double value){
		this.value = value;
	}
	public void setInfoGain(double infoGain){
		this.infoGain = infoGain;
	}
	@Override
	public int compareTo(Variable o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
		
	}
}
