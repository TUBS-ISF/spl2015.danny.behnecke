package statMeUp;


import java.util.Arrays;

public aspect ascending {
	public double[] Extraction.aSort(double[] dataset) {


		Arrays.sort(dataset);

		return dataset;

	}
}