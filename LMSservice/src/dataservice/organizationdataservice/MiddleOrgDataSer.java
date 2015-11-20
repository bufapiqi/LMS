package dataservice.organizationdataservice;

import java.rmi.Remote;

import po.orgPO.MiddleOrgPO;


public interface MiddleOrgDataSer extends Remote{
	/**
	 * ���ҵ��Ա�б�
	 * @return ҵ��Ա��ID+name�б�
	 */
	public String[] getBussinessmanList();
	
	/**
	 * ����һ��ҵ��Ա
	 * @param ID �����ӵ�ҵ��Ա�˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addBussinessman(long ID);
	
	/**
	 * ɾ��һ��ҵ��Ա
	 * @param ID Ҫɾ����ҵ��Ա���˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeBussinessman(long ID);

	/**
	 * ��òֿ����Ա�б�
	 * @return �ֿ����Ա��ID+name�б�
	 */
	public String[] getStorgerList();
	/**
	 * ����һ���ֿ����Ա
	 * @param ID �����ӵ�ҵ��Ա�˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addStorger(long ID);
	
	/**
	 * ɾ��һ���ֿ����Ա
	 * @param ID Ҫɾ���Ĳֿ����Ա���˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeStorger(long ID); 
	
	/**
	 * �����ϽӪҵ���б�
	 * 
	 * ע�⣺��ת����û������Ӫҵ�����ܣ���Ҫͨ���½�Ӫҵ��ʱѡ��������ת����ʵ�֣����BussinessOrgDataSer.addBussinessHall(BussinessOrgVO vo)
	 * ��ת����Ҳû��ɾ��Ӫҵ�����ܣ���Ҫͨ��ɾ��Ӫҵ��ʱʵ�֣����BussinessOrgDataSer.removeBussinessHall(BussinessOrgVO vo)
	 * @return city+codeNumber�б�
	 */
	public String[] getBussinessHallList();
	
	
	/**
	 * ���ػ���������Ϣ�������кͱ��
	 * @return city+codeNumber
	 */
	
	public String GetInfo();
	
	/**
	 * �޸���ת�������ڳ���    
	 * �޸ĺ�Ҫ��ɾ��ԭ�г������������ڵĳ���
	 * @param city ���޸ĵĳ���
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean changeCity(String city);
	
	/**
	 * ����һ����ת����
	 * @param vo ����������ת���Ļ�����Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addMiddleOrg(MiddleOrgPO po);
	
	/**
	 * ɾ��һ����ת����
	 * 
	 * ע��û�������޸Ļ�����Ϣ�ķ����ɣ������ĳ��кͱ�Ų����޸ģ��޸Ļ���ͨ������ҵ��Ա���ֿ����Ա����Ͻ��������
	 * @param codeNumber ��ɾ������ת���ĵĻ������
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeMiddleOrg(String codeNumber);
	

}