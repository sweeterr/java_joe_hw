package hw5;

public class EasyTrial {
	
	public boolean run() {
		System.out.println("running easy trial...");
		boolean correct = false;
		if (Math.random() <= 0.8) {
			correct = true;
		}
		System.out.println(correct);
		return correct;
	}

}
