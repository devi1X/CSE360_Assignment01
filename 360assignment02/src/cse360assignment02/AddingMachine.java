
package cse360assignment02;
import java.util.*;
/*public class AddingMachine */
public class AddingMachine {
	public static void main(String [] args)
	{
		
	}
	/* variable total */
  private int total;
  StringBuffer history;
  /* construction */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = new StringBuffer("0");
  }
  /* get value of total*/
  public int getTotal () {
    return total;
  }
  /* add value to total */
  public void add (int value) {
	  total = total + value;
	  history.append(" + " + value);
  }
/* subtract a value from total */
  public void subtract (int value) {
	  total = total - value;
	  history.append(" - " + value);
  }
/* print out the result */
  public String toString () {
	  
	  
    return history.toString();
  }
/* clear total */
  public void clear() {
	  total = 0;
  }
}