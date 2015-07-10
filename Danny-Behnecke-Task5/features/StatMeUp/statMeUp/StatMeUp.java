package statMeUp;

import java.util.Arrays;
import java.util.Scanner;





/**
 * @author Danny Behnecke
 *
 */
public class StatMeUp {

	private static Scanner input = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		while (true) {

			mainMenu();
		}

	}

	public static void mainMenu() {
		char choice;
		System.out.println("---StatMeUp ---");
		System.out.println("---Main Menu ---");
		System.out.println("Select an option: \n");


		System.out.println("[Q]uit StatMeUp");

		choice = input.next().charAt(0);

		if (Character.toLowerCase(choice) == 'q') {
			System.exit(1);
		}
		
		

	}

}
