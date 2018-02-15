package hw4;

public class Experiment {
	
	//every experiment has an array of trials of length 5
	protected Trial [] myTrials = new Trial[5];
	
	public void run() {
		System.out.println("running experiment...");
		
		//for every trial in the array of trials run the trial
		for (int i = 0; i < myTrials.length; i++) {
			myTrials[i] = new Trial(i);
			myTrials[i].run();
		}
	}

}
