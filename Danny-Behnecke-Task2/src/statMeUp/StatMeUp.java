package statMeUp;

import java.util.Scanner;
/**
 * 
 */

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
		
		while(true){
			
			mainMenu();
		}

	}
	
	public static void mainMenu(){
		char choice;
		System.out.println("---StatMeUp ---");
		System.out.println("---Main Menu ---");
		System.out.println("Current set:" + current.getName() +  "\n\n");
		System.out.println("Select an option: \n");
		System.out.println("-[L]oad a Set from JSON\n");
		
		if(config.ADHOC)System.out.println("- [R]ead-In a Set\n");
		
		System.out.println("- Information [E]xtraction");
		if(config.CREATION)System.out.println("- [C]reate a Variable");
		System.out.println("[Q]uit StatMeUp");
		
		//TODO change to java 1.5
		choice = input.next().charAt(0);
		
		switch(choice){
		
		case 'q': System.exit(1);
		break;
		
		case 'l': loadContext();
		break;
		}
	}
	
	public static void loadContext(){
		System.out.println("Please type the path to the desired JSON file");
		String path = input.next();
		loadSet ILoad = new loadJSON();
		current = ILoad.load(path);//TODO wrap try/catch around
		return;
	}

}
