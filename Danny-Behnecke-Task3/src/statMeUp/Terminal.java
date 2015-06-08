package statMeUp;

public class Terminal implements Visualization {

	public void plot2D(Set s) {//@TODO fix out of bounds
		String[][] plot = new String[s.getSet().length][(int) s.getMaximum()];
		for (int i = 0; i < s.getSet().length; i++) {

			for (int j = 0; j < (int) s.getSet()[i]; j++) {
				plot[i][j] = ".";

			}
		}

		String result="";
		System.out.println("aussen:" + plot.length);
		for (int j = (int) s.getMaximum(); j >=0 ; j--) {

			for (int i = 0; i < s.getSet().length; i++) {
				System.out.println("innen: " +plot[j].length);
				
				
				try{
				String test = plot[j][i];
				} catch(ArrayIndexOutOfBoundsException e){
						
						System.out.println("index i | index j| length" + "[ " +i + " | " + j +" | "+ plot.length );
					}
				if(plot[i][j]!=null){
					
					result += ".";
					
					
				}
				else{
					result += " ";
				}
				
			}
			
			result += "\n";

		}
		
		System.out.println(plot);

	}

	public void table(Set s) {

	}

}


