package A5;

import java.util.ArrayList;
import java.util.LinkedHashMap;


public class Tree {
	
	public Node buildTree(ArrayList<Horse> trainingSet, ArrayList<Variable> variableSets) {
		// if training set is empty, return root
		if (trainingSet.isEmpty())
			return new Node("Empty training data");
			
		
		//check if all have same classification
		boolean same = true;
		for (int i = 1; i < trainingSet.size();i++){
			if (trainingSet.get(i-1).getIsHealthy() != trainingSet.get(i).getIsHealthy()){
				same = false;
				break;
			}
		}
		if (same){
			Node sameLabel = new Node("End");
			sameLabel.addValue(""+trainingSet.get(0).getIsHealthy());
			return sameLabel;
		}
		
		
		if(variableSets.isEmpty()){
			int positive = Utility.getHealthy(trainingSet);
			int negative = Utility.getColic(trainingSet);
			
			Node majority = new Node("End");
			if (positive < negative)
				majority.addValue("false");
			else
				majority.addValue("true");
			return majority;
		}
		
		double entropyData = Entropy.entropy(trainingSet);
		LinkedHashMap<Variable, Double> dataMap = new LinkedHashMap<>();
		for (Variable child : variableSets){
			String target = child.getName();
			trainingSet = Utility.sortVariable(trainingSet, target);
			
			double bestGain = -99999;
			double bestPos = -99999;
		
			// finding threshold
			for (int i = 1; i < trainingSet.size(); i++) {
				Variable object1 = trainingSet.get(i).getVar(target);
				Variable object2 = trainingSet.get(i-1).getVar(target);
				
				if (object1.getValue() != object2.getValue()){
					double between = (object1.getValue() + object2.getValue()) / 2;
					
					// Partition training set
					ArrayList<Horse> setA = partition(trainingSet, target, between, true);
					ArrayList<Horse> setB = partition(trainingSet, target, between, false);
			
					double remainder = Entropy.getRemainder(trainingSet, setA, setB);
					double gain = entropyData - remainder;
					double gainRatio = Entropy.getGainRatio(trainingSet, setA, setB, gain);
					if (gainRatio > bestGain){
						bestGain = gainRatio;
						bestPos = between;
					}
				}
			}
			child.setInfoGain(bestGain);
			dataMap.put(child, bestPos);
			

		}
		double bestGain =-1;
		Variable variablePartioned = null;
		for (Variable child : dataMap.keySet()){
			if (child.getInfoGain() > bestGain){
				bestGain = child.getInfoGain();
				variablePartioned = child;
			}
		}
		ArrayList<Horse> setA = partition(trainingSet, variablePartioned.getName(), dataMap.get(variablePartioned), true);
		ArrayList<Horse> setB = partition(trainingSet, variablePartioned.getName(), dataMap.get(variablePartioned), false);
		
		Node root = new Node(variablePartioned.getName());
		
		root.addValue(">=" + dataMap.get(variablePartioned));
		root.addValue("<" + dataMap.get(variablePartioned));
		root.addChild(buildTree(setA, variableSets));
		root.addChild(buildTree(setB, variableSets));
		return root;
	}

	private ArrayList<Horse> partition(ArrayList<Horse> trainingSet, String target, double between, boolean checker) {
		// TODO Auto-generated method stub
		ArrayList<Horse> partitionSet = new ArrayList<Horse>();
		for (Horse child : trainingSet){
			if (checker && child.getVar(target).getValue() > between)
				partitionSet.add(child);
			if (!checker && child.getVar(target).getValue() <= between)
				partitionSet.add(child);
		}
		return partitionSet;
	}
	
	private ArrayList<Student> partition2(ArrayList<Student> trainingSet, String target, double between, boolean checker) {
		// TODO Auto-generated method stub
		ArrayList<Student> partitionSet = new ArrayList<Student>();
		for (Student child : trainingSet){
			if (checker && child.getVar(target).getValue() > between)
				partitionSet.add(child);
			if (!checker && child.getVar(target).getValue() <= between)
				partitionSet.add(child);
		}
		return partitionSet;
	}

