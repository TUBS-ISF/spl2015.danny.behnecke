package statMeUp.mean;

import statMeUp.*;

public aspect mean {
		

	declare precedence: statMeUp.mean.meanIntro;
	after(Set t):target(t) && execution(Set.new(String  ,double[] )){
		t.setMean(t.getCalc().mean(t.getSet()));
	}
	
}