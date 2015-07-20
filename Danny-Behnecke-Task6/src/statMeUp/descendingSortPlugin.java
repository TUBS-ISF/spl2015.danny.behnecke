package statMeUp;

import java.util.Arrays;

public class descendingSortPlugin implements ISort {

	@Override
	public void sortSet(Set set) {
			double[] temp = set.getSet();
			
			Arrays.sort(temp);
			
			
			for(int i = 0; i < temp.length / 2; i++)
			{
			    double temp1 = temp[i];
			    temp[i] = temp[temp.length - i - 1];
			    temp[temp.length - i - 1] = temp1;
			}
			
			
			
			set.setSet(temp);
			

		}

	}
