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

	/**
	 * Modal.
	 *
	 * @param dataset
	 *            the dataset
	 * @return the double
	 */
	public double modal(double[] set) {
		double[] dataset = set;
		double modal = 0;
		double mfreq = 0;
		for (double i : dataset) {
			// Is this value the most frequent we've found so far?
			int freq = 0;
			for (double j : dataset) {
				if (j == i) {
					freq++;
				}
			}
			if (freq > mfreq) {
				modal = i;
				mfreq = freq;
			}
		}
		return modal;

	}

}
