package rmiService.organization;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.orgPO.MiddleOrgPO;
import dataservice.organizationdataservice.MiddleOrgDataSer;

public class MiddleOrgDataSerImpl extends UnicastRemoteObject implements MiddleOrgDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -7743528877522797224L;

	public MiddleOrgDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public String[] getBussinessmanList() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean addBussinessman(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeBussinessman(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String[] getStorgerList() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean addStorger(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeStorger(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String[] getBussinessHallList() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public String GetInfo() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean changeCity(String city) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean addMiddleOrg(MiddleOrgPO po) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeMiddleOrg(String codeNumber) {
		// TODO �Զ����ɵķ������
		return false;
	}

}
