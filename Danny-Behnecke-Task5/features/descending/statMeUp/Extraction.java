/*
 * 
 */
package statMeUp;

/**
 * 
 */

import java.util.Arrays;
import java.util.Comparator;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

/**
 * The Class Extraction.
 *
 * @author Danny Behnecke
 */
public class Extraction {

	public double[] sort(double[] dataset) {



		Comparator cmp = java.util.Collections.reverseOrder();
		Arrays.sort(dataset, cmp);

		return dataset;

	}

}
