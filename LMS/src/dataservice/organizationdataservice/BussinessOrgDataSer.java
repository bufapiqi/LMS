package dataservice.organizationdataservice;

import po.orgPO.BussinessOrgPO;
import po.orgPO.DriverPO;
import po.orgPO.VehiclePO;


public interface BussinessOrgDataSer {

	/**
	 * ���ҵ��Ա�б�
	 * @param ID ������ת����-Ӫҵ�����
	 * @return ҵ��Ա��ID+name�б�
	 */
	public String[] getBussinessmanList(String ID);
	
	/**
	 * ����һ��ҵ��Ա
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID �����ӵ�ҵ��Ա�˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addBussinessman(String ID, long bID);
	
	/**
	 * ɾ��һ��ҵ��Ա
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID Ҫɾ����ҵ��Ա���˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeBussinessman(String ID, long bID);

	/**
	 * ��ÿ��Ա�б�
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID ��һ����
	 * @return �ֿ����Ա��ID+name�б�
	 */
	public String[] getCourierList(String ID, long bID);
	/**
	 * ����һ�����Ա
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID �����ӵ�ҵ��Ա�˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addCourier(String ID, long bID);
	
	/**
	 * ɾ��һ�����Ա
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID Ҫɾ���Ĳֿ����Ա���˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeCourier(String ID, long bID); 
	
	/**
	 * ��ó����б�
	 * @param ID ������ת����-Ӫҵ�����
	 * @return ���������б� ���б��+Ӫҵ�����+���
	 * 
	 */
	public String[] getVehicleList(String ID);
	
	/**
	 * ��ó�����ϸ��Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeVehicle �������� ���б��+Ӫҵ�����+���
	 * @return ������Ϣ
	 */
	public VehiclePO getVehicleInfo(String ID, String codeVehicle);
	
	/**
	 * ����һ��������Ϣ
	 * @param ID ��������ת����-Ӫҵ�����
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 * 
	 * @return 
	 */
	public boolean addVehicle(String ID, VehiclePO po);
	
	/**
	 * ɾ��һ��������Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeVehicle �������� ���б��+Ӫҵ�����+���
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeVehicle(String ID, String codeVehicle);
	
	/**
	 * �޸�һ��������Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean changeVehicle(String ID, VehiclePO po);
		
	/**
	 * ���˾���б�
	 * @param ID ������ת����-Ӫҵ�����
	 * @return ˾���б� ���б��+Ӫҵ�����+���
	 * 
	 */
	public String[] getDriverList(String ID);
	
	/**
	 * ���˾����ϸ��Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeDriver �������� ���б��+Ӫҵ�����+���
	 * @return ˾����Ϣ
	 */
	public DriverPO getDriverInfo(String ID, String codeDriver);
	
	/**
	 * ����һ��˾����Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 *
	 */
	public boolean addDriver(String ID, DriverPO po);
	
	/**
	 * ɾ��һ��˾����Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeDriver ������� ���б��+Ӫҵ�����+���
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeDriver(String ID, String codeDriver);
	
	/**
	 * �޸�һ��˾����Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean changeDriver(String ID, DriverPO po);
	
	/**
	 * ����һ��Ӫҵ��
	 * @param ID ������ת����-Ӫҵ�����
	 * @param po ����Ӫҵ����ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addBussinessHall(String ID, BussinessOrgPO po);
	
	/**
	 * ɾ��Ӫҵ��
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeNumber Ӫҵ����� 3λ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeBussinessHall(String ID, String codeNumber);
	
	/**ע�⣬�˷����Ѿ������壬���ؿ��Ǿ���ʵ��
	 * ���Ӫҵ��������ת���ı��
	 * @return codeNumber ��ת���ı��
	 */
	public String getCodeNumber();
	
	/**
	 * �޸�Ӫҵ��������ת���ı��
	 * �޸ĺ�Ҫ���»��Ӫҵ����ţ�Ҫ�޸�Ӫҵ�����
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeNumberOfMiddle ������ת���ı��
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean changeCodeNumberOfMiddle(String ID, String codeNumberOfMiddle);
	
	/**
	 * ��û���������Ϣ�������кͱ��
	 * @param ID ������ת����-Ӫҵ�����
	 * @return ����+���
	 */
	public String getInfo(String ID);
	
	/**
	 * �޸�Ӫҵ�����ڳ���/�ص㣨��С��
	 * @param ID ������ת����-Ӫҵ�����
	 * @param city ���޸ĵĳ���
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	 public boolean changeCity(String ID, String city);
	 
	 /**
	  * �޸�Ӫҵ����ţ������ܾ������룬���Ǹı�������ת���ĺ�����ת�������ɵı��
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeNumber ���޸ĵĻ������
	  * @return �����Ƿ�ɹ�����Ϣ
	  */
	 public boolean changeCodeNumber(String ID, String codeNumber);
	
}
