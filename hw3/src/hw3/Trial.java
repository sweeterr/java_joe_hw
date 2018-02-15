package hw3;

public class Trial {
	protected int trialNum; // so it is not default
	protected int trialDur;
	String trialCond;
	// Stimulus [] trialStimSet;
	
	public Trial() {
		trialNum = 1; // initial value
		trialDur = 200; 
	}
	
	public Trial(int tnum) {
		trialNum = tnum; 
		trialDur = 200;
	}
	
	public void setTrialNum(int tnum) {
		trialNum = tnum;
	}
	
	public void run() { 
		boolean goodResponse = true;
		if (!goodResponse) {
			setBadTrial();
		}
	}
	
	public int getTrialNum() {
		// return tnum; NOT WITHIN SCOPE
		return trialNum;
	}
	
	private void setBadTrial() { // only for this class
		
	}
	
	protected void unsetBadTrial() {
		
	}
}

// goto, while(true), global variables -- BAD CODE