package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.financePO.*;

public interface GetBooksDataSer extends Remote{
	
	/**
	 * ϵͳ�����������ݷ��ص�һ�־û������˱���
	 * �����ڳ�����
	 * @author YangGuan
	 *
	 */
	public BooksPO Books(String year) throws RemoteException;
}
