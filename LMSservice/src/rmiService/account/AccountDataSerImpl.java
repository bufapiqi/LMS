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
	private static final long serialVersionUID = -5539066964489916937L;

	public AccountDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	@Override
	public String campare(long ID, String password) {
		// TODO �Զ����ɵķ������
		sql="SELECT state  from �ʺű� where ID="+ID+" and password="+password;//ȷ���ʺŵ���Ϣ
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			if (resultSet.next()) {
				return resultSet.getString(4);
			}
			else {
				return null;
			}
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
		sql="insert into �ʺű�(ID,password,name,state,phone,sID,date) values ("+po.getID()+","+po.getPassword()+","+po.getName()+","+po.getState()+","+po.getPhone()+","+po.getsID()+","+po.getDate()+")";//ȷ���ʺŵ���Ϣ
		
			try {
				Class.forName(DRIVER);
				Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement preparedStatement=connection.prepareStatement(sql);	
				return true;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		
	}

	@Override
	public boolean update(long ID, AccountInfoPO po) {
		// TODO �Զ����ɵķ������
		sql="update �ʺű� set password="+po.getPassword()+",name="+po.getName()+",state="+po.getState()+",phone="+po.getPhone()+",sID="+po.getsID()+",date="+po.getDate()+" where ID="+ID;//ȷ���ʺŵ���Ϣ

		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(long ID) {
		// TODO �Զ����ɵķ������
		sql="delete from �ʺű� where ID="+ID;//ȷ���ʺŵ���Ϣ
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return false;
	}

	@Override
	public AccountInfoPO find(long ID) {
		// TODO �Զ����ɵķ������
		sql="SELECT * from �ʺű� where ID="+ID;//ȷ���ʺŵ���Ϣ
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			
			return new AccountInfoPO(resultSet.getString(3), resultSet.getString(1), resultSet.getString(2), resultSet.getString(4),resultSet.getString(5) ,resultSet.getString(6), resultSet.getString(7));
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
