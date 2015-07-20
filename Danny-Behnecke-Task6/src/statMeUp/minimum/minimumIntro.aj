package statMeUp.minimum;
import statMeUp.*;

public aspect minimumIntro {
	
	public double Set.minimum =0;
	
	public void Set.setMinimum(double min){
		minimum = min;
	}
	/**
	 * */
	public double Set.getMinimum(){
		return minimum;
	}
	
	/**
	 * @param dataset
	 *            the dataset
	 * @return the minimum value from the set
	 * 
	 * */
	public double Extraction.getMin(double[] dataset) {

		double result = 0;

		for (int i = 0; i < dataset.length; i++) {

			if (dataset[i] <= result) {
				result = dataset[i];
			}

		}

		return result;
	}
}
