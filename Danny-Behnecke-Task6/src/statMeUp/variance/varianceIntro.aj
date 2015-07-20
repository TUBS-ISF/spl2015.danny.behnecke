package statMeUp.variance;
import statMeUp.*;

public aspect varianceIntro {

	
	public double Set.variance= 0;
	public void Set.setVariance(double var){
		variance = var;
	}
	
	public double Set.getVariance(){
		return variance;
	}
	
	/**
	 * Variance.
	 *
	 * @param dataset
	 *            the dataset
	 * @return the double
	 */
	public double Extraction.variance(double[] dataset) {

		double degreeOfFreedom = dataset.length;
		double var = 0;
		double mean = mean(dataset);

		for (int i = 0; i < dataset.length; i++) {
			var += Math.pow(dataset[i] - mean, 2);
		}

		var /= degreeOfFreedom;

		return var;
	}
}
