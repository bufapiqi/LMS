package dataservice.financedataservice;

import java.util.ArrayList;

import po.documentsPO.PaymentPO;

public interface GetAllPayDataSer {
	
	/**
	 * ϵͳ���ɵ�ǰ���ڵĽ�ֹ�㲢���������Ӫҵ����ŷ���
	 * ��Ӫҵ����ֹ����ǰ�־û����󼯺ϣ����и�����ϣ�
	 * ���ڳɱ������
	 * @author YangGuan
	 *
	 */
	public ArrayList<PaymentPO> getPay(String selling,String date);
	
	
	/**
	 * ϵͳ���������Ӫҵ����ź����ڶη���һ���־û����󼯺ϣ������
	 * ���ھ�Ӫ�����
	 * @author YangGuan
	 *
	 */
	public ArrayList<PaymentPO> getAllPay(String selling,String start, String end);
}
