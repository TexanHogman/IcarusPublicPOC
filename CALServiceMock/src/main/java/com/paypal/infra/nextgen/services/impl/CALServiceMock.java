package com.paypal.infra.nextgen.services.impl;

import com.paypal.infra.nextgen.services.api.CALService;

public class CALServiceMock implements CALService
{
	static
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~++++++++++++ CALServiceMock class Loaded  [VERSION-1.0]");
	}

	@Override
	public void event(String name)
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~++++++++++++ CAL Event: " + name);
	}

	@Override
	public void startTransaction(String name)
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~++++++++++++ CAL start transaction: " + name);
	}

	@Override
	public void endTransaction(String name)
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~++++++++++++ CAL end transaction: " + name);
	}
}
