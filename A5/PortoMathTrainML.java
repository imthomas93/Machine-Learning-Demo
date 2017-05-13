package A5;

import java.util.ArrayList;

public class PortoMathTrainML {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility = new Utility();
		
		// build trainingset
		System.out.println("Training System....");
		ArrayList<Student> trainingSet = utility.readStudentfile("porto_math_train.csv");
		ArrayList<Variable> variableSets = Student.getAllVar();

		Tree tree = new Tree();
		Node decisionTree = tree.buildTree2(trainingSet, variableSets);

		utility .printNode(decisionTree);

		// testing DT
		System.out.println("\tTesting System (trainingSet)....");
		utility.testTree2(trainingSet, decisionTree);
		
		System.out.println();
		System.out.println("\tTesting System (testSet)....");
		ArrayList<Student> testSet = utility.readStudentfile("porto_math_test.csv");
		utility.testTree2(testSet, decisionTree);		
	}			
}
