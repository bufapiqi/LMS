package rmiService.transportation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.transportationdataservice.TransportationDataSer;
import dataservice.transportationdataservice.TransportationFactory;

public class TransportationFactoryImpl extends UnicastRemoteObject implements TransportationFactory{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2352423704610340540L;

	public TransportationFactoryImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public TransportationDataSer createTransportationDataSer()
			throws RemoteException {
		// TODO �Զ����ɵķ������
		return null;
	}

}
