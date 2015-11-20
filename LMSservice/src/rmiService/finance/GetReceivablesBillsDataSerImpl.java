package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.documentsPO.ReceiptPO;
import dataservice.financedataservice.GetReceivablesBillsDataSer;

public class GetReceivablesBillsDataSerImpl extends UnicastRemoteObject implements GetReceivablesBillsDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -3837846709835354119L;
	
	ArrayList<ReceiptPO> receiptList = new ArrayList();
	ArrayList<String> code = new ArrayList();
	String c1 = "02156401",c2="02156402",c3="02156403",c4="02156404";

	public GetReceivablesBillsDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public ArrayList<ReceiptPO> Receivables(String selling, String date)  throws RemoteException{
		// TODO �Զ����ɵķ������
		code.add(c1);
		code.add(c2);
		code.add(c3);
		code.add(c4);
		ReceiptPO r1 = new ReceiptPO("0000001","�տ","2015/05/06", "1213",25361, "�¶�ķ", code);
		ReceiptPO r2 = new ReceiptPO("0000002","�տ","2015/05/07", "1214",96841, "����ķ", code);
		ReceiptPO r3 = new ReceiptPO("0000003","�տ","2015/05/08", "1215",15675, "�ղ���", code);
		ReceiptPO r4 = new ReceiptPO("0000004","�տ","2015/05/09", "1216",58462, "������", code);
		receiptList.add(r1);
		receiptList.add(r2);
		receiptList.add(r3);
		receiptList.add(r4);
		
		return receiptList;
	}

	@Override
	public ArrayList<ReceiptPO> getReceivables(String selling, String date)  throws RemoteException{
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public ArrayList<ReceiptPO> getAllReceivables(String selling, String start,
			String end)  throws RemoteException{
		// TODO �Զ����ɵķ������
		return null;
	}
	
}
