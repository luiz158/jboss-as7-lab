package examples;

import javax.inject.Inject;

public class MyBean {

	@Inject
	private MyAlternativeInterface alternative;

	public void printMessageOnConsole() {
		System.out.println(alternative.getMessage());
	}
}
