package A5;

import java.util.ArrayList;


public class Student {
	private Variable school;
	private Variable sex;
	private Variable age;
	private Variable home;
	private Variable famSize;
	private Variable parentCohabitationStatus;
	private Variable mEdu;
	private Variable fEdu;
	private Variable primaryCaretaker;
	private Variable careTakerGender;
	private Variable travelTime;
	private Variable studyTime;
	private Variable pastClassFail;
	private Variable extraEdu;
	private Variable famEdu;
	private Variable paidClass;
	private Variable eca;
	private Variable nursery;
	private Variable higherEdu;
	private Variable internetAccess;
	private Variable rs;
	private Variable famRs;
	private Variable freeTime;
	private Variable freqGoingOut;
	private Variable alcholSchool;
	private Variable alcholWeekend;
	private Variable health;
	private Variable daysMissed;
	private boolean pass;
	
	
	
	public Student(Variable school,Variable sex, Variable age, Variable home, Variable famSize,
			Variable parentCohabitationStatus, Variable mEdu, Variable fEdu, Variable primaryCaretaker, Variable careTakerGender,
			Variable travelTime, Variable studyTime, Variable pastClassFail, Variable extraEdu,
			Variable famEdu, Variable paidClass, Variable eca, Variable nursery,
			Variable higherEdu, Variable internetAccess, Variable rs, Variable famRs,
			Variable freeTime, Variable freqGoingOut, Variable alcholSchool, Variable alcholWeekend,
			Variable health, Variable daysMissed, boolean pass){

		this.setSchool(school);
		this.setSex(sex);
		this.setAge(age);
		this.setHome(home);
		this.setFamSize(famSize);
		this.setParentCohabitationStatus(parentCohabitationStatus);
		this.setmEdu(mEdu);
		this.setfEdu(fEdu);
		this.setPrimaryCaretaker(primaryCaretaker);
		this.setCareTakerGender(careTakerGender);
		this.setTravelTime(travelTime);
		this.setStudyTime(studyTime);
		this.setPastClassFail(pastClassFail);
		this.setExtraEdu(extraEdu);
		this.setFamEdu(famEdu);
		this.setPaidClass(paidClass);
		this.setEca(eca);
		this.setNursery(nursery);
		this.setHigherEdu(higherEdu);
		this.setInternetAccess(internetAccess);
		this.setRs(rs);
		this.setFamRs(famRs);
		this.setFreeTime(freeTime);
		this.setFreqGoingOut(freqGoingOut);
		this.setAlcholSchool(alcholSchool);
		this.setAlcholWeekend(alcholWeekend);
		this.setHealth(health);
		this.setDaysMissed(daysMissed);
		this.setPass(pass);
	}

	
	public void setSex(Variable sex) {
		// TODO Auto-generated method stub
		 this.sex = sex;
	}
	
	public Variable getSex() {
		// TODO Auto-generated method stub
		 return this.sex;
	}

	public Variable getVar(String name) {
		if (school.getName().equals(name)) {
			return school;
		}
		if (sex.getName().equals(name)) {
			return sex;
		}
		if (age.getName().equals(name)) {
			return age;
		}
		if (home.getName().equals(name)) {
			return home;
		}
		if (famSize.getName().equals(name)) {
			return famSize;
		}
		if (parentCohabitationStatus.getName().equals(name)) {
			return parentCohabitationStatus;
		}
		if (mEdu.getName().equals(name)) {
			return mEdu;
		}
		if (fEdu.getName().equals(name)) {
			return fEdu;
		}
		if (primaryCaretaker.getName().equals(name)) {
			return primaryCaretaker;
		}
		if (careTakerGender.getName().equals(name)) {
			return careTakerGender;
		}
		if (travelTime.getName().equals(name)) {
			return travelTime;
		}
		if (studyTime.getName().equals(name)) {
			return studyTime;
		}
		if (pastClassFail.getName().equals(name)) {
			return pastClassFail;
		}
		if (extraEdu.getName().equals(name)) {
			return extraEdu;
		}
		if (famEdu.getName().equals(name)) {
			return famEdu;
		}
		if (paidClass.getName().equals(name)) {
			return paidClass;
		}
		if (eca.getName().equals(name)) {
			return eca;
		}
		if (nursery.getName().equals(name)) {
			return nursery;
		}
		if (higherEdu.getName().equals(name)) {
			return higherEdu;
		}
		if (internetAccess.getName().equals(name)) {
			return internetAccess;
		}
		if (rs.getName().equals(name)) {
			return rs;
		}
		if (famRs.getName().equals(name)) {
			return famRs;
		}
		if (freeTime.getName().equals(name)) {
			return freeTime;
		}
		if (freqGoingOut.getName().equals(name)) {
			return freqGoingOut;
		}
		if (alcholSchool.getName().equals(name)) {
			return alcholSchool;
		}
		if (alcholWeekend.getName().equals(name)) {
			return alcholWeekend;
		}
		if (health.getName().equals(name)) {
			return health;
		}
		if (daysMissed.getName().equals(name)) {
			return daysMissed;
		}
		return null;
	}
	
