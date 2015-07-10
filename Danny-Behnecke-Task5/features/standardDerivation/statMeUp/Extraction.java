package statMeUp;

import java.util.Arrays;
import java.util.Comparator;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

/**
 * The Class Extraction.
 *
 * @author Danny Behnecke
 */
public class Extraction {


	/**
	 * Standard deviation.
	 *
	 * @param dataset
	 *            the dataset
	 * @return the double
	 */
	public double standardDeviation(double[] dataset) {

		return Math.sqrt(variance(dataset));
	}

	

}
