package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.financePO.BooksPO;

public interface StorageBooksDataSer extends Remote{
	
	
	/**
	 * ϵͳ�洢һ���־û������˱���
	 * @author YangGuan
	 *
	 */
	public void stoBooks(BooksPO book) throws RemoteException;
}
