package dataservice.storagedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.documentsPO.*;

public interface Check_inventoryDataSer extends Remote{
	
	
	
	/**
	 * ϵͳ��������Ŀ�ʼʱ��ͽ���ʱ�䷵��һ���־û�����ϼ�(��ⵥ)
	 * ���������ѯ
	 * @author YangGuan
	 *
	 */
	public ArrayList<InBillsPO> getInBill(int start , int end) throws RemoteException;
	
	
	/**
	 * ϵͳ���ɽ�ֹ�㲢���ص���òֿ�����ķ����Ľ�ֹ��֮ǰ�ĳ־û����󼯺ϣ���ⵥ��
	 * ���������̵�
	 * @author YangGuan
	 *
	 */
	public ArrayList<InBillsPO> getBill(String division) throws RemoteException;
	
}
