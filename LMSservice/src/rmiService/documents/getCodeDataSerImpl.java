package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dataservice.documentsdataservice.getCodeDataSer;

public class getCodeDataSerImpl extends UnicastRemoteObject implements getCodeDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 7578979922627164999L;

	public getCodeDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public ArrayList<String> getCode(String doName, String startTime,
			String endTime) {
		// TODO �Զ����ɵķ������
		return null;
	}

}
