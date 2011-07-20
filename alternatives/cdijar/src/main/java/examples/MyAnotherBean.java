package examples;

import javax.inject.Inject;

public class MyAnotherBean {

	@Inject
	private MyAlternativeInterface alternative;

	public void doSomething() {
		System.out.println(alternative.getString());
	}
}
