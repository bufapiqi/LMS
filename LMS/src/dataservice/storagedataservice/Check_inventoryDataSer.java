package dataservice.storagedataservice;

import java.util.ArrayList;

import po.documentsPO.*;

public interface Check_inventoryDataSer {
	
	
	
	/**
	 * ϵͳ��������Ŀ�ʼʱ��ͽ���ʱ�䷵��һ���־û�����ϼ�(��ⵥ)
	 * ���������ѯ
	 * @author YangGuan
	 *
	 */
	public ArrayList<InBillsPO> getInBill(int start , int end);
	
	
	/**
	 * ϵͳ���ɽ�ֹ�㲢���ص���òֿ�����ķ����Ľ�ֹ��֮ǰ�ĳ־û����󼯺ϣ���ⵥ��
	 * ���������̵�
	 * @author YangGuan
	 *
	 */
	public ArrayList<InBillsPO> getBill(String division);
	
}
