package examples;

import javax.inject.Named;

@Named
public class MyBean {

	@MyInterceptorBinding
	public void method() {
		System.out.println("At this point, an interception should have occurred.");
	}

}
