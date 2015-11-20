package dataservice.organizationdataservice;

import po.orgPO.BussinessOrgPO;
import po.orgPO.DriverPO;
import po.orgPO.VehiclePO;


public interface BussinessOrgDataSer {

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
	 * ��ÿ��Ա�б�
	 * @return �ֿ����Ա��ID+name�б�
	 */
	public String[] getCourierList();
	/**
	 * ����һ�����Ա
	 * @param ID �����ӵ�ҵ��Ա�˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addCourier(long ID);
	
	/**
	 * ɾ��һ�����Ա
	 * @param ID Ҫɾ���Ĳֿ����Ա���˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeCourier(long ID); 
	
	/**
	 * ��ó����б�
	 * @return ���������б� ���б��+Ӫҵ�����+���
	 * 
	 */
	public String[] getVehicleList();
	
	/**
	 * ��ó�����ϸ��Ϣ
	 * @param codeVehicle �������� ���б��+Ӫҵ�����+���
	 * @return ������Ϣ
	 */
	public VehiclePO getVehicleInfo(String codeVehicle);
	
	/**
	 * ����һ��������Ϣ
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 * 
	 * @return 
	 */
	public boolean addVehicle(VehiclePO po);
	
	/**
	 * ɾ��һ��������Ϣ
	 * @param codeVehicle �������� ���б��+Ӫҵ�����+���
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeVehicle(String codeVehicle);
	
	/**
	 * �޸�һ��������Ϣ
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean changeVehicle(VehiclePO po);
		
	/**
	 * ���˾���б�
	 * @return ˾���б� ���б��+Ӫҵ�����+���
	 * 
	 */
	public String[] getDriverList();
	
	/**
	 * ���˾����ϸ��Ϣ
	 * @param codeDriver �������� ���б��+Ӫҵ�����+���
	 * @return ˾����Ϣ
	 */
	public DriverPO getDriverInfo(String codeDriver);
	
	/**
	 * ����һ��˾����Ϣ
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 *
	 */
	public boolean addDriver(DriverPO po);
	
	/**
	 * ɾ��һ��˾����Ϣ
	 * @param codeDriver ������� ���б��+Ӫҵ�����+���
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeDriver(String codeDriver);
	
	/**
	 * �޸�һ��˾����Ϣ
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean changeDriver(DriverPO po);
	
	/**
	 * ����һ��Ӫҵ��
	 * @param po ����Ӫҵ����ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addBussinessHall(BussinessOrgPO po);
	
	/**
	 * ɾ��Ӫҵ��
	 * @param codeNumber Ӫҵ����� 3λ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeBussinessHall(String codeNumber);
	
	/**
	 * ���Ӫҵ��������ת���ı��
	 * @return codeNumber ��ת���ı��
	 */
	public String getCodeNumber();
	
	/**
	 * �޸�Ӫҵ��������ת���ı��
	 * �޸ĺ�Ҫ���»��Ӫҵ����ţ�Ҫ�޸�Ӫҵ�����
	 * @param codeNumberOfMiddle ������ת���ı��
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean changeCodeNumberOfMiddle(String codeNumberOfMiddle);
	
	/**
	 * ��û���������Ϣ�������кͱ��
	 * @return ����+���
	 */
	public String getInfo();
	
	/**
	 * �޸�Ӫҵ�����ڳ���/�ص㣨��С��
	 * @param city ���޸ĵĳ���
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	 public boolean changeCity(String city);
	 
	 /**
	  * �޸�Ӫҵ����ţ������ܾ������룬���Ǹı�������ת���ĺ�����ת�������ɵı��
	  * @param codeNumber ���޸ĵĻ������
	  * @return �����Ƿ�ɹ�����Ϣ
	  */
	 public boolean changeCodeNumber(String codeNumber);
	
}
