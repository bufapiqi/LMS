package businesslogicservice.financeblservice;

import vo.financeVO.*;

public interface AddAccountBlSer {
	
	
	/**
	 * ϵͳ����һ����ʼ���õ�VO����
	 * �������һ���˻�����
	 * @author YangGuan
	 *
	 */
	public AccountVO addAccount(String name, double money);
}