	public static ArrayList<Variable> getAllVar() {
		ArrayList<Variable> a = new ArrayList<>();
		Variable school = new Variable("School Attended");
		Variable sex = new Variable("Sex");
		Variable age = new Variable("Student Age");
		Variable home = new Variable("Student Home");
		Variable famSize = new Variable("Family Size");
		Variable parentCohabitationStatus = new Variable("Parent CoHabitation Status");
		Variable mEdu = new Variable("Mother Education");
		Variable fEdu = new Variable("Father Education");
		Variable primaryCaretaker = new Variable("Primary Caretaker");
		Variable careTakerGender = new Variable("Gender of Primary Caretaker");
		Variable travelTime = new Variable("Travel Time");
		Variable studyTime = new Variable("Weekly Study Time");
		Variable pastClassFail = new Variable("Past Class Failures");
		Variable extraEdu = new Variable("Extra Education");
		Variable famEdu = new Variable("Family Education");
		Variable paidClass = new Variable("Paid Classes");
		Variable eca = new Variable("Extra-curricular activities");
		Variable nursery = new Variable("Nursery Attended");
		Variable higherEdu = new Variable("Higher Education");
		Variable internetAccess = new Variable("Internet Access");
		Variable rs = new Variable("Romantic Relationship");
		Variable famRs = new Variable("Family Relationship Quality");
		Variable freeTime = new Variable("Free Time after School");
		Variable freqGoingOut = new Variable("Frequency going out with friend");
		Variable alcholSchool = new Variable("Alchol on School Day");
		Variable alcholWeekend = new Variable("Alchol on Weekend");
		Variable health = new Variable("Health");
		Variable daysMissed = new Variable("Classes Missed");
		a.add(school);
		a.add(sex);
		a.add(age);
		a.add(home);
		a.add(famSize);
		a.add(parentCohabitationStatus);
		a.add(mEdu);
		a.add(fEdu);
		a.add(primaryCaretaker);
		a.add(careTakerGender);
		a.add(travelTime);
		a.add(studyTime);
		a.add(pastClassFail);
		a.add(extraEdu);
		a.add(famEdu);
		a.add(paidClass);
		a.add(eca);
		a.add(nursery);
		a.add(higherEdu);
		a.add(internetAccess);
		a.add(rs);
		a.add(famRs);
		a.add(freeTime);
		a.add(freqGoingOut);
		a.add(alcholSchool);
		a.add(alcholWeekend);
		a.add(health);
		a.add(daysMissed);

		return a;
	}
	
	public Variable getSchool() {
		return school;
	}

	public void setSchool(Variable school) {
		this.school = school;
	}
	
	public Variable getDaysMissed() {
		return daysMissed;
	}

	public void setDaysMissed(Variable daysMissed) {
		this.daysMissed = daysMissed;
	}

	public Variable getHome() {
		return home;
	}

	public void setHome(Variable home) {
		this.home = home;
	}

	public Variable getFamSize() {
		return famSize;
	}

	public void setFamSize(Variable famSize) {
		this.famSize = famSize;
	}

	public Variable getAge() {
		return age;
	}

	public void setAge(Variable age) {
		this.age = age;
	}

	public Variable getParentCohabitationStatus() {
		return parentCohabitationStatus;
	}

	public void setParentCohabitationStatus(Variable parentCohabitationStatus) {
		this.parentCohabitationStatus = parentCohabitationStatus;
	}

	public Variable getmEdu() {
		return mEdu;
	}

	public void setmEdu(Variable mEdu) {
		this.mEdu = mEdu;
	}

	public Variable getPrimaryCaretaker() {
		return primaryCaretaker;
	}

	public void setPrimaryCaretaker(Variable primaryCaretaker) {
		this.primaryCaretaker = primaryCaretaker;
	}

	public Variable getfEdu() {
		return fEdu;
	}

