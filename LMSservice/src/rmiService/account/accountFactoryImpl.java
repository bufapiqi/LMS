package rmiService.account;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.accountdataservice.AccountDataSer;
import dataservice.accountdataservice.accountFactory;

public class accountFactoryImpl extends UnicastRemoteObject implements accountFactory{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7439411849541497538L;

	public accountFactoryImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public AccountDataSer createAccountDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return null;
	}

}
