package statMeUp.minimum;

import statMeUp.*;

public aspect minimum {
	
	declare precedence: minimumIntro;
	after(Set t):target(t) && execution(Set.new(String  ,double[] )){
		
	
	
		t.setMinimum(t.getCalc().getMin(t.getSet()));
	}
	
}