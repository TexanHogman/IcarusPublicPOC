package listeners;

import java.util.Set;

import javax.inject.Inject;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import com.paypal.infra.nextgen.services.api.CALService;

public class SwordfishInitializer implements ServletContainerInitializer
{
	private @Inject	CALService cal;
	
	public void onStartup(Set<Class<?>> arg0, ServletContext arg1) throws ServletException
	{
		cal.event("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*** CONTAINER INITIALIZER IN APP! ***");
	}
}
