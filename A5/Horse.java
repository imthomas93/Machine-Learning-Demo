package A5;

import java.util.ArrayList;
import java.util.Comparator;

@SuppressWarnings("unused")
public class Horse implements Comparable<Horse>{

	private Variable k;
	private Variable na;
	private Variable cl;
	private Variable hco3;
	private Variable endotoxin;
	private Variable aniongap;
	private Variable pla2;
	private Variable sdh;
	private Variable gldh;
	private Variable tpp;
	private Variable breathRate;
	private Variable pcv;
	private Variable pulseRate;
	private Variable fibrinogen;
	private Variable dimmer;
	private Variable fibPerDim;
	private String classification;
	private boolean isHealthy;
	
	// create Horse
	public Horse(
			Variable k, Variable na, Variable cl, Variable hco3, 
			Variable endotoxin, Variable aniongap, Variable pla2, Variable sdh,
			Variable gldh, Variable tpp, Variable breathRate, Variable pcv,
			Variable pulseRate, Variable fibrinogen, Variable dimmer, Variable fibPerDim,
			String classification){
		
		this.k = k;
		this.na = na;
		this.cl = cl;
		this.hco3 = hco3;
		this.endotoxin = endotoxin;
		this.aniongap = aniongap;
		this.pla2 = pla2;
		this.sdh = sdh;
		this.gldh = gldh;
		this.tpp = tpp;
		this.breathRate = breathRate;
		this.pcv = pcv;
		this.pulseRate = pulseRate;
		this.fibrinogen = fibrinogen;
		this.dimmer = dimmer;
		this.fibPerDim = fibPerDim;
		
		this.classification = classification;
		if (this.classification.equalsIgnoreCase("healthy."))
			this.isHealthy = true;
		else 
			this.isHealthy = false;
	}
	
	// get Horse
	public Variable getK(){return this.k;}
	public Variable getNa(){return this.na;}
	public Variable getCl(){return this.cl;}
	public Variable getHco3(){return this.hco3;}
	public Variable getEndotoxin(){return this.endotoxin;}
	public Variable getAniongap(){return this.aniongap;}
	public Variable getPla2(){return this.pla2;}
	public Variable getSdh(){ return this.sdh;}
	public Variable getGldh(){ return this.gldh;}
	public Variable getTpp(){ return this.tpp;}
	public Variable getBreathRate(){ return this.breathRate;}
	public Variable getPcv(){ return this.pcv;}
	public Variable getPulseRate(){ return this.pulseRate;}
	public Variable getFibrinogen(){ return this.fibrinogen;}
	public Variable getDimer(){ return this.dimmer;}
	public Variable getFibPerDim(){ return this.fibPerDim;}
	public String getClassification(){ return this.classification;}
	public boolean getIsHealthy(){ return this.isHealthy;}
	
	
	public static ArrayList<Variable> getAllVar(){
		Variable k = new Variable("k");
        Variable na = new Variable("na");
        Variable cl = new Variable("cl");
        Variable hco3 = new Variable("hco3");
        Variable endotoxin = new Variable("endotoxin");
        Variable anionGap = new Variable("aniongap");
        Variable pla2 = new Variable("pla2");
        Variable sdh = new Variable("sdh");
        Variable gldh = new Variable("gldh");
        Variable tpp = new Variable("tpp");
        Variable breathRate = new Variable("breathRate");
        Variable pcv = new Variable("pcv");
        Variable pulseRate = new Variable("pulseRate");
        Variable fibrinogen = new Variable("fibrinogen");
        Variable dimmer = new Variable("dimmer");
        Variable fibPerDim = new Variable("fibPerDim");
        ArrayList<Variable> variables = new ArrayList<Variable>();
        variables.add(k);
        variables.add(na);
        variables.add(cl);
        variables.add(hco3);
        variables.add(endotoxin);
        variables.add(anionGap);
        variables.add(pla2);
        variables.add(sdh);
        variables.add(gldh);
        variables.add(tpp);
        variables.add(breathRate);
        variables.add(pcv);
        variables.add(pulseRate);
        variables.add(fibrinogen);
        variables.add(dimmer);
        variables.add(fibPerDim);
        return variables;
	}
	
	// format to string
	public String toString(){		
		String output = "[ " + this.k.getValue() + " , " + this.na.getValue() + " , " + this.cl.getValue() + " , " + this.hco3.getValue() + " , " + 
				this.endotoxin.getValue() + " , " + this.aniongap.getValue() + " , " + this.pla2.getValue() + " , " + this.sdh.getValue() + " , " + 
				this.gldh.getValue() + " , " + this.tpp.getValue() + " , " + this.breathRate.getValue() + " , " + this.pcv.getValue() + " , " + 
				this.pulseRate.getValue() + " , " + this.fibrinogen.getValue() + " , " + this.dimmer.getValue() + " , " + this.fibPerDim.getValue() + " , " + 
				this.classification + " , " + this.isHealthy +" ] "; 
				
		return output;
	}

	public Variable getVar(String target){
		if (target.equalsIgnoreCase("k"))
			return this.k;
		else if (target.equalsIgnoreCase("na"))
			return this.na;
		else if (target.equalsIgnoreCase("cl"))
			return this.cl;
		else if (target.equalsIgnoreCase("hco3"))
			return this.hco3;
		else if (target.equalsIgnoreCase("endotoxin"))
			return this.endotoxin;
		else if (target.equalsIgnoreCase("aniongap"))
			return this.aniongap;
		else if (target.equalsIgnoreCase("pla2"))
			return this.pla2;
		else if (target.equalsIgnoreCase("sdh"))
			return this.sdh;
		else if (target.equalsIgnoreCase("gldh"))
			return this.gldh;
		else if (target.equalsIgnoreCase("tpp"))
			return this.tpp;
		else if (target.equalsIgnoreCase("breathRate"))
			return this.breathRate;
		else if (target.equalsIgnoreCase("pcv"))
			return this.pcv;
		else if (target.equalsIgnoreCase("pulseRate"))
			return this.pulseRate;
		else if (target.equalsIgnoreCase("fibrinogen"))
			return this.fibrinogen;
		else if (target.equalsIgnoreCase("dimmer"))
			return this.dimmer;
		else if (target.equalsIgnoreCase("fibPerDim"))
			return this.fibPerDim;
		
		return null;
	}
	
	public Variable getVar(int target){
		if (target == 1)
			return this.k;
		else if (target == 2)
			return this.na;
		else if (target  == 3)
			return this.cl;
		else if (target ==4 )
			return this.hco3;
		else if (target == 5)
			return this.endotoxin;
		else if (target == 6)
			return this.aniongap;
		else if (target == 7)
			return this.pla2;
		else if (target == 8)
			return this.sdh;
		else if (target == 9)
			return this.gldh;
		else if (target == 10)
			return this.tpp;
		else if (target == 11)
			return this.breathRate;
		else if (target == 12)
			return this.pcv;
		else if (target == 13)
			return this.pulseRate;
		else if (target == 14)
			return this.fibrinogen;
		else if (target == 15)
			return this.dimmer;
		else if (target == 16)
			return this.fibPerDim;
		
		return null;
	}
	
	@Override
	public int compareTo(Horse o) {
		// TODO Auto-generated method stub
		return this.classification.compareTo(o.getClassification());
		//return 0;
	}
}


