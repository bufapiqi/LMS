package dataservice.storagedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UsedSpaceDataSer extends Remote{
	/**
	 * �õ������������ÿռ��С
	 * ����������������
	 * @author YangGuan
	 *
	 */
	public int[] getUsedSpace() throws RemoteException;
	
	/**
	 * �õ����������ܿռ��С
	 * ����������������
	 * @author YangGuan
	 *
	 */
	public int[] getAllSpace() throws RemoteException;
}
