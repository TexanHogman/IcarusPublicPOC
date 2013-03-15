package webservice;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "webservice.ECVRemote", serviceName = "ECVWS")
public class ECVImpl implements ECVRemote
{
	@WebMethod
	public String check()
	{
		return "STATUS: ONLINE";
	}
}