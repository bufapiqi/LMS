package dataservice.storagedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UpdateSpaceDataSer extends Remote{
	
	
	
	/**
	 * ����������¿����Ϣ
	 * ����ɷ�������
	 * @author YangGuan
	 *
	 */
	public void updateDrive(int shipping,int trains,int motor) throws RemoteException;
}
