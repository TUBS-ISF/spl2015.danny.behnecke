package statMeUp.modalValue;

import statMeUp.Set;

public aspect modalValue {
	declare precedence: modalValueIntro;
	after(Set t):target(t) && execution(Set.new(String  ,double[] )){
		
	
	
		t.setModalValue(t.getCalc().modal(t.getSet()));
	}
}