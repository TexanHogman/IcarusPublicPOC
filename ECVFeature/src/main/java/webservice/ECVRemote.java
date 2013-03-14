package webservice;

import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Remote
@WebService
public interface ECVRemote
{
	@WebMethod
	public String check();
}