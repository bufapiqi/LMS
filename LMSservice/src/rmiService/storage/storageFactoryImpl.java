package rmiService.storage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.storagedataservice.Check_inventoryDataSer;
import dataservice.storagedataservice.GetCountDataSer;
import dataservice.storagedataservice.GetDepotDataSer;
import dataservice.storagedataservice.InDepotDataSer;
import dataservice.storagedataservice.ReturnSpaceDataSer;
import dataservice.storagedataservice.UpdateSpaceDataSer;
import dataservice.storagedataservice.UsedSpaceDataSer;
import dataservice.storagedataservice.storageFactory;

public class storageFactoryImpl extends UnicastRemoteObject implements storageFactory{
	/**
	 * 
	 */
	private static final long serialVersionUID = 656543013505655717L;

	public storageFactoryImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public Check_inventoryDataSer createCheck_inventoryDataSer()
			throws RemoteException {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public GetCountDataSer createGetCountDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public GetDepotDataSer createGetDepotDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public InDepotDataSer createInDepotDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public ReturnSpaceDataSer createReturnSpaceDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public UpdateSpaceDataSer createUpdateSpaceDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public UsedSpaceDataSer createUsedSpaceDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return null;
	}

}
