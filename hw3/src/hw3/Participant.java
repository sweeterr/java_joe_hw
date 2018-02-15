package hw3;

public class Participant {
	int partNum;
	String partName;
	int partAge;
	int gender; // string coded as integer
	int socialStatus; // string coded as integer
	
	public Participant(int i) {
		partNum = i;
	}
	
	public void setAge(int i) {
		partAge = i;
	}
	
	public void setName(String s) {
		partName = s;
	}
	
	public void delPart() {
		
	}
	
	public int getPartNum() {
		return partNum;
	}
	

}
