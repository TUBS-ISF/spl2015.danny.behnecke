package statMeUp.standardDeviation;

import statMeUp.Set;

public aspect standardDerivation {
	declare precedence: statMeUp.standardDeviation.standardDevIntro,statMeUp.variance.varianceIntro,statMeUp.variance.variance;
after(Set t):target(t) &&execution(Set.new(String  ,double[] )){
	


	t.setStandardDeviation(t.getCalc().standardDeviation(t.getSet()));
}
}