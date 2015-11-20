package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dataservice.documentsdataservice.getBufferedCodeDataSer;

public class getBufferedCodeDataSerImpl extends UnicastRemoteObject implements getBufferedCodeDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 4403021728875475304L;

	public getBufferedCodeDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public ArrayList<String> getCode() {
		// TODO �Զ����ɵķ������
		ArrayList<String> arrayList=new ArrayList<String>();
		sql="select code,doname from b���ⵥ";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(1)+","+resultSet.getString(2));
			}
			sql="select code,doname from b���";
			 preparedStatement=connection.prepareStatement(sql);
			 resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(1)+","+resultSet.getString(2));
			}
			sql="select code,doname from b�ļ���";
			 preparedStatement=connection.prepareStatement(sql);
			 resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(1)+","+resultSet.getString(2));
			}
			sql="select code,doname from b�ɼ���";
			 preparedStatement=connection.prepareStatement(sql);
			 resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(1)+","+resultSet.getString(2));
			}
			sql="select code,doname from b��ⵥ";
			 preparedStatement=connection.prepareStatement(sql);
			 resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(1)+","+resultSet.getString(2));
			}
			sql="select code,doname from b�ռ���";
			 preparedStatement=connection.prepareStatement(sql);
			 resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(1)+","+resultSet.getString(2));
			}
			sql="select code,doname from b�տ";
			 preparedStatement=connection.prepareStatement(sql);
			 resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(1)+","+resultSet.getString(2));
			}
			sql="select code,doname from bӪҵ�����յ�";
			 preparedStatement=connection.prepareStatement(sql);
			 resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(1)+","+resultSet.getString(2));
			}
			sql="select code,doname from bӪҵ��װ����";
			 preparedStatement=connection.prepareStatement(sql);
			 resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(1)+","+resultSet.getString(2));
			}
			sql="select code,doname from b��ת���Ľ��յ�";
			 preparedStatement=connection.prepareStatement(sql);
			 resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(1)+","+resultSet.getString(2));
			}
			sql="select code,doname from b��ת����ת�˵�";
			 preparedStatement=connection.prepareStatement(sql);
			 resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(1)+","+resultSet.getString(2));
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



}
