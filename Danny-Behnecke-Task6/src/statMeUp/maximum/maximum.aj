package statMeUp.maximum;

import statMeUp.*;

public aspect maximum {

	declare precedence: statMeUp.maximum.maximumIntro;
	after(Set t):target(t) && execution(Set.new(String  ,double[] )){
		
	
	
		t.setMedian(t.getCalc().median(t.getSet()));
	}
}