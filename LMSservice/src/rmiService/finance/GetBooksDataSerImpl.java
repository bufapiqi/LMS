package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.financePO.BooksPO;
import dataservice.financedataservice.GetBooksDataSer;

public class GetBooksDataSerImpl extends UnicastRemoteObject implements GetBooksDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -1237461001825577424L;

	public GetBooksDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public BooksPO Books(String year)  throws RemoteException{
		// TODO �Զ����ɵķ������
		return null;
	}
	
}
