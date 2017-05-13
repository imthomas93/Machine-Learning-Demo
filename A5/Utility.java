package A5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Utility {
	public ArrayList<Horse> readHorseColicfile(String fileName){

		ArrayList<Horse> hcList = new ArrayList<Horse>();
		try{

			BufferedReader reader = new BufferedReader(new FileReader("src/A5/files/" + fileName));
			String output = reader.readLine();
			
			String name;
			double value;
			
			while(output !=null){
				StringTokenizer multiTokenizer = new StringTokenizer(output, ",");
				output = reader.readLine();
				
				name = "k";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable k = new Variable(name, value);
				
				name = "na";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable na = new Variable(name, value);
				
				name = "cl";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable cl = new Variable(name, value);
				
				name = "hco3";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable hco3 = new Variable(name, value);
				
				name = "endotoxin";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable endotoxin = new Variable(name, value);
				
				name = "aniongap";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable aniongap = new Variable(name, value);
				
				name = "pla2";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable pla2 = new Variable(name, value);
				
				name = "sdh";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable sdh = new Variable(name, value);
				
				name = "gldh";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable gldh = new Variable(name, value);
				
				name = "tpp";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable tpp = new Variable(name, value);
				
				name = "breathRate";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable breathRate = new Variable(name, value);
				
				name = "pcv";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable pcv = new Variable(name, value);
				
				name = "pulseRate";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable pulseRate = new Variable(name, value);
				
				name = "fibrinogen";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable fibrinogen = new Variable(name, value);
				
				name = "dimer";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable dimer = new Variable(name, value);
				
				name = "fibPerDim";
				value = Double.parseDouble(multiTokenizer.nextToken());
				Variable fibPerDim = new Variable(name, value);
				
				String classification = multiTokenizer.nextToken();
				
				Horse input = new Horse(k, na, cl, hco3, 
						endotoxin, aniongap, pla2, sdh, 
						gldh, tpp, breathRate, pcv, 
						pulseRate, fibrinogen, dimer, fibPerDim, classification);

				
				hcList.add(input);
				
			}
			
			reader.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		return hcList;
	}
	
	
	public ArrayList<Student> readStudentfile(String fileName){

		ArrayList<Student> studentList = new ArrayList<Student>();
		try{

			BufferedReader reader = new BufferedReader(new FileReader("src/A5/files/" + fileName));
			String output = reader.readLine();
			
			while ((output = reader.readLine()) != null){
				String [] outSplit = output.split(",");
				
				Variable school = new Variable("School Attended");
				school.setValue(Double.parseDouble(outSplit[0]));
				
				Variable sex = new Variable("Sex");
				sex.setValue(Double.parseDouble(outSplit[1]));
				
				Variable age = new Variable("Student Age");
				age.setValue(Double.parseDouble(outSplit[2]));
				
				Variable home = new Variable("Student Home");
				home.setValue(Double.parseDouble(outSplit[3]));
				
				Variable famSize = new Variable("Family Size");
				famSize.setValue(Double.parseDouble(outSplit[4]));
				
				Variable parentCohabitationStatus = new Variable("Parent CoHabitation Status");
				parentCohabitationStatus.setValue(Double.parseDouble(outSplit[5]));
				
				Variable mEdu = new Variable("Mother Education");
				mEdu.setValue(Double.parseDouble(outSplit[6]));
				
				Variable fEdu = new Variable("Father Education");
				fEdu.setValue(Double.parseDouble(outSplit[7]));
				
				Variable primaryCaretaker = new Variable("Primary Caretaker");
				primaryCaretaker.setValue(Double.parseDouble(outSplit[8]));
				
				Variable careTakerGender = new Variable("Gender of Primary Caretaker");
				careTakerGender.setValue(Double.parseDouble(outSplit[9]));
				
				Variable travelTime = new Variable("Travel Time");
				travelTime.setValue(Double.parseDouble(outSplit[10]));
				
				Variable studyTime = new Variable("Weekly Study Time");
				studyTime.setValue(Double.parseDouble(outSplit[11]));
				
				Variable pastClassFail = new Variable("Past Class Failures");
				pastClassFail.setValue(Double.parseDouble(outSplit[12]));
				
				Variable extraEdu = new Variable("Extra Education");
				extraEdu.setValue(Double.parseDouble(outSplit[13]));
				
				Variable famEdu = new Variable("Family Education");
				famEdu.setValue(Double.parseDouble(outSplit[14]));
				
				Variable paidClass = new Variable("Paid Classes");
				paidClass.setValue(Double.parseDouble(outSplit[15]));
				
				Variable eca = new Variable("Extra-curricular activities");
				eca.setValue(Double.parseDouble(outSplit[16]));
				
				Variable nursery = new Variable("Nursery Attended");
				nursery.setValue(Double.parseDouble(outSplit[17]));
				
				Variable higherEdu = new Variable("Higher Education");
				higherEdu.setValue(Double.parseDouble(outSplit[18]));
				
				Variable internetAccess = new Variable("Internet Access");
				internetAccess.setValue(Double.parseDouble(outSplit[19]));
				
				Variable rs = new Variable("Romantic Relationship");
				rs.setValue(Double.parseDouble(outSplit[20]));
				
				Variable famRs = new Variable("Family Relationship Quality");
				famRs.setValue(Double.parseDouble(outSplit[21]));
				
				Variable freeTime = new Variable("Free Time after School");
				freeTime.setValue(Double.parseDouble(outSplit[22]));
				
				Variable freqGoingOut = new Variable("Frequency going out with friend");
				freqGoingOut.setValue(Double.parseDouble(outSplit[23]));
				
				Variable alcholSchool = new Variable("Alchol on School Day");
				alcholSchool.setValue(Double.parseDouble(outSplit[24]));
				
				Variable alcholWeekend = new Variable("Alchol on Weekend");
				alcholWeekend.setValue(Double.parseDouble(outSplit[25]));
				
				Variable health = new Variable("Health");
				health.setValue(Double.parseDouble(outSplit[26]));
				
				Variable daysMissed = new Variable("Classes Missed");
				daysMissed.setValue(Double.parseDouble(outSplit[27]));
				
				boolean pass;
				if (outSplit[28].equals("1")) 
					pass = true;
				else 
					pass = false;
				
				Student input = new Student(school, sex, age, home, 
						famSize, parentCohabitationStatus, mEdu, fEdu, 
						primaryCaretaker, careTakerGender, travelTime, studyTime, 
						pastClassFail, extraEdu, famEdu, paidClass, 
						eca, nursery, higherEdu, internetAccess, 
						rs, famRs, freeTime, freqGoingOut, 
						alcholSchool, alcholWeekend, health, daysMissed, 
						pass);
				
				studentList.add(input);
			}
			
			reader.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		return studentList;
	}
	
	
	public static ArrayList<Horse> sortVariable(ArrayList<Horse> hcList, String target){
		
		for (int i = 1; i < hcList.size(); i++){
			for (int x = i; x > 0; x--){
				Variable o1 = hcList.get(x).getVar(target);
				Variable o2 = hcList.get(x-1).getVar(target);
				
				if (o1.getValue() < o2.getValue()){
					Horse temp = hcList.get(x);
					hcList.set(x, hcList.get(x-1));
					hcList.set(x-1, temp);
				}	
			}
		}
		
		return hcList;
	}
		
	public static int getColic(ArrayList<Horse> trainingSet) {
		// TODO Auto-generated method stub
		int counter = 0;
		for(Horse child : trainingSet)
			if(!child.getIsHealthy())
				counter++;
		return counter;
	}
	
	public static int getHealthy(ArrayList<Horse> trainingSet) {
		// TODO Auto-generated method stub
		int counter = 0;
		for(Horse child : trainingSet)
			if(child.getIsHealthy())
				counter++;
		return counter;
	}
	
	public static int getPass(ArrayList<Student> trainingSet){
		// TODO Auto-generated method stub
		int counter = 0;
		for(Student child : trainingSet)
			if(child.getPass())
				counter++;
		return counter;
	}
	

	public static int getFail(ArrayList<Student> trainingSet){
		// TODO Auto-generated method stub
		int counter = 0;
		for(Student child : trainingSet)
			if(!child.getPass())
				counter++;
		return counter;
	}
	
	
	
	public void printNode(Node root){
		System.out.println("Current Node:\t" + root.getAttribute());
		
		if(root.getParent() !=null)
			System.out.println("Parent Node:\t" + root.getParent().getAttribute() );
		
		for (int i = 0; i < root.getChildren().size(); i++)
			System.out.println("Childrent:\t" + root.getChildren().get(i).getAttribute());
		
		for (int i = 0; i < root.getValue().size(); i++)
			System.out.println("Value:\t" + root.getValue().get(i));
		System.out.println("");

		for(Node child: root.getChildren()){
			printNode(child);
		}
	}

	public void testTree(ArrayList<Horse> testSet, Node decisionTree) {
		// TODO Auto-generated method stub
		int healthyCounter = 0;
		int colicCounter = 0;

		int healthy = getHealthy(testSet);
		int colic = getColic(testSet);
				
		for (Horse child : testSet){
			boolean childTest = testSample(child , decisionTree);
			
			if (childTest == child.getIsHealthy() && childTest)
				healthyCounter++;
			if (childTest == child.getIsHealthy() && !childTest)
				colicCounter++;
		}
		
		double healthyPercentage = (double)healthyCounter / (double) healthy;
		double colicPercentage = (double)colicCounter / (double) colic;
		System.out.println("Expected Healthy: "+ healthy);
		System.out.println("Actual Healhy: " + healthyCounter);
		System.out.println("Correct Healthy Percentage: " + healthyPercentage*100 + "%\n");
		
		System.out.println("Expected Colic: "+ colic);
		System.out.println("Actual Colic: " + colicCounter);
		System.out.println("Correct Colic Percentage: " + colicPercentage*100 + "%\n");
		
		System.out.println("Accuracy Percentage: " + ((healthyPercentage + colicPercentage)/2)*100 + "%");

	}

	private boolean testSample(Horse child, Node decisionTree) {
		// TODO Auto-generated method stub
		String testPoint = decisionTree.getAttribute();
		Variable testVar = child.getVar(testPoint);
		ArrayList<String> valueList = decisionTree.getValue();
		double testValue = 0;

		boolean greater = true;
		
		// reached leaf node
		if(decisionTree.getAttribute().equals("End")){
			if (decisionTree.getValue().contains("true"))
				return true;
			else 
				return false;
		}
		
		// get the testing value and branch to traverse 
		for (String childString : valueList){
			//value is greater than
			if (childString.contains("=")){
				testValue = Double.parseDouble(childString.substring(2));
			}
			else{
				testValue = Double.parseDouble(childString.substring(1));
			}
		}
		
		
		if (testVar.getValue() >= testValue)
			greater = true;
		else
			greater = false;
		
		if(greater)
			return testSample(child, decisionTree.getChildren().get(0));
		else
			return testSample(child, decisionTree.getChildren().get(1));

		
	}


	
	public static ArrayList<Student> sortVariable2(ArrayList<Student> trainingSet, String target) {
		// TODO Auto-generated method stub
		for (int i = 1; i < trainingSet.size(); i++){
			for (int x = i; x > 0; x--){
				Variable o1 = trainingSet.get(x).getVar(target);
				Variable o2 = trainingSet.get(x-1).getVar(target);
				
				if (o1.getValue() < o2.getValue()){
					Student temp = trainingSet.get(x);
					trainingSet.set(x, trainingSet.get(x-1));
					trainingSet.set(x-1, temp);
				}	
			}
		}
		return trainingSet;
	}


	
	public void testTree2(ArrayList<Student> testSet, Node decisionTree) {
		// TODO Auto-generated method stub
		int passCounter = 0;
		int failCounter = 0;

		int pass = getPass(testSet);
		int fail = getFail(testSet);
				
		for (Student child : testSet){
			boolean childTest = testSample2(child , decisionTree);
			
			if (childTest == child.getPass() && childTest)
				passCounter++;
			if (childTest == child.getPass() && !childTest)
				failCounter++;
		}
		
		double passPercentage = (double)passCounter / (double) pass;
		double failPercentage = (double)failCounter / (double) fail;
		System.out.println("Expected Pass: "+ pass);
		System.out.println("Actual Pass: " + passCounter);
		System.out.println("Correct Pass Percentage: " + passPercentage*100 + "%\n");
		
		System.out.println("Expected Fail: "+ fail);
		System.out.println("Actual Fail: " + failCounter);
		System.out.println("Correct Fail Percentage: " + failPercentage*100 + "%\n");
		
		
		System.out.println("Accuracy Percentage: " + ((passPercentage + failPercentage)/2)*100 + "%");
	}
	
	private boolean testSample2(Student child, Node decisionTree) {
		// TODO Auto-generated method stub
		String testPoint = decisionTree.getAttribute();
		Variable testVar = child.getVar(testPoint);
		ArrayList<String> valueList = decisionTree.getValue();
		double testValue = 0;

		boolean greater = true;
		
		// reached leaf node
		if(decisionTree.getAttribute().equals("End")){
			if (decisionTree.getValue().contains("true"))
				return true;
			else 
				return false;
		}
		
		// get the testing value and branch to traverse 
		for (String childString : valueList){
			//value is greater than
			if (childString.contains("=")){
				testValue = Double.parseDouble(childString.substring(2));
			}
			else{
				testValue = Double.parseDouble(childString.substring(1));
			}
		}
		
		
		if (testVar.getValue() >= testValue)
			greater = true;
		else
			greater = false;
		
		if(greater)
			return testSample2(child, decisionTree.getChildren().get(0));
		else
			return testSample2(child, decisionTree.getChildren().get(1));
	}

}

