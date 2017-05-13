package A5;

import java.util.ArrayList;

public class Entropy {
	public static double entropy(ArrayList<Horse> data){
		double setSize = (double)data.size();
		if (data.isEmpty())
			return 0;
		
		double positive = (double)Utility.getHealthy(data);
		double negative = (double)Utility.getColic(data);

		if (positive == 0 || negative == 0 )
			return 0;
		
		ArrayList<Double> distribution = new ArrayList<Double>();
		distribution.add(positive / setSize );
		distribution.add(negative / setSize );
		
		 return calEntropy(distribution);
	}
	
	public static double entropy2(ArrayList<Student> data){
		double setSize = (double)data.size();
		if (data.isEmpty())
			return 0;
		
		double positive = (double)Utility.getPass(data);
		double negative = (double)Utility.getFail(data);

		if (positive == 0 || negative == 0 )
			return 0;
		
		ArrayList<Double> distribution = new ArrayList<Double>();
		distribution.add(positive / setSize );
		distribution.add(negative / setSize );
		
		 return calEntropy(distribution);
	}

	private static double calEntropy(ArrayList<Double> distribution){
		double result = 0;
		for (double child : distribution)
			result += child*(Math.log(child) / Math.log(2));
		
		return result*(-1);
	}

	public static double getRemainder(ArrayList<Horse> data, ArrayList<Horse> setA, ArrayList<Horse> setB) {
		// TODO Auto-generated method stub
		double dataSize = (double) data.size();
		double setASize = (double) setA.size();
		double setBSize = (double) setB.size();
		
		return ((setASize/ dataSize) * entropy(setA)) 
			 + ((setBSize/ dataSize) * entropy(setB));	 
	}

	public static double getGainRatio(ArrayList<Horse> data, ArrayList<Horse> setA, ArrayList<Horse> setB,
			double gain) {
		// TODO Auto-generated method stub
		double dataSize = (double) data.size();
		double setASize = (double) setA.size();
		double setBSize = (double) setB.size();

		ArrayList <Double> dist1 = new ArrayList<Double>();
		dist1.add(setASize / dataSize);
		dist1.add(setBSize / dataSize);
			
		double gainratio  = (gain / calEntropy(dist1));

		return gainratio;
	}
	
	private static double log(double x, int base) {

		return (Math.log10(x) / Math.log10(base));
	}

	public static double getInfoGainAB(ArrayList<Horse> data, ArrayList<Horse> setA, ArrayList<Horse> setB) {
		// TODO Auto-generated method stub
		double dataSize = (double) data.size();
		double setASize = (double) setA.size();
		double setBSize = (double) setB.size();
		
		return ((setASize/ dataSize) * entropy(setA)) 
				 + ((setBSize/ dataSize) * entropy(setB));	 
		
	}

	public static double getRemainder2(ArrayList<Student> trainingSet, ArrayList<Student> setA,
			ArrayList<Student> setB) {
		// TODO Auto-generated method stub
		double dataSize = (double) trainingSet.size();
		double setASize = (double) setA.size();
		double setBSize = (double) setB.size();
		
		return ((setASize/ dataSize) * entropy2(setA)) 
			 + ((setBSize/ dataSize) * entropy2(setB));			
	}

	public static double getGainRatio2(ArrayList<Student> trainingSet, ArrayList<Student> setA, ArrayList<Student> setB,
			double gain) {
		// TODO Auto-generated method stub
		double dataSize = (double) trainingSet.size();
		double setASize = (double) setA.size();
		double setBSize = (double) setB.size();

		ArrayList <Double> dist1 = new ArrayList<Double>();
		dist1.add(setASize / dataSize);
		dist1.add(setBSize / dataSize);
			
		double gainratio  = (gain / calEntropy(dist1));

		return gainratio;	}
}
