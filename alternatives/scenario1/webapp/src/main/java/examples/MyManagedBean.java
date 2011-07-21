package examples;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class MyManagedBean {

	@Inject
	private MyBean bean;  
	
	public void action(){
		bean.printMessageOnConsole();
	}
}
