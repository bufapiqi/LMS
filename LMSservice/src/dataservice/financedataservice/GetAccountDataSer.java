package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.financePO.*;

public interface GetAccountDataSer extends Remote{
	
	
	/**
	 * ϵͳ����һ���־û����󼯺ϣ��˻���
	 * �����˻���ѯ
	 * @author YangGuan
	 *
	 */
	public ArrayList<AccountPO> getAccount() throws RemoteException;
}
