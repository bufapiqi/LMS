package rmiService.storage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.storagePO.DepotPO;
import dataservice.storagedataservice.GetDepotDataSer;

public class GetDepotDataSerImpl extends UnicastRemoteObject implements GetDepotDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -9159493132460553460L;

	public GetDepotDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public DepotPO getDepot()  throws RemoteException{
		// TODO �Զ����ɵķ������
		return null;
	}

}
