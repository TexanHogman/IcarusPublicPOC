package servlets;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.paypal.infra.nextgen.services.api.MayflyService;


@WebServlet({ "/sendmoney" })
public class SendMoneyServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private @Inject	MayflyService mayflyService;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SendMoneyServlet()
	{
		super();
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		mayflyService.setData("5000");
		response.getWriter().println("$5000, payment sent to: RICK");
	}

}
