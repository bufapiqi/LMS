package rmiService.account;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;

import po.accountPO.AccountInfoPO;
import dataservice.accountdataservice.AccountDataSer;

public class AccountDataSerImpl extends UnicastRemoteObject implements AccountDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	//a
	private static final long serialVersionUID = -5539066964489916937L;

	public AccountDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	@Override
	public String campare(long ID, String password) {
		// TODO �Զ����ɵķ������
		sql="SELECT �ʺ�.ID, �ʺ�.password,...  from �ʺ� where ID="+ID;//ȷ���ʺŵ���Ϣ
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insert(long ID, AccountInfoPO po) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean update(long ID, AccountInfoPO po) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean delete(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public AccountInfoPO find(long ID) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public String[] find(String name) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public String[] find() {
		// TODO �Զ����ɵķ������
		return null;
	}

}
