package rmiService.organization;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.organizationdataservice.FinanceOrgDataSer;

public class FinanceOrgDataSerImpl extends UnicastRemoteObject implements FinanceOrgDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -2675461398567508092L;

	public FinanceOrgDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public String[] find() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean insert(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean delete(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

}