	public void setfEdu(Variable fEdu) {
		this.fEdu = fEdu;
	}

	public Variable getCareTakerGender() {
		return careTakerGender;
	}

	public void setCareTakerGender(Variable careTakerGender) {
		this.careTakerGender = careTakerGender;
	}

	public Variable getStudyTime() {
		return studyTime;
	}

	public void setStudyTime(Variable studyTime) {
		this.studyTime = studyTime;
	}

	public Variable getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(Variable travelTime) {
		this.travelTime = travelTime;
	}

	public Variable getPastClassFail() {
		return pastClassFail;
	}

	public void setPastClassFail(Variable pastClassFail) {
		this.pastClassFail = pastClassFail;
	}

	public Variable getExtraEdu() {
		return extraEdu;
	}

	public void setExtraEdu(Variable extraEdu) {
		this.extraEdu = extraEdu;
	}

	public Variable getFamEdu() {
		return famEdu;
	}

	public void setFamEdu(Variable famEdu) {
		this.famEdu = famEdu;
	}

	public Variable getPaidClass() {
		return paidClass;
	}

	public void setPaidClass(Variable paidClass) {
		this.paidClass = paidClass;
	}

	public Variable getEca() {
		return eca;
	}

	public void setEca(Variable eca) {
		this.eca = eca;
	}

	public Variable getNursery() {
		return nursery;
	}

	public void setNursery(Variable nursery) {
		this.nursery = nursery;
	}

	public Variable getHigherEdu() {
		return higherEdu;
	}

	public void setHigherEdu(Variable higherEdu) {
		this.higherEdu = higherEdu;
	}

	public Variable getAlcholSchool() {
		return alcholSchool;
	}

	public void setAlcholSchool(Variable alcholSchool) {
		this.alcholSchool = alcholSchool;
	}

	public Variable getFreeTime() {
		return freeTime;
	}

	public void setFreeTime(Variable freeTime) {
		this.freeTime = freeTime;
	}

	public Variable getRs() {
		return rs;
	}

	public void setRs(Variable rs) {
		this.rs = rs;
	}

	public Variable getInternetAccess() {
		return internetAccess;
	}

	public void setInternetAccess(Variable internetAccess) {
		this.internetAccess = internetAccess;
	}

	public Variable getFamRs() {
		return famRs;
	}

	public void setFamRs(Variable famRs) {
		this.famRs = famRs;
	}

	public Variable getFreqGoingOut() {
		return freqGoingOut;
	}

	public void setFreqGoingOut(Variable freqGoingOut) {
		this.freqGoingOut = freqGoingOut;
	}

	public Variable getAlcholWeekend() {
		return alcholWeekend;
	}

	public void setAlcholWeekend(Variable alcholWeekend) {
		this.alcholWeekend = alcholWeekend;
	}

	public Variable getHealth() {
		return health;
	}

	public void setHealth(Variable health) {
		this.health = health;
	}

	public boolean getPass() {
		return pass;
	}

	public void setPass(boolean pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "[ school=" + this.school.getValue() + ", sex=" + this.sex.getValue() + ", age=" + age.getValue() + ", home=" + home.getValue() + ", famSize="
				+ famSize.getValue() + ", parentCohabitationStatus=" + parentCohabitationStatus.getValue() + ", mEdu=" + mEdu.getValue() + ", fEdu="
				+ fEdu.getValue() + ", primaryCaretaker=" + primaryCaretaker.getValue() + ", careTakerGender=" + careTakerGender.getValue()
				+ ", travelTime=" + travelTime.getValue() + ", studyTime=" + studyTime.getValue() + ", pastClassFail=" + pastClassFail.getValue()
				+ ", extraEdu=" + extraEdu.getValue() + ", famEdu=" + famEdu.getValue() + ", paidClass=" + paidClass.getValue() + ", eca=" + eca.getValue()
				+ ", nursery=" + nursery.getValue() + ", higherEdu=" + higherEdu.getValue() + ", internetAccess=" + internetAccess.getValue() + ", rs="
				+ rs.getValue() + ", famRs=" + famRs.getValue() + ", freeTime=" + freeTime.getValue() + ", freqGoingOut=" + freqGoingOut.getValue()
				+ ", alcholSchool=" + alcholSchool.getValue() + ", alcholWeekend=" + alcholWeekend.getValue() + ", health=" + health.getValue()
				+ ", daysMissed=" + daysMissed.getValue() + ", pass=" + pass + " ]";
	}

}
