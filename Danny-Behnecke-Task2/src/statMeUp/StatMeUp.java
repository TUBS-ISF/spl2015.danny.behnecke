package statMeUp;

import java.util.Arrays;
import java.util.Scanner;

//antenna defines
//std defs [Work In Progress]


//#define TERMINAl
//#define VIZUALISATION 
//#define SET



/**
 * @author Danny Behnecke
 *
 */
public class StatMeUp {

	private static Scanner input = new Scanner(System.in);
	private static Set current = new Set();
	private static Configuration config;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		config = new Configuration(args);

		while (true) {

			mainMenu();
		}

	}

	public static void mainMenu() {
		char choice;
		System.out.println("---StatMeUp ---");
		System.out.println("---Main Menu ---");
		System.out.println("Current set:" + current.getName() + "\n\n");
		System.out.println("Select an option: \n");
		System.out.println("-[L]oad a Set from JSON\n");

		if (Configuration.ADHOC)
			System.out.println("- [R]ead-In a Set\n");

		System.out.println("- Information [E]xtraction");
		if (Configuration.CREATION)
			System.out.println("- [C]reate a Variable");
		System.out.println("[Q]uit StatMeUp");

		choice = input.next().charAt(0);

		if (Character.toLowerCase(choice) == 'q') {
			System.exit(1);
		}

		if (Character.toLowerCase(choice) == 'l') {
			loadContext();
		}

		if (Character.toLowerCase(choice) == 'c') {
			creationContext();
		}

		if (Character.toLowerCase(choice) == 'e') {
			extractionContext();
		}
		
		if (Character.toLowerCase(choice) == 'r') {
			adHocContext();
		}

	}

	public static void loadContext() {
		System.out.println("Please type the path to the desired JSON file");
		String path = input.next();
		loadSet ILoad = new loadJSON();
		current = ILoad.load(path);// TODO wrap try/catch around
		return;
	}

	public static void creationContext() {

		System.out.println("What do you want to create?\n");
		System.out.println("A [r]andom number\n");
			//#ifdef SET
			System.out.println("A [s]et of random numbers, distributed by...");
			//#endif
		char choice = input.next().charAt(0);

		if (Character.toLowerCase(choice) == 'r') {// TODO input type mismatch
													// should create loop ala
													// try again
			Creation c = new Creation();
			System.out.println("Please enter the lower limit for the number:");
			double rangeMin = input.nextDouble();
			System.out.println("Please enter the upper limit for the number:");
			double rangeMax = input.nextDouble();
			System.out.println(c.variable(rangeMin, rangeMax));
			return;
		}
		
		//#ifdef SET
			if (Character.toLowerCase(choice) == 's') {

				Creation c = new Creation();
				System.out
						.println("Please enter the lower limit for the number:");
				double rangeMin = input.nextDouble();

				System.out
						.println("Please enter the upper limit for the number:");
				double rangeMax = input.nextDouble();

				System.out.println("How big shall the set be?");
				int size = input.nextInt();
				double[] randomSet = new double[size];
				randomSet = c.set(rangeMin, rangeMax, size);

				System.out.println(Arrays.toString(randomSet));
				System.out
						.println("Do you want to analyze this set?([y]es /[n]o");
				choice = input.next().charAt(0);
				if (Character.toLowerCase(choice) == 'y') {
					System.out.println("Please name your set:");
					String name = input.next();
					Set n = new Set(name, randomSet);
					current = n;
					return;

				}
				if (Character.toLowerCase(choice) == 'n') {
					return;
				}
				return; // for guaranteed return

			}
			//#endif
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
		//#ifdef VIZUALISATION 
		if (Character.toLowerCase(choice) == 'v') {

			vizContext();

		}
		//#endif

		if (Character.toLowerCase(choice) == 'r') {

			return;

		}

	}

	public static void adHocContext() {

		Adhoc a = new Adhoc();
		double[] data = a.readIn(input);

		System.out.println("This is your set: " + Arrays.toString(data));
		System.out.println("Do you want to analyze this set?:([y]es/[n]o)");

		char choice = input.next().charAt(0);

		if (Character.toLowerCase(choice) == 'y') {
		System.out.println("Please name your set");
		String name = input.next();
		Set n = new Set(name, data);
		
		current = n;
		return;
		}

		if (Character.toLowerCase(choice) == 'n') {
			return; 
		}
	}
	
	public static void vizContext(){
		
	//#ifdef TERMINAL
//@		Terminal t = new Terminal();
	//#endif	
		System.out.println("Please select your vizualisation:");
		System.out.println("[t]able");
		System.out.println("[p]lot");
		System.out.println("[r]eturn");
		
		char choice = input.next().charAt(0);

		if (Character.toLowerCase(choice) == 'p') {

			t.plot2D(current);

		}
		
		if (Character.toLowerCase(choice) == 't') {

			System.out.println("dummy");

		}
		
		if (Character.toLowerCase(choice) == 'r') {

			return ;

		}
	}
}
