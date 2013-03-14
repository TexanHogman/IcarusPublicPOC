package com.paypal.infra.nextgen.services.impl;

import javax.inject.Inject;

import com.paypal.infra.nextgen.services.api.CALService;
import com.paypal.infra.nextgen.services.api.MayflyService;

public class MayflyServiceMock implements MayflyService
{
	private @Inject	CALService calService;

	private Object data;

	@Override
	public void setData(Object obj)
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~============ MayFlyServiceMock setData");
		
		try
		{
			calService.startTransaction("MayFlyServiceMock.setData");
			data = obj;
		}
		finally
		{
			calService.endTransaction("MayFlyServiceMock.setData");
		}
	}

	@Override
	public Object getData()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~============ MayFlyServiceMock getData");
		
		try
		{
			calService.startTransaction("MayFlyServiceMock.getData");
			return data;
		}
		finally
		{
			calService.endTransaction("MayFlyServiceMock.getData");
		}
	}

}
