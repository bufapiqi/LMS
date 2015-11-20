package dataservice.financedataservice;

import java.util.ArrayList;

import po.documentsPO.ReceiptPO;

public interface GetReceivablesBillsDataSer {
	
	
	
	/**
	 * ϵͳ���������Ӫҵ����ź����ڷ���
	 * ������һ���־û����󼯺ϣ���Ӫҵ�����տ���ϣ�
	 * ���ڽ������
	 * @author YangGuan
	 *
	 */
	public ArrayList<ReceiptPO> Receivables(String selling, String date);
	
	
	/**
	 * ϵͳ���ɵ�ǰ���ڵĽ�ֹ�㲢���������Ӫҵ����ŷ���
	 * ��Ӫҵ����ֹ����ǰ�־û����󼯺ϣ������տ���ϣ�
	 * ���ڳɱ������
	 * @author YangGuan
	 *
	 */
	public ArrayList<ReceiptPO> getReceivables(String selling,String date);
	
	/**
	 *ϵͳ���������Ӫҵ����ź����ڶη���һ���־û����󼯺ϣ��տ��
	 * ���ھ�Ӫ�����
	 * @author YangGuan
	 *
	 */
	public ArrayList<ReceiptPO> getAllReceivables(String selling,String start , String end);
}
