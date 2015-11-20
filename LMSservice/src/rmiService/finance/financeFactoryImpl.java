package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.financedataservice.AddBooksDataSer;
import dataservice.financedataservice.CoverDataSer;
import dataservice.financedataservice.GetAccountDataSer;
import dataservice.financedataservice.GetAllPayDataSer;
import dataservice.financedataservice.GetBooksDataSer;
import dataservice.financedataservice.GetReceivablesBillsDataSer;
import dataservice.financedataservice.ProfitListDataSer;
import dataservice.financedataservice.StorageBooksDataSer;
import dataservice.financedataservice.StorageProDataSer;
import dataservice.financedataservice.financeFactory;

public class financeFactoryImpl extends UnicastRemoteObject implements financeFactory{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2201180716605599456L;

	public financeFactoryImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public AddBooksDataSer createAddBooksDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		
		return new AddBooksDataSerImpl();
	}

	@Override
	public CoverDataSer createCoverDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return new CoverDataSerImpl();
	}

	@Override
	public GetAccountDataSer createGetAccountDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return new GetAccountDataSerImpl();
	}

	@Override
	public GetAllPayDataSer createGetAllPayDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return new GetAllPayDataSerImpl();
	}

	@Override
	public GetBooksDataSer createGetBooksDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return new GetBooksDataSerImpl();
	}

	@Override
	public GetReceivablesBillsDataSer createGetReceivablesBillsDataSer()
			throws RemoteException {
		// TODO �Զ����ɵķ������
		return new GetReceivablesBillsDataSerImpl();
	}

	@Override
	public ProfitListDataSer createProfitListDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return new ProfitListDataSerImpl();
	}

	@Override
	public StorageBooksDataSer createStorageBooksDataSer()
			throws RemoteException {
		// TODO �Զ����ɵķ������
		return new StorageBooksDataSerImpl();
	}

	@Override
	public StorageProDataSer createStorageProDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return new StorageProDataSerImpl();
	}
	
}
