package businesslogicservice.financeblservice;

import java.util.ArrayList;

import vo.documentsVO.PaymentVO;

public interface GetAllPayBlSer {
	
	
	/**
	 * ϵͳ���ɵ�ǰ���ڵĽ�ֹ�㲢���������Ӫҵ�����
	 * ���ظ�Ӫҵ����ֹ����ǰ�����и������
	 * @author YangGuan
	 *
	 */
	public ArrayList<PaymentVO> getAllPay(String selling);
	
	/**
	 *ϵͳ������������ڶκ�Ӫҵ��������Ӧ�ĸ������
	 * @author YangGuan
	 *
	 */
	public ArrayList<PaymentVO> getAllPay(String selling,String start, String end);
	
}
