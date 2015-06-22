package statMeUp;

import java.util.Arrays;

public class ascendingSortPlugin implements ISort {

	@Override
	public void sortSet(Set set) {
		double[] temp = set.getSet();
		
		Arrays.sort(temp);
		set.setSet(temp);
		

	}

}
