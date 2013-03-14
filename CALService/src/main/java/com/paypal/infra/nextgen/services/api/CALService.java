package com.paypal.infra.nextgen.services.api;

public interface CALService
{
	public void event(String name);
	public void startTransaction(String name);
	public void endTransaction(String name);
}
