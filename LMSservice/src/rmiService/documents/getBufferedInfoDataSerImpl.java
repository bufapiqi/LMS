package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.documentsPO.DocumentPO;
import dataservice.documentsdataservice.getBufferedInfoDataSer;

public class getBufferedInfoDataSerImpl extends UnicastRemoteObject implements getBufferedInfoDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 9064602574450436617L;

	public getBufferedInfoDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public DocumentPO getBufferedInfo(String code, String doName) {
		// TODO �Զ����ɵķ������
		sql="select";
		return null;
	}



}
