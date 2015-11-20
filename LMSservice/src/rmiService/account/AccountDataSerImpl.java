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
		// TODO 自动生成的构造函数存根
	}
	@Override
	public String campare(long ID, String password) {
		// TODO 自动生成的方法存根
		sql="SELECT 帐号.ID, 帐号.password,...  from 帐号 where ID="+ID;//确定帐号的信息
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
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean update(long ID, AccountInfoPO po) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean delete(long ID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public AccountInfoPO find(long ID) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String[] find(String name) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String[] find() {
		// TODO 自动生成的方法存根
		return null;
	}

}
