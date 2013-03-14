package listeners;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class SwordfishInitializer implements ServletContainerInitializer
{
	static
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~===============SampleContainerListenerInApp class Loaded  [VERSION-1.0]=============");
	}


	public void onStartup(Set<Class<?>> arg0, ServletContext arg1) throws ServletException
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*** CONTAINER INITIALIZER IN APP! ***");
	}
}
