package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.financePO.*;

public interface AddBooksDataSer extends Remote{
	
	/**
	 * ϵͳ��ӵ�һ�־û������˱���
	 * @author YangGuan
	 *
	 */
	public void addBooks(BooksPO po) throws RemoteException;
}
