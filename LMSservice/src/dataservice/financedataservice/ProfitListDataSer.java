package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.financePO.*;

public interface ProfitListDataSer extends Remote{
	
	/**
	 *ϵͳ���������ʱ�䷵��һ���־û����󼯺ϣ��ɱ������¼)
	 *���ڳɱ������
	 * @author YangGuan
	 *
	 */
	public ArrayList<ProfitPO> ProList(String date) throws RemoteException;
}
