package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.financePO.*;

public interface StorageProDataSer extends Remote{
	
	/**
	 * ϵͳ�־û�����ɱ������¼
	 * @author YangGuan
	 *
	 */
	public void setCostRecords(ProfitPO po) throws RemoteException;
}
