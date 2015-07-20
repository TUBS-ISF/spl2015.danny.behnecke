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

	












	public double[] sort(double[] dataset
	// #ifdef descending
//@			, boolean mode
	// #endif
	) {

		// #ifdef descending
//@		if (mode) {
//@			Comparator cmp = java.util.Collections.reverseOrder();
//@			Arrays.sort(dataset, cmp);
//@		} else {
//@			Arrays.sort(dataset);
//@
//@		}
		// #endif
		// #ifndef descending
		Arrays.sort(dataset);
		// #endif
		return dataset;

	}

}
