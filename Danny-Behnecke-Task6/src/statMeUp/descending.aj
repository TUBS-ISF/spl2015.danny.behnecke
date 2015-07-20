package statMeUp;

import java.util.Arrays;
import java.util.Collections;



public aspect descending {
	public double[] Extraction.dSort(double[] dataset) {



			Arrays.sort(dataset, Collections.reverseOrder());
	

	return dataset;

	}
}