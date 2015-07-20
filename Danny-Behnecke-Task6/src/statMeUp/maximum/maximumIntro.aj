package statMeUp.maximum;
import statMeUp.*;

public aspect maximumIntro {
	
	public double Set.maximum= 0;
	public void Set.setMaximum(double max){
		maximum = max;
	}
	
	public double Set.getMaximum(){
		return maximum;
	}
	
	/**
	 * @param dataset
	 *            the dataset
	 * @return the minimum value from the set
	 * 
	 * */
	public double Extraction.getMax(double[] dataset) {

		double result = 0;

		for (int i = 0; i < dataset.length; i++) {

			if (dataset[i] >= result) {
				result = dataset[i];
			}

		}

		return result;
	}
}
