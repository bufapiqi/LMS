package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.financePO.*;

public interface CoverDataSer extends Remote{
	
	
	/**
	 * ϵͳ���������־û����󼯺�
	 * ���˻�����ɾ���ġ���ʼ��������ɺ�
	 * @author YangGuan
	 *
	 */
	public void coverAccount(ArrayList<AccountPO> po) throws RemoteException;
}
