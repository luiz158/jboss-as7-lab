package examples;

import javax.enterprise.inject.Alternative;

@Alternative
public class MyAlternative implements MyAlternativeInterface {

	@Override
	public String getMessage() {
		return "I'm the alternative!";
	}
}
