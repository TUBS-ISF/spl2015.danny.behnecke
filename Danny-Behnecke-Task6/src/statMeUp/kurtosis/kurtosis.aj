package statMeUp.kurtosis;
import statMeUp.*;


public aspect kurtosis {
	declare precedence: statMeUp.standardDeviation.standardDerivation, statMeUp.mean.mean;
after(Set t):target(t) &&execution(Set.new(String  ,double[] )){
	


	t.setKurtosis(t.getCalc().kurtosis(t.getSet()));
}
}