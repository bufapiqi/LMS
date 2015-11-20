package dataservice.transportationdataservice;

import po.transpotationPO.RoutePO;



public interface TransportationDataSer {

	/**
	 * �޸Ķ�Ӧ��·�ľ��볣��
	 * @param RoutePO �޸ĺ��·��
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean updateDistance(RoutePO route);
	
	/**
	 * ���³ɱ�����
	 * @param type �ɱ��������� 1����· 2������· 3�������
	 * @param int �޸ĺ�ĳɱ�����
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean updateCost(int type, double cost);
	
	/**
	 * ��óɱ�����
	 * @param type �ɱ��������� 1����· 2������· 3�������
	 * 
	 * @return int �ɱ�����
	 * 
	 */
	public double findCost(int type);
	
	/**
	 * ����һ��·��
	 * @param RoutePO �����ӵ�·��
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean insertRoute(RoutePO route);
	
	/**
	 * ��ö�Ӧ��·�ľ��볣��
	 * @param line ��ѯ����·
	 * @return int,���볣��
	 * 
	 */
	public double findDistance(String line);
	
	/**
	 * ��ó�ѡ��ĳ���֮��ĳ����б�
	 * @param String city ѡ��ĳ���
	 * @return String[] �����б�
	 */
	public String[] findCityList(String city);
	
	
	/**
	 * �����г����б�����һ������
	 * @param city �����ӵĳ���
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 */
	public boolean insertCity(String city);
	
	/**
	 * �����г����б�ɾ��һ������
	 * @param city ��ɾ���ĳ���
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeCity(String city);
	
}
