package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.documentsPO.DocumentPO;
import dataservice.documentsdataservice.getDocumentInfoDataSer;

public class getDocumentInfoDataSerImpl extends UnicastRemoteObject implements getDocumentInfoDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -3394892968255679797L;

	public  getDocumentInfoDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public DocumentPO getDocumentInfo(String code, String doName) {
		// TODO �Զ����ɵķ������
		return null;
	}



}
