package rmiService.storage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.storagedataservice.GetCountDataSer;

public class GetCountDataSerImpl extends UnicastRemoteObject implements GetCountDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -1373268748225869690L;

	public GetCountDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public int getCount()  throws RemoteException{
		// TODO �Զ����ɵķ������
		return 0;
	}

}
