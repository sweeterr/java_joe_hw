import java.util.Scanner;
import java.util.Arrays;
import java.lang.Integer;

public class Problems {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// System.out.println("Input a string: ");
		// String input = scanner.nextLine();
		// System.out.println(left2(input));
		// System.out.println(seeColor(input));
		// System.out.println(loneSum(3, 2, 3));
		// System.out.println(blackjack(22, 22));
		// System.out.println(Arrays.toString(fizzArray(5)));
		System.out.println(hasOne(220));

	}
	
	public static String left2(String str) {
		String newStr;
		newStr = str.substring(2, str.length()) + str.substring(0, 2);
		return newStr;
	}
	
	public static String seeColor(String str) {
		String color;
		if (str.startsWith("red")) {
			color = "red";
		}
		else if (str.startsWith("blue")) {
			color = "blue";
		}
		else {
			color = "";
		}
		return color;
	}
	
	public static int loneSum(int a, int b, int c) {
		int newSum = a;
		if (b == a) { 
			newSum -= a; 
			if (b != c) {
				newSum = c;
			}
		}
		else {
			newSum += b;
			if (b != c) {
				newSum += c;
				if (a == c) {
					newSum -= (a + c);
				}
			}
			else {
				newSum -= b;
			}
		}
		return newSum;
	}
	
	public static int blackjack(int a, int b) {
		int closest;
		if ((a > 21) && (b > 21)) {
			closest = 0;
		}
		else if ((a > 21) && (b <= 21)) {
			closest = b;
		}
		else if ((a <= 21) && (b > 21)) {
			closest = a;
		}
		else {
			if ((21 - a) < (21 - b)) {
				closest = a;
			}
			else {
				closest = b;
			}
		}
		return closest;
	}
	
	public static int[] fizzArray(int n) {
		int [] newArr = new int[n];
		for (int i = 0; i < n; i++) {
			newArr[i] = i;
		}
		return newArr;
	}
	
	public static boolean hasOne(int n) {
		boolean contains = false;
		String numStr = Integer.toString(n);
		if (numStr.contains("1")) {
			contains = true;
		}
		return contains;
	}
}
