package hw3;

import java.util.Scanner;

public class Experiment1 {

	public static void main(String[] args) {

		int RT = 0;
		int stimOnsetTime = 10;
		boolean errCode = false;
		
		Trial myTrial = new Trial();
		myTrial.setTrialNum(2);
		
		Scanner reader = new Scanner(System.in);
		
		Participant [] participants = new Participant[5]; // we should know the size
		Trial [] trials;
		trials = new Trial[5]; // only indicates length, does not initialize the Trial objects
		
		for (int i = 0; i < trials.length; i++) {
			trials[i] = new Trial(i); // yes, we have to do both
			//trials[i].setTrialNum(i);
			trials[i].run();
		}
		
		for (int i = 0; i < 5; i++) {
			participants[i] = new Participant(i);
		}
		
		for (int i = 0; i < participants.length; i++) {
			System.out.println("enter the name of the participant: ");
			String name = reader.next();
			participants[i].setName(name);		
		}
		
	}

}

// class experiment runs within main, trial runs within experiment
