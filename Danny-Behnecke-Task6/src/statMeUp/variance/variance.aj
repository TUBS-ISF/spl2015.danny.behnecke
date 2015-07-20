package statMeUp.variance;

import statMeUp.Set;

public aspect variance {
	declare precedence: statMeUp.variance.varianceIntro,statMeUp.mean.mean;
after(Set t):target(t) &&execution(Set.new(String  ,double[] )){
	


	t.setVariance(t.getCalc().variance(t.getSet()));
}
}