	public Node buildTree2(ArrayList<Student> trainingSet, ArrayList<Variable> variableSets) {
		// TODO Auto-generated method stub
		// check trainingset is empty, if true, return fail.
		if (trainingSet.isEmpty())
			return new Node("Empty training data");
		
		//check if all have same classification
		boolean same = true;
		for (int i = 1; i < trainingSet.size();i++){
			if (trainingSet.get(i-1).getPass() != trainingSet.get(i).getPass()){
				same = false;
				break;
			}
		}
		
		if (same){
			Node sameLabel = new Node("End");
			sameLabel.addValue(""+trainingSet.get(0).getPass());
			return sameLabel;
		}
		
		// check if which side contain more True or False
		if(variableSets.isEmpty()){
			int positive = Utility.getPass(trainingSet);
			int negative = Utility.getFail(trainingSet);
			
			Node majority = new Node("End");
			if (positive < negative)
				majority.addValue("false");
			else
				majority.addValue("true");
			return majority;
		}

		double entropyData = Entropy.entropy2(trainingSet);
		LinkedHashMap<Variable, Double> dataMap = new LinkedHashMap<>();
		
		for (Variable child : variableSets){
			String target = child.getName();
			trainingSet = Utility.sortVariable2(trainingSet, target);
			
			double bestGain = -99999;
			double bestPos = -99999;
			boolean check = false;
			// finding threshold
			for (int i = 1; i < trainingSet.size(); i++){
				Variable object1 = trainingSet.get(i).getVar(target);
				Variable object2 = trainingSet.get(i-1).getVar(target);
				
				if (object1.getValue() != object2.getValue()){
					double between = (object1.getValue() + object2.getValue()) / 2;
					
					// Partition training set
					ArrayList<Student> setA = partition2(trainingSet, target, between, true);
					ArrayList<Student> setB = partition2(trainingSet, target, between, false);
			
					double remainder = Entropy.getRemainder2(trainingSet, setA, setB);
					double gain = entropyData - remainder;
					double gainRatio = Entropy.getGainRatio2(trainingSet, setA, setB, gain);
					if (gainRatio > bestGain){
						bestGain = gainRatio;
						bestPos = between;
						check = true;
					}
				}
				else if((check == false) && (i == (trainingSet.size() -1))){
					double between = object1.getValue();
					ArrayList<Student> setA = partition2(trainingSet, target, between, true);
					ArrayList<Student> setB = partition2(trainingSet, target, between, false);
			
					double remainder = Entropy.getRemainder2(trainingSet, setA, setB);
					double gain = entropyData - remainder;
					double gainRatio = Entropy.getGainRatio2(trainingSet, setA, setB, gain);
					if (gainRatio > bestGain){
						bestGain = gainRatio;
						bestPos = between;
						check = true;
					}
				}
				child.setInfoGain(bestGain);
				dataMap.put(child, bestPos);
			}
		}
		double bestGain =-1;
		Variable variablePartioned = null;
		for (Variable child : dataMap.keySet()){
			// for those with the same best gain, we will jus take in the first attribute found.
			if (child.getInfoGain() > bestGain){
				bestGain = child.getInfoGain();
				variablePartioned = child;
			}
		}
		ArrayList<Student> setA = partition2(trainingSet, variablePartioned.getName(), dataMap.get(variablePartioned), true);
		ArrayList<Student> setB = partition2(trainingSet, variablePartioned.getName(), dataMap.get(variablePartioned), false);
		
		Node root = new Node(variablePartioned.getName());
		
		root.addValue(">=" + dataMap.get(variablePartioned));
		root.addValue("<" + dataMap.get(variablePartioned));
		root.addChild(buildTree2(setA, variableSets));
		root.addChild(buildTree2(setB, variableSets));
		return root;
	}
}

