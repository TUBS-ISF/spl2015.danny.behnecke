package statMeUp;

import java.util.Arrays;


/**
 * The Class Set.
 */
/**
 * @author Danny Behnecke
 *
 */
public class Set {

/** The standard deviation. */
private double modal;

/**
 * Instantiates a new sets the.
 *
 * @param set the set
 */
public Set(String name,double[] set){
original();
	setModal(calc.modal(this.set));
}

/**
 * Gets the modal.
 *
 * @return the modal
 */
public double getModal() {
	return modal;
}


/**
 * Sets the modal.
 *
 * @param modal the new modal
 */
public void setModal(double modal) {
	this.modal = modal;
}




public String getAttributes(){
	String result=original();
	if(Configuration.isMODAL())result+="modal"+ getModal() +" | ";

	
	return result;
	
}

}
