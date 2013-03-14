package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/ecv" })
public class ECVServletViaService extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
//	static
//	{
//		ServiceLoader<MayflyService> services = ServiceLoader.load(MayflyService.class);
//		Iterator<MayflyService> iter = services.iterator();
//	
//		// load the first Configuration implementation found on the classpath
//		if (iter.hasNext())
//			conversationService = iter.next();
//	}
	

	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ECVServletViaService()
	{
		super();
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.getWriter().println("STATUS: ONLINE");
	}

}
