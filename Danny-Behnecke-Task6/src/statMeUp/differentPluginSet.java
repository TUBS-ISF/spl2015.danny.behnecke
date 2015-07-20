package statMeUp;

public class differentPluginSet implements ICreateSet {

	@Override
	public double[] getSet(double min, double max, int size, double seed) {
variable pluginContainerA =new randomPluginUniform();
variable pluginCointainerB = new randomPluginExponential();
		
		
		double[] vars = new double[size];
		for(int i=0;i<size;i++){
			
			if(i%2 == 0){
			vars[i] = pluginContainerA.getRandom(min, max, seed);
			}
			else{
				vars[i] = pluginCointainerB.getRandom(min, max, seed);
			}
		}
		

		
		return vars;
	}

}
