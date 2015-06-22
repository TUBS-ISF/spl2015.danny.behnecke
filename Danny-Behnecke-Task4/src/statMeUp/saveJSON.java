/**
 * 
 */
package statMeUp;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;

/**
 * @author Danny
 *
 */
public class saveJSON implements saveSet {

	/* (non-Javadoc)
	 * @see statMeUp.saveSet#saveResult(statMeUp.Set)
	 */
	@Override
	public void saveResult(Set s) {
		Gson gson = new Gson();
		 
		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(s);
	 
		try {
			//write converted json data to a file named "file.json"
			FileWriter writer = new FileWriter(Configuration.DEFAULT_SAVE_PATH + "\" " + s.getName() +".json");
			writer.write(json);
			writer.close();
	 
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/* (non-Javadoc)
	 * @see statMeUp.saveSet#saveResult(statMeUp.Set, java.lang.String)
	 */
	@Override
	public void saveResult(Set s, String path) {
		
		Gson gson = new Gson();
	 
		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(s);
	 
		try {
			//write converted json data to a file named "file.json"
			FileWriter writer = new FileWriter(path);
			writer.write(json);
			writer.close();
	 
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
