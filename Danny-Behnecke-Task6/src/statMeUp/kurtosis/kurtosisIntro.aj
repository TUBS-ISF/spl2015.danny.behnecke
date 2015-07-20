package statMeUp.kurtosis;

import statMeUp.*;


public aspect kurtosisIntro {

	public double Set.kurtosis = 0;
	
	public void Set.setKurtosis(double kur){
		kurtosis = kur;
	}
	public double Set.getKurtosis(){
		return kurtosis;
	}
	

		public double Extraction.kurtosis(double[] dataset) {

			double result=0;
			int size = dataset.length;
			double mean = mean(dataset);
			double sd = standardDeviation(dataset);
			for(int i=0;i<size;i++){
				result +=Math.pow(((dataset[i]-mean)/sd),4);
			}
			
			return result/size;
			
		
		}

		
}
