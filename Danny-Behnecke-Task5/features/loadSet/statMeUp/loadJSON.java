/**
 * 
 */
package statMeUp;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Danny Behnecke
 *
 */
public class loadJSON implements loadSet {

	/*
	 * (non-Javadoc)
	 * 
	 * @see statMeUp.loadSet#load(java.lang.String)
	 */
	@Override
	public Set load(String path) {
		Gson gson = new Gson();
		try{
			BufferedReader br = new BufferedReader(new FileReader(path));
			Set obj = gson.fromJson(br, Set.class); 
			return obj;
			
		} catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
}
