package statMeUp;

public class uniformPluginSet implements ICreateSet {

	@Override
	public double[] getSet(double min, double max, int size, double seed) {
		variable pluginContainer =new randomPluginUniform();
		
	
		double[] vars = new double[size];
		for(int i=0;i<size;i++){
			vars[i] = pluginContainer.getRandom(min, max, seed);
		}
		

		return vars;
	}

}
