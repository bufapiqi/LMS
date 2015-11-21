package businesslogicservice.accountblservice;

import vo.accountVO.AccountNumberVO;


public interface AccountBLSer {
	

	/**
	 * �ṩ��Ϣ��֤-(������ת���ĳ���-�����ڳ���-������������-��ת���ı�ţ�-Ӫҵ����ţ�
	 * @param ID �˺�
	 * @param passwrd ����
	 * @return String ��Ϣ��֤���   int-(������ת���ĳ���-�����ڳ���-������������-��ת���ı�ţ�-Ӫҵ����ţ�
	 * 0�������
	 * 1������Ա
	 * 2����Ӫҵ��ҵ��Ա
	 * 3������ת����ҵ��Ա
	 * 4������ת���Ĳֿ����Ա
	 * 5���������Ա
	 * 6�����ܾ���
	 * 7����ϵͳ����Ա
	 * ���ӣ�1-�Ͼ�-��¥-Ӫҵ��-001-001  ��ʾ�Ͼ���¥Ӫҵ���Ŀ��Ա
	 *      3-�Ͼ�-��ת����-001  ��ʾ�Ͼ���ת���ĵ�ҵ��Ա
	 *      0 ��ʾ����
	 *      null��ʾ��֤ʧ��
	 */
	public String login(long ID,String password);
	
	/**
	 * ����һ���˺�
	 * @param ID �˺�
	 * @param vo �˺���ϸ��Ϣ
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean addAccount(long ID,AccountNumberVO vo);
	
	/**
	 * �޸��˺���Ϣ
	 * @param ID �˺�
	 * @param vo �˺���ϸ��Ϣ
	 * @return  ���ز����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean changeInfo(long ID,AccountNumberVO vo);
	
	/**
	 * ɾ��һ���˺���Ϣ
	 * @param ID �˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean deleteAccount(long ID);
	
	/**
	 * ���������ID��ͬ���˺ŵ�ID+name
	 * @param ID �˺�
	 * @return String ID+name
	 */
	public String[] getAccount(long ID);
	/**
	 * �����������ͬ�����ı��+�����б�
	 * @param name �˺�����
	 * @return String[],ID+name
	 * 
	 */
	public String[] getAccountList(String name);
	
	/**
	 * ����˺���ϸ��ϸ
	 * @param ID �˺�
	 * @return �˺���ϸ��Ϣ
	 */
	public AccountNumberVO getInfo(long ID);
	
	/**
	 * ������ڿ��е��˺�Ա���˺ź������б�
	 * @return ID+name�б�
	 * 
	 */
	public String[] getAccountList();
}
