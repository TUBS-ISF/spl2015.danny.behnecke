package statMeUp.mean;
import statMeUp.*;

public aspect meanIntro {
	/**
	 * Mean.
	 *
	 * @param dataset
	 *            the dataset
	 * @return the double
	 */
	public double Extraction.mean(double[] dataset) {
		double result = 0;

		for (int i = 0; i < dataset.length; i++) {

			result += dataset[i];
		}
		result /= dataset.length;

		return result;
	}	
		

	public double Set.mean =0;
	
	public void Set.setMean(double m){
		mean =m;
	}
	
	public double Set.getMean(){
		return mean;
	}
}
