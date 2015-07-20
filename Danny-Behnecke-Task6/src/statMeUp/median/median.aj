package statMeUp.median;

import statMeUp.Set;

public aspect median {
	
	declare precedence: medianIntro;
after(Set t):target(t) && execution(Set.new(String  ,double[] )){
	


	t.setMedian(t.getCalc().median(t.getSet()));
}
	
	
	
}