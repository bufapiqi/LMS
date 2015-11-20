package businesslogicservice.financeblservice;

import java.util.ArrayList;

import vo.documentsVO.ReceiptVO;

public interface GetReceivablesBillsBlSer {
	
	
	/**
	 * ϵͳ���������Ӫҵ����ź����ڷ��ظ����ڸ�Ӫҵ�����տ����
	 * @author YangGuan
	 *
	 */
	public ArrayList<ReceiptVO> getReceivables(String selling, String date);
	
	
	
	
	/**
	 * ϵͳ���ɵ�ǰ���ڵĽ�ֹ�㲢���������Ӫҵ�����
	 * ���ظ�Ӫҵ����ֹ����ǰ�������տ����
	 * @author YangGuan
	 *
	 */
	public ArrayList<ReceiptVO> getAllReceivables(String selling);
	
	
	/**
	 *ϵͳ������������ڶκ�Ӫҵ��������Ӧ���տ����
	 *���ھ�Ӫ�����
	 * @author YangGuan
	 *
	 */
	public ArrayList<ReceiptVO> getSomeReceivables(String selling,String start , String end);
}
