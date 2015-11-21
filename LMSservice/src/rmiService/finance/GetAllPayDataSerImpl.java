package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
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
		// TODO 自动生成的构造函数存根
	}


	@Override
	public ArrayList<PaymentPO> getAllPay(String start, String end)  throws RemoteException{
		// TODO 自动生成的方法存根
		
		return null;
	}



	@Override
	public ArrayList<PaymentPO> getPay(String date) throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}
	
}
