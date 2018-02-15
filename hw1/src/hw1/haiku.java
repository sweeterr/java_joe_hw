package hw1;

import java.util.Scanner;

public class haiku {

	public static void main(String[] args) {
		// prints out a string in haiku format
		String defaultString = new String("a raindrop from the roof fell in my beer");
		//Scanner reader = new Scanner(System.in);
		//System.out.println("enter a string which you want to haiku: ");
		//String s = reader.next();
		
		int break1, break2, strLen;
		strLen = defaultString.length();
		break1 = Math.round(strLen * 5 / 17);
		break2 = Math.round(strLen * 12 / 17);

		String haikufied = new String(); 
		for (int i = break1; i < strLen; i++) {
			char c = defaultString.charAt(i);
			if (c == ' ') {
				haikufied = defaultString.substring(0, i) + "\n" + defaultString.substring(i + 1, strLen);
				break;
			}
		}
		
		for (int i = break2; i < strLen; i++) {
			char c = haikufied.charAt(i);
			if (c == ' ') {
				haikufied = haikufied.substring(0, i) + "\n" + haikufied.substring(i + 1, strLen);
				break;
			}
		}
		
		System.out.println(haikufied);
	}

}
