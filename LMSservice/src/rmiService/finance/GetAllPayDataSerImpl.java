package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import po.documentsPO.PaymentPO;
import dataservice.financedataservice.GetAllPayDataSer;

public class GetAllPayDataSerImpl extends UnicastRemoteObject implements GetAllPayDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -1800323976608159048L;

	public GetAllPayDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}


	@Override
	public ArrayList<PaymentPO> getAllPay(String start, String end)  throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="SELECT * from ��� where datediff(d,start, date)>0";
		ArrayList<PaymentPO> ArrPo = new ArrayList<PaymentPO>();
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				PaymentPO po = new PaymentPO(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getDouble(5), resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9));
				ArrPo.add(po);
			}
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return ArrPo;
	}



	@Override
	public ArrayList<PaymentPO> getPay(String date) throws RemoteException {
		// TODO �Զ����ɵķ������
		sql="SELECT * from ��� where datediff(d,start, date)>0";
		return null;
	}

	
}
