package statMeUp.median;
	import java.util.Arrays;

import statMeUp.*;

public aspect medianIntro {


		public double Set.median = 0;
		
		public void Set.setMedian(double med){
			median = med;
		}
		public double Set.getMedian(){
			return median;
		}
		

			/**
			 * Median.
			 *
			 * @param dataset
			 *            the dataset
			 * @return the double
			 */
			public double Extraction.median(double[] dataset) {

				double[] sortSet = dataset;
				Arrays.sort(sortSet);

				if (sortSet.length % 2 == 0) {
					return (sortSet[(sortSet.length / 2) - 1] + sortSet[sortSet.length / 2]) / 2.0;
				} else {
					return sortSet[sortSet.length / 2];
				}

			}
		
}
