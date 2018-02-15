package hw4;

public class Trial {
	//trial number
	protected int trialNum;
	
	//trial duration
	protected int trialDur;
	
	public Trial() {
		trialNum = 1;
		trialDur = 200; 
	}
	
	public Trial(int tnum) {
		trialNum = tnum; 
		trialDur = 200;
	}
	
	public void setTrialNum(int tnum) {
		trialNum = tnum;
	}
	
	public int getTrialNum() {
		return trialNum;
	}
	
	public void run() { 
		System.out.println("running trial " + trialNum + "...");
	}
}