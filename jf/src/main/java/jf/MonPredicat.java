package jf;

import org.apache.commons.collections.Predicate;

public class MonPredicat implements Predicate {

	@Override
	public boolean evaluate(Object arg0) {
		try{
			return Integer.parseInt((String) arg0) < 50;
		}
		catch(java.lang.NumberFormatException e){
			return false;
		}
	}

}
