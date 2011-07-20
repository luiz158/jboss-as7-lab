package examples;

import javax.enterprise.inject.Alternative;

@Alternative
public class MySecondAlternative implements MyAlternativeInterface {

	@Override
	public String getString() {
		return "I'm the first alternative!";
	}
}
