package businesslogicservice.organizationblservice;

import vo.orgVO.BussinessOrgVO;
import vo.orgVO.DriverVO;
import vo.orgVO.VehicleVO;



public interface BussinessOrgBLSer {
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
	 * @return �ֿ����Ա��ID+name�б�
	 */
	public String[] getCourierList(String ID);
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
	public VehicleVO getVehicleInfo(String ID, String codeVehicle);
	
	/**
	 * ����һ��������Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param vo ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 * 
	 * @return 
	 */
	public boolean addVehicle(String ID, VehicleVO vo);
	
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
	 * @param vo ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean changeVehicle(String ID, VehicleVO vo);
		
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
	public DriverVO getDriverInfo(String ID, String codeDriver);
	
	/**
	 * ����һ��˾����Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param vo ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 * 
	 * @return 
	 */
	public boolean addDriver(String ID, DriverVO vo);
	
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
	 * @param vo ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean changeDriver(String ID, DriverVO vo);
	
	/**
	 * ����һ��Ӫҵ��
	 * @param ID ������ת����-Ӫҵ�����
	 * @param vo ����Ӫҵ����ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addBussinessHall(String ID, BussinessOrgVO vo);
	
	/**
	 * ɾ��Ӫҵ��
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeNumber Ӫҵ����� 3λ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeBussinessHall(String ID, String codeNumber);
	
	/**�˷����Ѿ������壬���ؿ���ʵ��
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
	
	/**�˷����������壬���ؿ���ʵ��
	 * ��û���������Ϣ�������кͱ��
	 * @return ����+���
	 */
	public String getInfo();
	
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
