package rmiService.storage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.storagedataservice.UpdateSpaceDataSer;

public class UpdateSpaceDataSerImpl extends UnicastRemoteObject implements UpdateSpaceDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 3234821361500843438L;

	public UpdateSpaceDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void updateDrive(int shipping, int trains, int motor)  throws RemoteException{
		// TODO �Զ����ɵķ������
		
	}

}
