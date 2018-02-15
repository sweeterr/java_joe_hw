package hw5;

public class HardTrial {
	
	public boolean run() {
		System.out.println("running hard trial...");
		boolean correct = false;
		if (Math.random() <= 0.3) {
			correct = true;
		}
		System.out.println(correct);
		return correct;
	}

}
