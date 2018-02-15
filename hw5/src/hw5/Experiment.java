package hw5;

import java.util.ArrayList;

public class Experiment {
	
	protected ArrayList<EasyTrial> myEasyTrials = new ArrayList<EasyTrial>();
	protected ArrayList<HardTrial> myHardTrials = new ArrayList<HardTrial>();
	
	public void run() {
		System.out.println("running experiment...");
		float num_of_corr = 0;
		for (int i = 0; i < 20; i++) {
			if ((i % 2 == 0) || (num_of_corr/i < 0.5) && (i != 0)) {
				myEasyTrials.add(new EasyTrial());
				if (myEasyTrials.get(myEasyTrials.size()-1).run()) {
					num_of_corr += 1;
				}
			}
			else {
				myHardTrials.add(new HardTrial());
				if (myHardTrials.get(myHardTrials.size()-1).run()) {
					num_of_corr += 1;
				}
			}
		}
		System.out.println(num_of_corr + " of 20 trials were correct");
	}

}
