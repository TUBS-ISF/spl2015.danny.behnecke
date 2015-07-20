package statMeUp.standardDeviation;
import statMeUp.*;

public aspect standardDevIntro {
public double Set.standardDeviation = 0;
	
	public void Set.setStandardDeviation(double sd){
		standardDeviation = sd;
	}
	public double Set.getStandardDeviation(){
		return standardDeviation;
	}
	
	declare precedence: statMeUp.variance.variance, statMeUp.variance.varianceIntro;
	/**
	 * Standard deviation.
	 *
	 * @param dataset
	 *            the dataset
	 * @return the double
	 */
	public double Extraction.standardDeviation(double[] dataset) {

		return Math.sqrt(variance(dataset));
	}
}
