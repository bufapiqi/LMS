package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.documentsPO.PaymentPO;

public interface GetAllPayDataSer extends Remote{
	
	/**
	 * ϵͳ���ɵ�ǰ���ڵĽ�ֹ�㲢���������Ӫҵ����ŷ���
	 * ��Ӫҵ����ֹ����ǰ�־û����󼯺ϣ����и�����ϣ�
	 * ���ڳɱ������
	 * @author YangGuan
	 *
	 */
	public ArrayList<PaymentPO> getPay(String date) throws RemoteException;
	
	
	/**
	 * ϵͳ���������Ӫҵ����ź����ڶη���һ���־û����󼯺ϣ������
	 * ���ھ�Ӫ�����
	 * @author YangGuan
	 *
	 */
	public ArrayList<PaymentPO> getAllPay(String start, String end) throws RemoteException;
}
