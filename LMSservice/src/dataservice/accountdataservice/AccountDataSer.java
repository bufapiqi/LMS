package dataservice.accountdataservice;

import po.accountPO.AccountInfoPO;



public interface AccountDataSer {
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
	public String campare(long ID,String password);
	
	/**
	 * ����һ���˺�
	 * @param ID �˺�
	 * @param po �˺���ϸ��Ϣ
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean insert(long ID,AccountInfoPO po);
	
	/**
	 * �޸��˺���Ϣ
	 * @param ID �˺�
	 * @param po �˺���ϸ��Ϣ
	 * @return  ���ز����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean update(long ID,AccountInfoPO po);
	
	/**
	 * ɾ��һ���˺���Ϣ
	 * @param ID �˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean delete(long ID);
	
	/**
	 * ���������ID��ͬ���˺ŵ���Ϣ
	 * @param ID �˺�
	 * @return �˺���Ϣ
	 */
	public AccountInfoPO find(long ID);
	/**
	 * ���������name��ͬ���˺ŵ�ID+name�б�
	 * @param name �˺�����
	 * @return String[],ID+name
	 * 
	 */
	public String[] find(String name);
	
	/**
	 * ������ڿ��е��˺�Ա���˺ź������б�
	 * @return ID+name�б�
	 * 
	 */
	public String[] find();
}


