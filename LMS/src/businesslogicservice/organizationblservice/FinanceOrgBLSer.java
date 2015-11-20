package businesslogicservice.organizationblservice;

/**
 * @author YangHua'an
 *
 */

public interface FinanceOrgBLSer {
	
	/**
	 * ���ز�����Ա�б�
	 * @return ������ԱID+name�б�
	 */
	public String[] getFinancersList();
	
	/**
	 * ����һ��������Ա
	 * @param ID ���ӵĲ�����Ա�ı��
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addFinancer(long ID);
	
	/**
	 * ɾ��һ��������Ա
	 * @param ID Ҫɾ���Ĳ�����Ա���˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeFinancer(long ID);

}
