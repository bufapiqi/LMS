package dataservice.financedataservice;

import java.util.ArrayList;

import po.financePO.*;

public interface ProfitListDataSer {
	
	/**
	 *ϵͳ���������ʱ�䷵��һ���־û����󼯺ϣ��ɱ������¼)
	 *���ڳɱ������
	 * @author YangGuan
	 *
	 */
	public ArrayList<ProfitPO> ProList(String date);
}
