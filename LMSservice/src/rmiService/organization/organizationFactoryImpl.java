package rmiService.organization;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.organizationdataservice.BussinessOrgDataSer;
import dataservice.organizationdataservice.FinanceOrgDataSer;
import dataservice.organizationdataservice.MiddleOrgDataSer;
import dataservice.organizationdataservice.organizationFactory;

public class organizationFactoryImpl extends UnicastRemoteObject implements organizationFactory{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2039095476184426122L;

	public organizationFactoryImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public BussinessOrgDataSer createBussinessOrgDataSer()
			throws RemoteException {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public FinanceOrgDataSer createFinanceOrgDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public MiddleOrgDataSer createMiddleOrgDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return null;
	}

}
