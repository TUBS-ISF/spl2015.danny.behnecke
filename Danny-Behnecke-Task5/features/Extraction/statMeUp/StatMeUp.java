package statMeUp;

import java.util.Arrays;
import java.util.Scanner;





/**
 * @author Danny Behnecke
 *
 */
public class StatMeUp {


	public static void mainMenu() {


		System.out.println("- Information [E]xtraction");
		System.out.println("- Set [M]odification");


		if (Character.toLowerCase(choice) == 'e') {
			extractionContext();
		}


	}

	public static void extractionContext() {

		System.out.println("Here you can access the attributes of your set");
		System.out.println("Show [a]ll attributes");
		System.out.println("Show [w]hole dataset");
		System.out.println("Show [v]isualization possibilities");
		System.out.println("[r]eturn");
		char choice = input.next().charAt(0);

		if (Character.toLowerCase(choice) == 'a') {

			System.out.println(current.getAttributes());

		}

		if (Character.toLowerCase(choice) == 'w') {

			System.out.println(current.toString());

		}
		//#ifdef vizualization 
//@		if (Character.toLowerCase(choice) == 'v') {
//@
//@			vizContext();
//@
//@		}
		//#endif

		if (Character.toLowerCase(choice) == 'r') {

			return;

		}

	}

}
