package rmiService.storage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.storagedataservice.ReturnSpaceDataSer;

public class ReturnSpaceDataSerImpl extends UnicastRemoteObject implements ReturnSpaceDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 7725685187189213273L;

	public ReturnSpaceDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void reSpace(int space)  throws RemoteException{
		// TODO �Զ����ɵķ������
		
	}

}
