package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.financePO.AccountPO;
import dataservice.financedataservice.CoverDataSer;

public class CoverDataSerImpl extends UnicastRemoteObject implements CoverDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 8859049058295725046L;

	public CoverDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void coverAccount(ArrayList<AccountPO> po)  throws RemoteException {
		// TODO �Զ����ɵķ������
		System.out.println("�Ѿ����������");
		ArrayList<AccountPO> pp = po;
		for(AccountPO account:pp){
			System.out.print(account.getName()+"  "+account.getSums());
			System.out.println();
		}
	}

}
