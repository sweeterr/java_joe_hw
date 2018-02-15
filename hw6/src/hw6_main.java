import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class hw6_main {

	public static void main(String[] args) {
		
		ArrayList <String> trials = new ArrayList<String>();
		
		try {
			File file = new File("SaccAnt3.dat");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line;
			line = bufferedReader.readLine();
			while (line != null) {
				line = bufferedReader.readLine();
				if (line != null) {
					trials.add(line);
				}
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("number of trials: " + trials.size());
		
		String [] [] trialData = new String[trials.size()][];
		int i = 0;
		float RTsum = 0;
		
		for (String trial:trials) {
			trialData[i] = trial.split("\t");
			RTsum += Float.parseFloat(trialData[i][2]);
			//System.out.println(Arrays.toString(trialData[i]));
			i += 1;
		}
		
		System.out.println("mean audCue: " + RTsum/trials.size());

	}

}
