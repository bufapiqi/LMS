package dataservice.storagedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GetCountDataSer extends Remote{
	
	/**
	 * ϵͳ���ص�ǰ�ֿ⵱ǰʱ���Ŀ�������ϼ�
	 * ���������ѯ
	 * @author YangGuan
	 *
	 */
	public int getCount() throws RemoteException;
}
