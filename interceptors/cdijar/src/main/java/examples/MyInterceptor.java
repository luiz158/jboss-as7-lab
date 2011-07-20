package examples;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@MyInterceptorBinding
public class MyInterceptor {
	
	@AroundInvoke
	public Object manage(final InvocationContext ic) throws Exception {
		System.out.println("This is an interception.");
		return ic.proceed();
	}

}
