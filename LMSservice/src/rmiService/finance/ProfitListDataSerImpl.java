package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.financePO.ProfitPO;
import dataservice.financedataservice.ProfitListDataSer;

public class ProfitListDataSerImpl extends UnicastRemoteObject implements ProfitListDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 2210372149181793909L;

	public ProfitListDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public ArrayList<ProfitPO> ProList(String date)  throws RemoteException{
		// TODO �Զ����ɵķ������
		return null;
	}

}
