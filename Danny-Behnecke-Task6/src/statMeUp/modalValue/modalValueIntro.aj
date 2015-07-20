package statMeUp.modalValue;
import statMeUp.*;

import java.util.Arrays;

public aspect modalValueIntro {
	public double Set.modalValue = 0;
	
	public void Set.setModalValue(double mv){
		modalValue = mv;
	}
	public double Set.getModalValue(){
		return modalValue;
	}
	
	/**
	 * Modal.
	 *
	 * @param dataset
	 *            the dataset
	 * @return the double
	 */
	public double Extraction.modal(double[] set) {
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
