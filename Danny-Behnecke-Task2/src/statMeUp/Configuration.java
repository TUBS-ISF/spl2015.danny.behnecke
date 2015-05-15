package statMeUp;

public class Configuration {
	public static boolean JSON = false;
	public static boolean CREATION = false;
	public static boolean SET = false;
	public static boolean VISUALIZATION = false;
	public static boolean ADHOC = false;
	public static boolean SAVE = false; //TODO implement save
	public static boolean IMAGE = false;//TODO implement image readin

	Configuration(String[] params) {

		for (int i = 0; i < params.length; i++) {
			if (params[i].length() > 1)
				continue;

			switch (params[i].charAt(0)) {//TODO change java 1.5

			case 'h':
				printHelp();
				break;

			case 'c':
				CREATION = true;
				break;

			case 'j':
				JSON = true;
				break;
			case 't':
				SET = true;
				break;
			case 'z':
				VISUALIZATION = true;
				break;
			case 'a':
				ADHOC = true;
				break;
			case 's':
				SAVE = true;
				break;
			case 'i':
				IMAGE = true;
				break;

			}

		}
	}

	public void printHelp() {
		System.out.println("The following parameters are possible: \n" +
							"[j] JSON \n" + "[c] CREATION\n"+ "[t] SET\n" + "[z] VISUALIZATION\n" + "[a] ADHOC\n" 
							);
		System.exit(1);
	}

}
