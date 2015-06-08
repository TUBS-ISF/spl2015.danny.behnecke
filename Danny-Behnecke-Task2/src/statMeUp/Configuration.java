package statMeUp;

public class Configuration {
	public static boolean JSON = false;
	public static boolean CREATION = false;
	public static boolean SET = false;
	public static boolean VISUALIZATION = false;
	public static boolean ADHOC = false;
	public static boolean SAVE = false;
	public static boolean IMAGE = false;// TODO implement image readin
	public static String DEFAULT_SAVE_PATH = "D:";
	public static boolean MODAL = false;

	Configuration(String[] params) {

		for (int i = 0; i < params.length; i++) {
			if (params[i].length() > 1)
				continue;

			if (Character.toLowerCase(params[i].charAt(0)) == 'h') {
				printHelp();
			}
			if (Character.toLowerCase(params[i].charAt(0)) == 'c') {
				setCREATION(true);
			}
			if (Character.toLowerCase(params[i].charAt(0)) == 'j') {
				setJSON(true);
			}
			if (Character.toLowerCase(params[i].charAt(0)) == 't') {
				setSET(true);
			}
			if (Character.toLowerCase(params[i].charAt(0)) == 'z') {
				setVISUALIZATION(true);

			}
			if (Character.toLowerCase(params[i].charAt(0)) == 'a') {
				setADHOC(true);
			}
			if (Character.toLowerCase(params[i].charAt(0)) == 's') {
				setSAVE(true);
			}
			if (Character.toLowerCase(params[i].charAt(0)) == 'i') {
				setIMAGE(true);
			}

		}
		

	}

	public void printHelp() {
		System.out.println("The following parameters are possible yet: \n"
				+ "[j] JSON \n" + "[c] CREATION\n" + "[t] SET\n");
		System.exit(1);
	}

	public static boolean isJSON() {
		return JSON;
	}

	public static void setJSON(boolean jSON) {
		JSON = jSON;
	}

	public static boolean isCREATION() {
		return CREATION;
	}

	public static void setCREATION(boolean cREATION) {
		CREATION = cREATION;
	}

	public static boolean isSET() {
		return SET;
	}

	public static void setSET(boolean sET) {
		SET = sET;
	}

	public static boolean isVISUALIZATION() {
		return VISUALIZATION;
	}

	public static void setVISUALIZATION(boolean vISUALIZATION) {
		VISUALIZATION = vISUALIZATION;
	}

	public static boolean isADHOC() {
		return ADHOC;
	}

	public static void setADHOC(boolean aDHOC) {
		ADHOC = aDHOC;
	}

	public static boolean isSAVE() {
		return SAVE;
	}

	public static void setSAVE(boolean sAVE) {
		SAVE = sAVE;
	}

	public static boolean isIMAGE() {
		return IMAGE;
	}

	public static void setIMAGE(boolean iMAGE) {
		IMAGE = iMAGE;
	}

	public static String getDEFAULT_SAVE_PATH() {
		return DEFAULT_SAVE_PATH;
	}

	public static void setDEFAULT_SAVE_PATH(String dEFAULT_SAVE_PATH) {
		DEFAULT_SAVE_PATH = dEFAULT_SAVE_PATH;
	}

	public static boolean isMODAL() {
		return MODAL;
	}

	public static void setMODAL(boolean mODAL) {
		MODAL = mODAL;
	}

}
