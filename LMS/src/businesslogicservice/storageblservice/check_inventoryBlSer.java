package businesslogicservice.storageblservice;

import java.util.ArrayList;

import vo.storageVO.*;

public interface check_inventoryBlSer {
	
	/**
	 * ϵͳ��������Ŀ�ʼʱ��ͽ���ʱ�䷵�ظ�ʱ��ο���¼������
	 * @author YangGuan
	 *
	 */
	public ArrayList<SimpleInDepotInfVO>  check(int start,int end);
	
	
	
	/**
	 *ϵͳ�������ɵĽ�ֹ�㷵�ذ������������Ϣ�ļ���
	 * @author YangGuan
	 *
	 */
	public ArrayList<InDepotInfVO> inventory();
}
