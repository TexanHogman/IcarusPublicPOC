package servlets;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

import javax.inject.Inject;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.paypal.infra.nextgen.services.api.MayflyService;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet(urlPatterns = { "/async" }, asyncSupported = true)
public class AsyncDemoServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	private @Inject	MayflyService mayflyService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AsyncDemoServlet()
	{
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		ThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);
		AsyncContext aCtx = request.startAsync();
		executor.execute(new AsyncWebService(aCtx));
	}

	public class AsyncWebService implements Runnable
	{
		AsyncContext ctx;

		public AsyncWebService(AsyncContext ctx)
		{
			this.ctx = ctx;
		}

		public void run()
		{
			Random random = new Random();
			try
			{
				Thread.sleep(random.nextInt(5000));
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ctx.dispatch("/render.jsp");
		}
	}
}
